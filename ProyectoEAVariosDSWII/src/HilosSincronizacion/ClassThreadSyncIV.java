package HilosSincronizacion;

public class ClassThreadSyncIV extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.print("E");
			try {
				ClassThreadSyncIV.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
