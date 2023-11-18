package HilosSincronizacion;

public class ClassThreadSyncVII extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.print("E");
			try {
				ClassThreadSyncVII.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}