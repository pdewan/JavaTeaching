package lectures.animation.threads.wait_notify;

public class ALock implements Lock {
	boolean locked;		
	@Override
	public synchronized void getLock() {
		if (locked) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		locked = true;
	}
	@Override
	public synchronized void releaseLock() {
		locked = false;
		notify();
	}
}
