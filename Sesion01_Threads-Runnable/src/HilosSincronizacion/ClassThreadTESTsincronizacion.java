package HilosSincronizacion;

public class ClassThreadTESTsincronizacion {

	public static void main(String[] args) throws InterruptedException {
		//realizamos la respectivas instancias....
		ClassThreadSincronizacionI hilo1=new ClassThreadSincronizacionI();
		ClassThreadSincronizacioII hilo2=new ClassThreadSincronizacioII();
		ClassThreadSincronizacionIII hilo3=new ClassThreadSincronizacionIII();
		ClassThreadSincronizacionIV hilo4=new ClassThreadSincronizacionIV();
		ClassThreadSincronizacionV hilo5=new ClassThreadSincronizacionV();
		ClassThreadSincronizacionVI hilo6=new ClassThreadSincronizacionVI();
		ClassThreadSincronizacionVII hilo7=new ClassThreadSincronizacionVII();
		ClassThreadSincronizacionVIII hilo8=new ClassThreadSincronizacionVIII();
		hilo1.start();
		hilo1.sleep(100);
		hilo2.start();
		hilo2.sleep(100);
		hilo3.start();
		hilo3.sleep(100);
		hilo4.start();
		hilo4.sleep(100);
		hilo5.start();
		hilo5.sleep(100);
		hilo6.start();
		hilo6.sleep(100);
		hilo7.start();
		hilo7.sleep(100);
		hilo8.start();
		hilo8.sleep(100);

	}   //fin del metodo principal...

}   //fin de la clase...