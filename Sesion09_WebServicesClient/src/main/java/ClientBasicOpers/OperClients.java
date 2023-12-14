package ClientBasicOpers;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class OperClients {

	public String identifyRomanNumber(int x, int y) {
		Response response = null;
		Client client = ClientBuilder.newClient();
		String romanNumber = null;
		String url = "http://localhost:8080/Sesion08_WebServices/App/Operaciones/Romanos?" + "num1=" + x + "&num2=" + y;

		try {
			WebTarget webTarget = client.target(url);
			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
			response = invocationBuilder.get();

			if (response.getStatus() != 200)
				System.out.println("Error en la solicitud");
			else
				romanNumber = response.readEntity(String.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (response != null)
				response.close();
		}

		return romanNumber;
	}
}
