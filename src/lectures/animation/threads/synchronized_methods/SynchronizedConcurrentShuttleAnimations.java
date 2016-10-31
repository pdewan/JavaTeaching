package lectures.animation.threads.synchronized_methods;

import java.awt.SecondaryLoop;

import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.animation.threads_commands.extra.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
// SYNCHRONIZED VS. NOT SYNCHRONIZED
// The difference between this program and the interfering one is that it uses a different
// kind of animator.

// Run this program. Look at the animation behavior and the console output.
// Does the message about to call animateFromOrigin get immediately followed by the message
// entered animateFromOrigin?

// Remove synchronized keyword from animateFromOrigin in ASynchronizedShuttleAnimator
// and run the program again. Look at the animation behavior and console output again.
// Does the message about to call animateFromOrigin get immediately followed by the message
// entered animateFromOrigin?

// Do you have a theory about what the synchronized method does?

// SYNCHRONIZED AND NOT SYNCHRONIZED METHODS
// Comment out the for loop below.
// The println calls the toStringMethod in ASynchronizedShuttleAnimator.
// Look at the toString() method in ASynchronizedShuttleAnimator. It is currently not synchronized.
// Look at the console output.
// Is the toString() method executed while the other synchronized method is executing?
// Now uncomment the synchronized keyword before it and run again.
// Is the method executed while the other synchronized method is executing?

// Do you need to refine your theory about what the synchronized method does?


public class SynchronizedConcurrentShuttleAnimations extends InterferingConcurrentShuttleAnimations  {
	final static int NUM_READS = 30;
	public static void main(String[] args) {
		PlottedShuttle aShuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		displayShuttleFrame(aShuttle1);
		ShuttleAnimator aShuttleAnimator = new ASynchronizedShuttleAnimator();
		concurrentDemoShuttleAnimation(aShuttleAnimator, aShuttle1);
		ThreadSupport.sleep(SECOND_THREAD_DELAY);
		concurrentDemoShuttleAnimation(aShuttleAnimator, aShuttle1);
//		for (int aReadNum = 0; aReadNum < NUM_READS;aReadNum++) {
//			System.out.println (Thread.currentThread() + ": Read num:" + aReadNum + " " + aShuttleAnimator);
//			ThreadSupport.sleep(ANIMATION_PAUSE_TIME);			
//		}
	}
}
