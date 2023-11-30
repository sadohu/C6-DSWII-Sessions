package SocketHilos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClassThreadClient extends Thread{
	private Socket client = null;
	private DataOutputStream outputStream;
	private DataInputStream inputStream;
	private boolean stop = false;
	private static final int BUFFER_SIZE = 8194;
	
	public ClassThreadClient(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		// Obtenemos los flujos
		try {
			outputStream = new DataOutputStream(this.client.getOutputStream());
			inputStream = new DataInputStream(this.client.getInputStream());
			// Crear un buffer
			byte[] data = new byte[BUFFER_SIZE];
			while(!this.stop){
				// Leer el archivo que el servidor enviará
				String strFile = inputStream.readUTF();
				
				// Imprimimos un mensaje
				System.out.println("El cliente " + this.client.getLocalAddress() + " ha solicitado el archivo: " + strFile);
				
				// Obtenemos la ruta del archivo
				File file = new File("E:\\Files\\C6-DSWII\\SocketThread\\Server\\" + strFile);
				
				// Validación para conocer su existencia del archivo
				if(file.exists()){
					long fileSize = file.length();
					int bytesRead;
					
					// Enviar tamaño del archivo
					outputStream.writeLong(fileSize);
					
					DataInputStream fileInput = new DataInputStream(new FileInputStream(file));
					while((bytesRead = fileInput.read(data, 0, BUFFER_SIZE)) > 0){
						outputStream.write(data, 0, bytesRead);
					}
					
					System.out.println("Fichero enviado correctamente.");
					fileInput.close();
				}else{
					outputStream.writeLong(-1);
				}
				
			}
		} catch (IOException e) {
			System.out.println("Conexión con el cliente " + client.getRemoteSocketAddress() + " cerrada.");
			e.printStackTrace();
		} finally {
			System.out.println("Thread finished.");
		}
	}
	
	public void stopThread(){
		stop = true;
		try {
			if(outputStream != null)
				outputStream.close();
			
			if(inputStream != null)
				inputStream.close();
			
			if(client != null)
				client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
