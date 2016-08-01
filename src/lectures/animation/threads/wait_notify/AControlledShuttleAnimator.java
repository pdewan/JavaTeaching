package lectures.animation.threads.wait_notify;

import lectures.animation.threads.ui.AConcurrentShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;

public class AControlledShuttleAnimator extends AConcurrentShuttleAnimator {
	BasicLock lock;
	public AControlledShuttleAnimator(PlottedShuttle theShuttle, BasicLock aLock) {
		super(theShuttle);
		lock = aLock;
	}
	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
		lock.getLock(); 
		super.animateYFromOrigin(shuttle, animationStep, animationPauseTime, startY, endY);
		lock.releaseLock();
	}
}
