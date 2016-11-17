package lectures.animation.threads.synchronized_methods;

import java.awt.SecondaryLoop;

import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.animation.threads_commands.extra.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/**
 * SYNCHRONIZED VS. NOT SYNCHRONIZED
 * The difference between this program and the interfering one is that it 
 * uses a different kind of animator to illustrate the behavior of the synchronized
 * methods.
 * 
 * Run this program. Look at the animation behavior.
 * 
 * 
 */


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
//			System.out.println (Thread.currentThread() + " " + aShuttleAnimator
//					+ ": Shuttle Y:" + aShuttle1.getShuttleX());
//			ThreadSupport.sleep(ANIMATION_PAUSE_TIME);			
//		}
	}
}
/**
 * SYNCHRONIZED VS. NOT SYNCHRONIZED
 *
 * Look at the console output.
 * 
 * (T/F) When thread 1 executes, the message about the call to synchronized animateFromOrigin 
 * gets immediately followed by the message saying that animateFromOrigin was entered.
 * 
 * (T/F) When thread 2 executes, the message about the call to animateFromOrigin 
 * gets immediately followed by the message saying that animateFromOrigin was entered.
 *  
 * (T/F) Thread 2 does not enter the synchronized animateFromOrigin() until the call
 * to this method by thread 1 finishes.
 * 
 * Remove the synchronized keyword from animateFromOrigin in ASynchronizedShuttleAnimator
 * and run the program again. Look at the animation behavior and console output again.
 * 
 * (T/F) When thread 1 executes, the message about the call to unsynchronized 
 * animateFromOrigin gets immediately followed by the message saying that animateFromOrigin was entered.
 * 
 * (T/F) When thread 2 executes, the message about the call to unsynchronized animateFromOrigin 
 * gets immediately followed by the message saying that animateFromOrigin was entered.
 * 
 * Place the synchronized keyword back when you are done.
 *
 * Uncomment the for loop above and study it. The println calls the toString() Method
 * in ASynchronizedShuttleAnimator and prints the current thread and shuttle Y coordinate.
 * 
 * Look at the toString() method in ASynchronizedShuttleAnimator.
 *  
 * It is currently not synchronized.
 * 
 * Run this program and look at the console output.
 * 
 * (T/F) The unsynchronized toString() method in ASynchronizedShuttleAnimator is executed by
 * the main thread during the execution of the synchronized method.
 *  
 * Now uncomment the synchronized keyword in toString()and run again.
 * 
 * (T/F) The synchronized toString() method in ASynchronizedShuttleAnimator 
 * is executed by the main thread during the execution of the synchronized method.
 * 
 * (T/F) The behavior of the two animating threads (the animations) can be changed by running
 *  the main thread concurrently.
 * 
 * (T/F) The behavior of the main thread (its console output) can be changed by running
 * animation threads concurrently.
 * 
 *  (T/F) The behavior of a thread that calls write methods in an object can be
 *  changed by a thread that calls read methods in the object concurrently.
 * 
 * (T/F) The behavior of a thread that calls read methods in an object can be
 *  changed by a thread that calls write methods in the object concurrently
 * 
 * (T/F) An unsynchronized method can be executed by a thread in an object 
 * while another thread is executing a synchronized method in the same object.
 * 
 * (T/F) The synchronized method, M, can be executed by a thread in an object
 *  while another thread is executing the same method M in the object.
 * 
 * (T/F) The synchronized method, M, can be executed by a thread in an object
 *  while another thread is executing a different synchronized method N in the object.
 *
 * 
 */
