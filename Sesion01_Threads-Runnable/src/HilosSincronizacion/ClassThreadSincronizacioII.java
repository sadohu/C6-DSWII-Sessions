package HilosSincronizacion;

public class ClassThreadSincronizacioII extends Thread {
	
	@Override
	public void run(){
			//aplicamos un bucle para 8
		for(int m=1;m<=8;m++){
			
			//imprimimos por pantalla
			System.out.print("I");
			//aplicamos el metodl sleep
			try {
				ClassThreadSincronizacioII.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   //fin del catch...
		}   //fin del bucle for...
		 
	}  //fin del void run...

} //fin de la clase ....
