package HilosSincronizacion;

public class ClassThreadSincronizacionVIII extends Thread {
	
	@Override
	public void run(){
		
		//aplicamos un bucle for...
		for(int a=1;a<=8;a++){
			//imprimimos por pantalla
			System.out.println("C");
			
			try {
				ClassThreadSincronizacionVIII.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del catch.....
		}  //fin del bucle for....
		
	}   //fin del metodo run...

}  //fin de la clase....
