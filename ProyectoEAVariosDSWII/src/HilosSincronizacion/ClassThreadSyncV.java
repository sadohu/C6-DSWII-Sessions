package HilosSincronizacion;

public class ClassThreadSyncV extends Thread{
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.print("R");
			try {
				ClassThreadSyncV.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}