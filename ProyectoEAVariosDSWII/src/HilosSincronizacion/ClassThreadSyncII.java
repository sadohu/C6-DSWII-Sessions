package HilosSincronizacion;

public class ClassThreadSyncII extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.println("Sync II: 	I");
			try {
				ClassThreadSyncII.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
