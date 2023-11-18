package HilosSincronizacion;

public class ClassThreadSincronizacionV  extends Thread{
	
	@Override
	public void run(){
		//aplicamos un bucle for...
		for(int n=1;n<=8;n++){
			//imprimimos por pantalla
			System.out.print("R");
			try {
				ClassThreadSincronizacionV.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //fin del try catch...
			
		}  //fin del bucle for....
		
	}  //fin del metodo run...

}  //fin de la clase...
