package HilosSincronizacion;

public class ClassThreadSincronizacionI extends Thread{

	@Override
	public void run(){
		//aplicamos un bucle de 8
		for(int z=1;z<=8;z++){
			//imprimimos mensaje por consola...
			System.out.print(z +"C");
			
		//aplicamos el metodo de retardo (sleep)
			try {
				ClassThreadSincronizacionI.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //find el catch....
			
		}  //fin del bucle for...
		
	}   //fin del metodo run....
	
	
} //fin de la clase ....
