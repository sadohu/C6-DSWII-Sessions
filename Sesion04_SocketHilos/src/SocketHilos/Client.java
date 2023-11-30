package SocketHilos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
	private static final int BUFFER_SIZE = 8192;

	public static void main(String[] args) {
		byte[] data = new byte[BUFFER_SIZE];
		
		DataInputStream inputStream = null;
		DataOutputStream outputStream = null;
		Socket socket = null;
		long fileSize = -1;
		
		try {
			// Conexion con el servidor
			socket = new Socket("localhost", 1244);
			
			// Enviar un mensaje por consola
			System.out.println("Conectado con " + socket.getRemoteSocketAddress());
			
			// Obtenemos los flujos
			inputStream = new DataInputStream(socket.getInputStream());
			outputStream = new DataOutputStream(socket.getOutputStream());
			
			// Preparamos el nombre del archivo que deseamos
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduce el nombre del Archivo: ");
			String srtFile = scanner.nextLine();
			srtFile = new String(srtFile.getBytes(), StandardCharsets.UTF_8);
			
			// Enviamos el nombre del archivo
			outputStream.writeUTF(srtFile);
			
			// Recibimos el tamaño del archivo
			fileSize = inputStream.readLong();
			
			// Validamos la existencia
			if(fileSize != -1){
				// Abrimos el archivo para escribir los bytes que recibiremos posteriormente
				DataOutputStream serverFile = 
					new DataOutputStream(
						new FileOutputStream(
								new File("E:\\Files\\C6-DSWII\\SocketThread\\Client\\" + srtFile)));
				int bytesReceived = 0;
				while(fileSize > 0 && (bytesReceived = inputStream.read(data, 0, BUFFER_SIZE)) > 0){
					// Escribimos la data recibida
					serverFile.write(data, 0, bytesReceived);
					System.out.println(bytesReceived);
				}
				System.out.println("Archivo recibido correctamente");
				serverFile.close();
			} else {
				System.out.println("El archivo solicitado no existe");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Conexión con el servidor cerrada.");
			if(fileSize != 0)
				System.out.println("No se ha realizado la recepción del fichero correctamente");
		} finally {
			try {
				if(inputStream != null)
					inputStream.close();
				if(outputStream != null)
					outputStream.close();
				if(socket != null)
					socket.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar conexiones.");
			}
		}
		

	}

}
