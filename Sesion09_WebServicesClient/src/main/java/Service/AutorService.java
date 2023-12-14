package Service;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.Autor;

public class AutorService {
	
	public List<Autor> autores() throws JsonParseException, JsonMappingException, IOException{
		// Set Interfaces
		Response response = null;
		WebTarget webTarget;
		Client client = ClientBuilder.newClient();
		ObjectMapper objectMapper = new ObjectMapper();
		
		// Set response variables
		List<Autor> autores = null;
		String responseJson = null;
		
		// Implementation
		webTarget = client.target("http://localhost:8080/Sesion08_WebServices/App/biblioteca/autores");
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		response = invocationBuilder.get();
		
		// Validation: Ok Status
		if(response.getStatus() != 200)
			System.out.println("Out of Range");
		
		// Read values and set into Return Object
		responseJson = response.readEntity(String.class);
		autores = objectMapper.readValue(responseJson, new TypeReference<List<Autor>>() {});
		return autores;
	}
	
	public void saveAutor(Autor autor){
		// Set interaces
		Client client = ClientBuilder.newClient();
		WebTarget webTarget;
		Response response = null;
		
		// Implementation
		webTarget = client.target("http://localhost:8080/Sesion08_WebServices/App/biblioteca/autor");
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		response = invocationBuilder.post(Entity.entity(autor, MediaType.APPLICATION_JSON));
		
		// Validation: Ok Status
		if(response.getStatus() != 201)
			System.out.println("Error al crear el autor: " + response.getStatus());
			
		System.out.println("Autor creado exitosamente.");
	}
}
