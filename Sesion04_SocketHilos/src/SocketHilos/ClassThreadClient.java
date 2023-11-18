package SocketHilos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
