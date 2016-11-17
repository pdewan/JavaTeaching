package lectures.animation.threads.wait_notify.lock;

public interface Lock {
	public void getLock();
	public void releaseLock();	
	public boolean isLocked() ;

}
