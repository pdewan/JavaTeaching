package lectures.animation.loops;

import util.annotations.Visible;
import lectures.animation.threads_commands.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import bus.uigen.OEFrame;
public class AShuttleAnimator implements ShuttleAnimator {	
	@Visible(false)
	public void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime) {	
		System.out.println (
				Thread.currentThread()+
				" entered animateFromOrigin in:" +
				this);
		// Put a break point below.
		// When it is hit, determine which method is in the base of the stack in which the break occurs
		// Which is the method above this method in the stack and the one above that?
		// Which of these methods can take parameters defined by the programmer?
		// Select one of the stopped threads, Press F8 and see its effect on shuttle animation.
		int originalX = shuttle.getShuttleX(); 
		int originalY = shuttle.getShuttleY();	
		System.out.println (Thread.currentThread() + " saved X = " + originalX + " Y = " + originalY);
		int curX = 0;
		int curY = 0;
		shuttle.setShuttleX(curX);
		shuttle.setShuttleY(curY);
		animateYFromOrigin(shuttle, animationStep, animationPauseTime, curY, originalY);
		animateXFromOrigin(shuttle, animationStep, animationPauseTime, curX, originalX);
	}
	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
		System.out.println (
				Thread.currentThread()+
				" started animating in Y Direction in:" +
				this);
		// make sure we don’t go past final Y position
		while (startY < endY) {
			
			ThreadSupport.sleep(animationPauseTime);
			startY += animationStep;
			shuttle.setShuttleY(startY);	
//			System.out.println (			
//					" " + Thread.currentThread() +
//					" Animator:" + this +
//					" New Y:" + startY );
		}			
		// move to destination Y position
		shuttle.setShuttleY(endY);
		System.out.println (
				Thread.currentThread()+
				" finished animating in Y Direction in:" +
				this);

	}
	
	protected void animateXFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startX, int endX) {
		System.out.println (
				Thread.currentThread()+
				" started animating in X Direction in:" +
				this);
		while (startX < endX) {
			ThreadSupport.sleep(animationPauseTime);
			startX += animationStep;
			shuttle.setShuttleX(startX);
//			System.out.println (			
//					" " + Thread.currentThread() +
//					" Animator:" + this +
//					" New X:" + startX );
		}
		shuttle.setShuttleX(endX);
		System.out.println (
				Thread.currentThread()+
				" finished animating in X Direction in:" +
				this);
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + hashCode();
	}
	
}
