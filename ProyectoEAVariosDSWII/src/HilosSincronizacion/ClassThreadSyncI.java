package HilosSincronizacion;

public class ClassThreadSyncI extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i <= 8; i++){
			System.out.print(i + ": C");
			try {
				ClassThreadSyncI.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
