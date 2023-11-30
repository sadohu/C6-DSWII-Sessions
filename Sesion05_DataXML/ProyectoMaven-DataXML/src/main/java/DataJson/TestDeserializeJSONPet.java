package DataJson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;

public class TestDeserializeJSONPet {

	public static void main(String[] args) throws IOException {
		String fileRoute = "src/files/pet.json";
		Reader reader = Files.newBufferedReader(Paths.get(fileRoute));
		
		Gson gson = new Gson();
		Map<?, ?> petJson = gson.fromJson(reader, Map.class);
		System.out.println(petJson);
		System.out.println("idPet: " + petJson.get("codigo") 
				+ ", name: " + petJson.get("nombre")
				+ ", race: " + petJson.get("raza")
				+ ", color: " + petJson.get("colorpelaje")
				+ ", vaccine: " + petJson.get("nrovacunas")
				+ ", age: " + petJson.get("edad")
				+ ", weight: " + petJson.get("peso"));

	}

}
