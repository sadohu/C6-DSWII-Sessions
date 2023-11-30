package HilosSincronizacion;

public class ClassThreadSincronizacionIII extends Thread {
	
	@Override
	public void run(){
		//aplicamos un bucle for para 8
		for(int z=1;z<=8;z++){
			//imprimimos por pantalla
			System.out.print("B");
			try {
				ClassThreadSincronizacionIII.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del@ catch....
			
			
		}   //fin del metodo for...
		
		
	}   //fin del metodo run...

}  //fin de la clase.....
