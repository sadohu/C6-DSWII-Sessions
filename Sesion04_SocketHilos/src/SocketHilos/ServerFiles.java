package SocketHilos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFiles extends Thread {
	private int port;
	private boolean stop = false;

	public ServerFiles() {
	}

	public ServerFiles(int port) {
		this.port = port;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void stopServer() {
		this.stop = true;
	}

	@Override
	public void run() {
		ServerSocket server = null;
		try {
			// Servidor a la escucha
			server = new ServerSocket(this.port);
			System.out.println("Esperando petición en el puerto: " + this.port);

			// mientras no llamemos al metodo stopServer, recibiremos cliientes
			// y crearemos hilos para cada uno
			while (!this.stop) {
				// Aceptamos conexion externa
				Socket newClient = server.accept();
				// Creamos un hilo del cliente
				ClassThreadClient threadClient = new ClassThreadClient(newClient);
				threadClient.start();
			}

			// Cerrar el servidor, una vez se ordene parar
			server.close();
			System.out.println("Servidor cerrado...");
		} catch (IOException e) {
			System.out.println("Servidor cerrado por errores...");
			e.printStackTrace();
		} finally {
			// Cerrar el servidor por si se invoca al método parar
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
