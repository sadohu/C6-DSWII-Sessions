package HilosSincronizacion;

public class ClassThreadSyncVIII extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.println("C");
			try {
				ClassThreadSyncVIII.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
