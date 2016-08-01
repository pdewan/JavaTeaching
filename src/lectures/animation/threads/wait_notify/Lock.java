package lectures.animation.threads.wait_notify;

public interface Lock {
	public void getLock();
	public void releaseLock();	
	public boolean isLocked() ;

}
