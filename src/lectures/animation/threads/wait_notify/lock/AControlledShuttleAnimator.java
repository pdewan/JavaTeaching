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
 * When animateXFromOrigin() uses lock2, the three animators
 * (a) run serially,  that is, while one animator is executing, other animators wait.
 * (b) animate only in the Y direction serially, that while one animator is animating
 * in the Y direction, the other animators do not animate in the Y direction.
 * (c) animate in the X and Y direction serially, that is while one animator is 
 * animating in the X (Y) direction, the other animators do not animate in the X (Y)
 * direction.
 * (c) run without any coordination.
 * 
 *  A deadlock occurs when there is a cycle of waiting among threads such that each thread
 *  is waiting on a lock held by another thread, and no lock can be released. For example,
 *  T1 holds lock L1 and is waiting on lock L2, but T2 holds L2 and is waiting on L1.
 *  
 * Note that just because a process waits forever does not mean that it is in a deadlock- it
 * may be just bad programming. Deadlock is one particular error created by a some specific
 * bad programming- one in which there is a cycle of threads waiting on each other.
 *  
 *  (T/F) A deadlock requires at least two locks to be used. 
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
 * Uncomment the lock2.releaseLock() call in animateYFromOrigin(), while keeping
 * lock1.releaseLock() commented out.
 * 
 * What do you think will happen?
 * 
 * Run the main program:
 * 
 
 * 
 * Swap the two releaseLock() calls, that is:
 * 
 * Comment out the lock2.releaseLock() call in animateXFromOrigin while
 * uncommenting the lock1.releaseLock() call.
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
 *  Is there a difference between the number of animations that start and finish when both
 *  locks are acquired? If so, can a thread get one lock without getting another?
 *  Based on these answers, what is the answer to the following:
 *  (T/F) A notify() call on object A does not affect wait() calls on object B.
 * 
 *  (T/F) A deadlock occurs if releaseLock() is not executed on lock1.
 *  
 *  (T/F) A deadlock occurs if releaseLock() is not executed on lock2.
 *

 */
