package lectures.animation.threads.wait_notify;

public interface BasicLock {
	public void getLock();
	public void releaseLock();	
	public boolean isLocked() ;

}
