package SocketCliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClassCliente {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Socket client = new Socket("localhost", 4500);
			
			// Creamos la solicitud al servidor
			ObjectOutputStream request = new ObjectOutputStream(client.getOutputStream());
			request.writeObject("Hola servidor cual es la Capital de Perú?");
			
			// Recibimos la respuesta del servidor
			ObjectInputStream response = new ObjectInputStream(client.getInputStream());
			System.out.println("Recibimos respuesta");
			
			// Leemos la respuesta transformandolo en un String
			String message = (String) response.readObject();
			System.out.println("Desde el servidor: " + message);
			
			client.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
