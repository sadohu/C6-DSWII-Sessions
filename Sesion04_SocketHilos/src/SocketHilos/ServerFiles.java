package SocketHilos;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerFiles extends Thread{
	private int port;
	private boolean stop = false;
	
	public ServerFiles() {
	}

	public ServerFiles(int port){
		this.port = port;
	}
	
	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	

	public void stopServer(){
		this.stop = true;
	}

	@Override
	public void run() {
		ServerSocket server = null;
		try {
			// Servidor a la escucha
			server = new ServerSocket(this.port);
			System.out.println("Esperando petición en el puerto :" + this.port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	


	

}
