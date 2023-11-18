package ServidorTelnet;

public class TestServidorTelnet {

	public static void main(String[] args) {
		ServidorTelnet servidor = new ServidorTelnet();
		servidor.start();
		// Comando para iniciar la interacción (Recordar activar el telnet en windows)
		// CMD: telnet 127.0.0.1 9001
	}

}
