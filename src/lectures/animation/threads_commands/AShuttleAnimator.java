package lectures.animation.threads_commands;

import util.annotations.Visible;
import lectures.animation.threads_commands.extra.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import bus.uigen.OEFrame;
/**
 * This the class that does the actual animation and prints the Thread objects.
 * 
 * Put a break point at the println() in animateFromOrigin that prints the
 * Thread object.
 * 
 * After it is hit, follow the instructions at the bottom of this class.
 * 
 *
 */
public class AShuttleAnimator implements ShuttleAnimator {	
	@Visible(false)
	public void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime) {	
		/*
		 * Put a break point below
		 */
		System.out.println (
				Thread.currentThread()+
				" entered animateFromOrigin in:" +
				this);

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
/*
 * When it is hit, look carefully at the Debug window showing stack information.
 * You will see that the window is partitioned by Threads in a tree window.
 * That is, the debug window shows a tree of Thread objects, and some of these
 * objects can be expanded or collapsed to show stacks. 
 * 
 * So far, we have assumed there is only one stack of method calls. 
 * In fact, there is a stack per thread. 
 * 
 * 
 * This means each method call is associated with some thread. When a method is called
 * it can print out the associated thread by printing out Thread.currentThread(),
 * as we see above.
 * 
 * The main method is associated with a special thread, called the main thread.
 * 
 * We can have other threads, which do not have the main method.
 * 
 * These other threads are created by main. Once created they run independently
 * of the main thread, that is, they  make method calls independently,
 * possibly at the same time (if have multiple cores/cpus).
 * 
 * This is much like a parent creating children who can execute independently.
 * 
 * The child threads can continue execution even after the main method has finished. * 
 * 
 * A new Thread object must be created for each child thread.
 * 
 * This means the base call in a child thread is not main(). Instead it is the
 * run method of the Thread object.
 * 
 * In our example, it means that the method concurrentShuttleAnimation in the
 * main class does not call the animating code in this class directly.
 * 
 * Instead, the code creates and starts two new threads, which execute the
 * two animations concurrently. * 
 *
 * 
 * Examine the debug window carefully.
 * 
 * Not all stacks can be expanded. Only stacks with method calls that have stopped
 * at a break point can be expanded.
 * 
 * Look at the expandable stacks, both when serialShuttleAnimation executes
 * and concurrentShuttleAnimation executes.
 * 
 * Also look at the method call at the base (bottom) of each stack and trace
 * the calls from this method to the call to the stopped method.
 * 
 * Select the method call in one of the stopped threads and resume and see
 * the effect on the ObjectEditor window (make sure the debug window and 
 * object editor windows can be viewed at the same time).
 * 
 * If the break point is hit again, go through this process again.
 * 
 * The main method prints the message ""Main terminates" just before it terminates.
 * 
 * Search for this output in the console during the serial and concurrent executions.
 * 
 * 
 * During serial animation, the number of stopped threads shown in the debug window is 1:
 * 0
 * 1
 * 2
 * 3
 * 
 * (T/F) During serial animation, Thread[main] is one of the current threads.
 *   
 * (T/F) During serial animation, Thread[main] is one of the stopped threads.
 * 
 * (T/F) During serial animation, Thread[Shuttle Animation 1] is one of the current threads.
 * 
 *  (T/F) During serial animation, Thread[Shuttle Animation 2] is one of the current threads.
 *
 * (T/F) During serial animation, Thread[Shuttle Animation 1] is one of the stopped threads.
 * 
 * (T/F) During serial animation, Thread[Shuttle Animation 2] is one of the stopped threads.
 * 
 * (T/F) During serial animation, the base (bottom) of one of the stacks is 
 * the main() method.
 * 
 * (T/F) During serial animation, the base (bottom) of one of the stacks is 
 * the Thread.run() method.
 * 
 * (T/F) During serial animation, serialShuttleAnimation() is one of the called
 * methods in a stack.
 * 
 * (T/F) During serial animation, the stopped animateFromOrigin method is called by
 * AShuttleAnimationCommand.run(). 
 * 
 * (T/F) During serial animation, AShuttleAnimationCommand.run() is called by
 * Thread.run()
 * 
 * (T/F) During serial animation, the program has to be resumed twice to finish
 * the animation.
 * 
 * (T/F) During serial animation, the message "main terminates" is the last output
 * in the console.
 * 
 * 
 * During concurrent execution, the number of stopped threads shown in the debug window is:
 * 0
 * 1
 * 2
 * 3
 * 
 * (T/F) During concurrent animation, Thread[main] is one of the current threads.
 *   
 * T/F) During concurrent animation, Thread[main] is one of the stopped threads.
 * 
 * (T/F) During concurrent animation, Thread[Shuttle Animation 1] is one of the current threads.
 * 
 * (T/F) During concurrent animation, Thread[Shuttle Animation 2] is one of the current threads.
 *
 * (T/F) During concurrent animation, Thread[Shuttle Animation 1] is one of the stopped threads.
 * 
 * (T/F) During concurrent animation, Thread[Shuttle Animation 2] is one of the stopped threads.
 * 
 * (T/F) During concurrent animation, the base (bottom) of one of the stacks is 
 * the main() method.
 * 	
 * (T/F) During concurrent animation, the base (bottom) of one of the stacks is 
 * the Thread.run() method.
 * 
 * (T/F) During serial animation, serialShuttleAnimation() is one of the called
 * methods in a stack.
 * 
 * (T/F) During serial animation, concurrentShuttleAnimation() is one of the called
 * methods in a stack.
 * 
 * (T/F) During concurrent animation, the program has to be resumed twice to finish
 * the animation.
 * 
 * (T/F) During concurrent animation, the stopped animateFromOrigin method is called by
 * AShuttleAnimationCommand.run().
 * 
 * (T/F) During concurrent animation, AShuttleAnimationCommand.run() is called by
 * Thread.run()
 * 
 * (T/F) During concurrent animation, the program has to be resumed twice to finish
 * the animation.
 * 
 * Study the code in this class and step over the println if necessary:
 * 
 * (T/F) The class AShuttleAnimator implements separate methods to animate the shuttle
 * in the X and Y directions.
 * 
 * (T/F) During concurrent animation, the message "main terminates" is the last output
 * in the console.
 * 
 * Go to COMMAND OBJECTS in the main class: ConcurrentShuttleLaunchAnimation. 
 * 
 */
	
}
