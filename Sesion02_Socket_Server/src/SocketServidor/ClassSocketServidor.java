package SocketServidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClassSocketServidor {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			// Nuevo objeto server y especificamos el puerto
			ServerSocket server = new ServerSocket(4500);
			print("Servivor a escucha de peticiones.");
			
			// Aceptamos la petición externa
			Socket client = server.accept();
			
			ObjectInputStream requets = new ObjectInputStream(client.getInputStream());
			print("Requets recibido");
			
			String message = (String) requets.readObject();
			print("Mensaje desde el cliente " + message);
			
			// Salida desde el servidor
			ObjectOutputStream response = new ObjectOutputStream(client.getOutputStream());
			
			response.writeObject("Hola cliente");

			client.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void print(Object object){
		System.out.println("\n\n======================");
		System.out.println(object);
		System.out.println("======================\n\n");
	}

}
