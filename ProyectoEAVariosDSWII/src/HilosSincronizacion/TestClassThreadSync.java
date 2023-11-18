package HilosSincronizacion;

public class TestClassThreadSync {

	public static void main(String[] args) throws InterruptedException {
		ClassThreadSyncI syncI = new ClassThreadSyncI();
		ClassThreadSyncII syncII = new ClassThreadSyncII();
		ClassThreadSyncIII syncIII = new ClassThreadSyncIII();
		ClassThreadSyncIV syncIV = new ClassThreadSyncIV();
		ClassThreadSyncV syncV = new ClassThreadSyncV();
		ClassThreadSyncVI syncVI = new ClassThreadSyncVI();
		ClassThreadSyncVII syncVII = new ClassThreadSyncVII();
		ClassThreadSyncVIII syncVIII = new ClassThreadSyncVIII();
		
		syncI.start();
		syncI.sleep(100);
		syncII.start();
		syncII.sleep(100);
		syncIII.start();
		syncIII.sleep(100);
		syncIV.start();
		syncIV.sleep(100);
		syncV.start();
		syncV.sleep(100);
		syncVI.start();
		syncVI.sleep(100);
		syncVII.start();
		syncVII.sleep(100);
		syncVIII.start();
		syncVIII.sleep(100);
		
		
		
	}

}
