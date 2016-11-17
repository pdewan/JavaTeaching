package lectures.animation.threads.wait_notify.lock;

import lectures.animation.threads.ui.AConcurrentShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;

public class AControlledShuttleAnimator extends AConcurrentShuttleAnimator {
	Lock lock1;
	Lock lock2;
	public AControlledShuttleAnimator(PlottedShuttle theShuttle, 
			Lock aLock1, Lock aLock2) {
		super(theShuttle);
		lock1 = aLock1;
		lock2 = aLock2;
	}
	
	@Override
	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
		lock1.getLock(); 
		super.animateYFromOrigin(shuttle, animationStep, animationPauseTime, startY, endY);
		lock1.releaseLock();
	}
	@Override
	protected void animateXFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
//		lock1.getLock(); 
		super.animateXFromOrigin(shuttle, animationStep, animationPauseTime, startY, endY);
//		lock1.releaseLock();
	}
}
