package lectures.animation.threads.wait_notify;

import lectures.animation.threads.ui.AConcurrentShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;

public class AControlledShuttleAnimator extends AConcurrentShuttleAnimator {
	Lock lock;
	public AControlledShuttleAnimator(PlottedShuttle theShuttle, Lock aLock) {
		super(theShuttle);
		lock = aLock;
	}
	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
		lock.getLock();
		super.animateYFromOrigin(shuttle, animationStep, animationPauseTime, startY, endY);
		lock.releaseLock();
	}
}
