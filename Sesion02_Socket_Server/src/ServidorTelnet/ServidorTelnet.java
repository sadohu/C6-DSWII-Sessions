package ServidorTelnet;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTelnet {
	ServerSocket server;
	Socket socket;
	int port = 9001;
	DataOutputStream response;
	BufferedReader request;
	
	public void start(){
		System.out.println("Esperando por conexión del cliente");
		try {
			server = new ServerSocket(port);
			socket = new Socket();
			socket = server.accept();
			request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String message = request.readLine();
			
			System.out.println("Mensaje del cliente: " + message);
			response = new DataOutputStream(socket.getOutputStream());
			response.writeUTF("Respuesta del servidor: " + message);
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
