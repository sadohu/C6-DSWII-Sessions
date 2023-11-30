package Hilos;

public class ClassThreadState extends Thread{
	
	@Override
	public void run(){
		int sumOdds = 0;
		
		for(int i = 0; i <= 10; i++){
			if(i % 2 != 0){
				System.out.println("Impares: " + i);
				sumOdds += i;
				try {
					ClassThreadState.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("La suma de los número impares es: " + sumOdds);
	}
}
