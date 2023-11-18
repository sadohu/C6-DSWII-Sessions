package HilosSincronizacion;

public class ClassThreadSyncVI extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.print("T");
			try {
				ClassThreadSyncVI.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}