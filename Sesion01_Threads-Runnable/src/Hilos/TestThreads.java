package Hilos;

public class TestThreads {

	public static void main(String[] args) {
		// Herencia Hilos Threads (Extends threads)
		ClassHerenciaHilos threadOdds = new ClassHerenciaHilos();
		// Implemenenta Hilos Runnable(Implements Runnable)
		Thread threadEvens = new Thread(new ClassInterfazHilos());

		threadOdds.start();
		threadEvens.start();
	}

}
