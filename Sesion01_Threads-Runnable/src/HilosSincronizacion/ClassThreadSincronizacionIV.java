package HilosSincronizacion;

public class ClassThreadSincronizacionIV  extends Thread{

	
	@Override
	public void run(){
		//aplicamos un bucle para 8
		for(int p=1;p<=8;p++){
			//imprimimos por pantalla
			System.out.print("E");
			try {
				ClassThreadSincronizacionIV.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   //fin del catch....
			
		}  //fin del bucle for...
		
	}   //fin del metodo run....
	
	
	
}  //fin de la clase...
