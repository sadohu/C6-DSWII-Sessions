package HilosSincronizacion;

public class ClassThreadSincronizacionVI  extends Thread{
	
	@Override
	public void run(){
		//aplicamos un bucle for...
		for(int g=1;g<=8;g++){
			//imprimimos por pantalla
			System.out.print("T");
			try {
				ClassThreadSincronizacionVI.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   //fin del catch...
			
		}  //fin del bucle for...
		
	}  //fin del metodo run...

}  //fin de la clase...
