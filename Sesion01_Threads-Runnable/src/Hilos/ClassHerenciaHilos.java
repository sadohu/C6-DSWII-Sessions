package Hilos;

public class ClassHerenciaHilos extends Thread{
	
	@Override
	public void run(){
		int sumOdds = 0;
		
		for(int i = 0; i <= 10; i++){
			if(i % 2 != 0){
				System.out.println("Impares: " + i);
				sumOdds += i;
			}
		}
		
		System.out.println("La suma de los n�mero impares es: " + sumOdds);
	}

} 
