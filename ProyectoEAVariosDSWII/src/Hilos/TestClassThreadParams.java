package Hilos;

public class TestClassThreadParams {

	public static void main(String[] args) {
		ClassThreadParams params = new ClassThreadParams("Hilo con números pares.");
		params.addParam(30);
		params.start();
	}

}
