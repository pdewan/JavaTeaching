package lectures.animation.loops;

import lectures.animation.threads_commands.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import bus.uigen.OEFrame;
public class AShuttleAnimator implements ShuttleAnimator {	
	public void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime) {		
		// Put a break point below.
		// When it is hit, determine which method is in the base of the stack in which the break occurs
		// Which is the method above this method in the stack and the one above that?
		// Which of these methods can take paramaters defined by the programmer?
		// Select one of the stopped threads, Press F8 and see its effect on shuttle animation
		int originalX = shuttle.getShuttleX();
		int originalY = shuttle.getShuttleY();
		int curX = 0;
		int curY = 0;
		shuttle.setShuttleX(curX);
		shuttle.setShuttleY(curY);
		animateYFromOrigin(shuttle, animationStep, animationPauseTime, curY, originalY);
		animateXFromOrigin(shuttle, animationStep, animationPauseTime, curX, originalX);
	}
	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
//		System.out.println("Animation in Y Direction");
		// make sure we don’t go past final Y position
		while (startY < endY) {
			
			ThreadSupport.sleep(animationPauseTime);
			startY += animationStep;
			shuttle.setShuttleY(startY);	
//			System.out.println (			
//					" Thread:" + Thread.currentThread() +
//					" Shuttle:" + shuttle +
//					" New Y " + startY );
		}			
		// move to destination Y position
		shuttle.setShuttleY(endY);
	}
	
	protected void animateXFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startX, int endX) {
//		System.out.println("Animation in X Direction");
		while (startX < endX) {
			ThreadSupport.sleep(animationPauseTime);
			startX += animationStep;
			shuttle.setShuttleX(startX);
//			System.out.println (			
//					" Thread:" + Thread.currentThread() +
//					" Shuttle:" + shuttle +
//					" New X " + startX );
		}
		shuttle.setShuttleX(endX);
//		System.out.println("Animation Ended");
	}
	
	
//	public void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, OEFrame frame) {		
//		int originalX = shuttle.getShuttleX();
//		int originalY = shuttle.getShuttleY();
//		int curX = 0;
//		int curY = 0;
//		System.out.println("Animation with refresh");
//		shuttle.setShuttleX(curX);
//		shuttle.setShuttleY(curY);
//		animateYFromOrigin(shuttle, animationStep, animationPauseTime, curY, originalY, frame);
//		animateXFromOrigin(shuttle, animationStep, animationPauseTime, curX, originalX, frame);
//	}
//	
//	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int curY, int originalY, OEFrame frame) {	
//		// make sure we don’t go past final Y position
//		System.out.println("Animation in Y Direction");
//		while (curY < originalY) {
//			ThreadSupport.sleep(animationPauseTime);
//			curY += animationStep;
//			shuttle.setShuttleY(curY);
//			frame.refresh();
//		}			
//		// move to destination Y position
//		shuttle.setShuttleY(originalY);
//	}
//	
//	protected void animateXFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startX, int endX, OEFrame frame) {
////		System.out.println("Animation in X Direction");
//		while (startX < endX) {
//			ThreadSupport.sleep(animationPauseTime);
//			startX += animationStep;
//			shuttle.setShuttleX(startX);
//			frame.refresh();
//		}
//		shuttle.setShuttleX(endX);
////		System.out.println("Animation Ended");
//	}
	
	

}
