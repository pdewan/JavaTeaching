package lectures.animation.threads.wait_notify.lock;

import lectures.animation.threads.ui.AConcurrentShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;

/**
 * 
 * This class illustrates various ways to use shared locks.
 * Study the code
 *
 */
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
//		lock2.releaseLock();
	}
	@Override
	protected void animateXFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
//		lock2.getLock();
		super.animateXFromOrigin(shuttle, animationStep, animationPauseTime, startY, endY);
//		lock2.releaseLock();
	}
	
}
/*
 * 
 * Uncomment the lock2 calls in animateXFromOrigin.
 * 
 * When animateXFromOrigin() uses lock2,  the three animators
 * (a) run serially,  that is, while one animator is executing, other animators wait.
 * (b) animate in the Y direction serially, that while one animator is animating
 * in the Y direction, the other animators do not animate in the Y direction.
 * (c) animate in the X and Y direction serially, that is while one animator is 
 * animating in the X (Y) direction, the other animators do not animate in the X (Y)
 * direction.
 * (c) run without any coordination.
 * 
 *  A deadlock occurs when there are at least two threads that have that are waiting for the other
 *  to release a lock, that is, each thread is waiting for the other to release a lock.
 *  
 *  (T/F) A deadlock occurs when two locks are used 
 * 
 * Comment out the lock1.releaseLock() call in animateYFromOrigin.
 * 
 * What do you think will happen?
 * 
 * Run the main program.
 * 
 * If releaseLock() is not executed on lock1, then the number of animations that
 *  complete are:
 *  (a) one
 *  (b) two
 *  (c) three
 *  (d) zero
 * 
 *  If releaseLock() is not executed on lock1, then the number of animations that
 *  start are:
 *  (a) one
 *  (b) two
 *  (c) three
 *  (d) zero
 *  
 * 
 * Uncomment the lock2.releaseLock() call in animateYFromOrigin(), while keeping
 * lock1.releaseLock() commented.
 * 
 * What do you think will happen?
 * 
 * Run the main program:
 * 
 * (T/F) A notify() call on object A does not effect wait() calls on object B.
 * 
 * Swap the two releaseLock() calls so we are back to the original state.
 * 
 * Comment out the lock2.releaseLock() call in animateXFromOrigin.
 * 
 * What do you think will happen?
 * 
 * Run the main program.
 * 
 * If releaseLock() is not executed on lock2, then the number of animations that
 *  complete are:
 *  (a) one
 *  (b) two
 *  (c) three
 *  (d) zero
 * 
 *  If releaseLock() is not executed on lock2, then the number of animations that
 *  start are:
 *  (a) one
 *  (b) two
 *  (c) three
 *  (d) zero
 * 
 *  (T/F) A deadlock occurs if releaseLock() is not executed on lock1.
 *  
 *  (T/F) A deadlock occurs if releaseLock() is not executed on lock2.
 *

 */
