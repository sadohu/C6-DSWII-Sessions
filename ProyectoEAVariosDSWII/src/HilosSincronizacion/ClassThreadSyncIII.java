package HilosSincronizacion;

public class ClassThreadSyncIII extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.println("Sync III:	B");
			try {
				ClassThreadSyncIII.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
