package Hilos;

public class ClassThreadParams extends Thread{
	private int num;
	
	public ClassThreadParams(String nombre){
		super(nombre);
	}
	
	@Override
	public void run() {
		// Acumulador
		int sumEvens = 0;
		
		for(int i = 0; i <= num; i++){
			if(i % 2 == 0){
				System.out.println(i + " " + this.getName());
				sumEvens = sumEvens + i;
			}
		}
		System.out.println("Suma de números enteros pares: " + sumEvens);
	}
	
	public void addParam(int num){
		this.num = num;
	}
}
