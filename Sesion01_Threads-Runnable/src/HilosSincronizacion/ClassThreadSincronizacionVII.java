package HilosSincronizacion;

public class ClassThreadSincronizacionVII  extends Thread{
	
	@Override
	public void run(){
		//aplicamos un bucle for..
		for(int w=1;w<=8;w++){
			
			//imprimimos por pantallla
			System.out.print("E");
			try {
				ClassThreadSincronizacionVII.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del metodo catch....
			
		}  //fin del bucle for....
		
	}   //fin del metodo run...

}
