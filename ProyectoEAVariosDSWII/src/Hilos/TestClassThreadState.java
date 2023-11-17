package Hilos;

public class TestClassThreadState {

	public static void main(String[] args) throws InterruptedException {
		// Primer estado: Cuando se crea el objeto
		ClassThreadState state1 = new ClassThreadState();
		ClassThreadState state2 = new ClassThreadState();
		// Segundo estado: Cuando se inicia el hilo
		state1.start();
		// Tecer estado: Cuando se aplica el método sleep
		state1.sleep(2000);
		
		// ** Segundo estado: Para el hilo 2
		state2.start();
		// Cuarto estado: Cuando se aplica el método stop
		state2.stop();

	}

}
