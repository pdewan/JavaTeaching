package lectures.animation.threads.wait_notify;

import lectures.animation.threads.ui.AConcurrentShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;

public class AShuttleAnimatorGivingClearance extends AConcurrentShuttleAnimator {
	ClearanceManager sequencer;
	public AShuttleAnimatorGivingClearance(PlottedShuttle theShuttle, ClearanceManager aSequencer) {
		super(theShuttle);
		sequencer = aSequencer;
	}
	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
		super.animateYFromOrigin(shuttle, animationStep, animationPauseTime, startY, endY);
		sequencer.proceed();		
	}
//	public synchronized  void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime) {		
//		int originalX = shuttle.getShuttleX();
//		int originalY = shuttle.getShuttleY();
//		int curX = 0;
//		int curY = 0;
//		shuttle.setShuttleX(curX);
//		shuttle.setShuttleY(curY);
//		// make sure we don’t go past final Y position
//		System.out.println("Animation in Y Direction");
//		while (curY < originalY) {
//			ThreadSupport.sleep(animationPauseTime);
//			curY += animationStep;
//			shuttle.setShuttleY(curY);	
//		}			
//		// move to destination Y position
//		shuttle.setShuttleY(originalY);
//		sequencer.activityHasFinished();
//		while (curX < originalX) {
//			ThreadSupport.sleep(animationPauseTime);
//			curX += animationStep;
//			shuttle.setShuttleX(curX);	
//		}
//		shuttle.setShuttleX(originalX);
//		System.out.println("Animation Ended");
//	}
}
