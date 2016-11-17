package lectures.animation.threads.synchronized_methods;

import lectures.animation.threads_commands.AShuttleAnimator;
import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.animation.threads_commands.extra.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/**
 * THREADS CHANGING THE SAME OBJECT CONCURRENTLY
 * In a previous example, we had two shuttles, two animators, and two threads, 
 * which operated independently. Now we have  one shuttle, one animator, 
 * and two threads. Thus, we have two threads changing the same object concurrently.
 *
 * Run the program without break points (execute run rather than debug-run).
 * See the behavior on the screen. 
 * 
 * 
 * (T/F) In InterferingConcurrentShuttleAnimations, the two animators run serially,
 * that is, the first animation completes before the second one starts. 
 * 
 */

public class InterferingConcurrentShuttleAnimations extends ConcurrentShuttleLaunchAnimation  {	
	static final long SECOND_THREAD_DELAY = 500;
	public static void main(String[] args) {
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		displayShuttleFrame(shuttle1);
		ShuttleAnimator aShuttleAnimator = new AShuttleAnimator();
		concurrentDemoShuttleAnimation(aShuttleAnimator, shuttle1);
		/*
		 * Comment the sleep out when asked.
		 */
		ThreadSupport.sleep(SECOND_THREAD_DELAY); // start the second thread a little after the first one
		concurrentDemoShuttleAnimation(aShuttleAnimator, shuttle1);	
	}
}
/**
 * Look at the main method carefully. Recall that concurrentDemoShuttleAnimation
 * creates a new thread in which its animator argument animates the shuttle
 * argument.
 * 
 * 
 * (T/F) The main method delays the creation of the second animating thread.
 * 
 * Your next task is to understand the order of animations through the console 
 * output. Look at the messages with text "started animating".
 * 
 * (T/F) Thread Shuttle Animation 1 starts animating in the Y direction 
 * before thread Shuttle Animation 2.
 * 
 * (T/F) Thread Shuttle Animation 1 starts animating in the X direction 
 * before thread Shuttle Animation 2.
 * 
 * (T/F) The second thread finishes animating in the Y direction after
 * the first first thread finishes animating in the Y direction.
 * 
 * (T/F) The second thread finishes animating in the X direction after
 * the first thread finishes animating in the X direction.
 * 
 * Your next task is to answer a series of questions to understand the
 * animation behavior and the console output.
 * 
 * Try to understand the console output giving values of saved X and saved Y.
 * 
 * To do so, you need to go to the class in which the prints occur, AShuttleAnimator.
 * 
 * Go to that class, study the code carefully, see which variables are printed
 * by the print statements and how these variables are used in the animations.
 * 
 * (T/F) The "saved X" print statement prints the value of the curX and curY
 * variables in animateFromOrigin().
 * 
 * (T/F) The orginalX variable holds the final X position of the shuttle after the
 * animation finishes.
 * 
 * (T/F) The curX variable is initialized with the starting X position of the animation.
 * 
 * (T/F) The originalX variable is an instance variable of AShuttleAnimator.
 * 
 * (T/F) The curX variable is an instance variable of AShuttleAnimator.
 * 
 * (T/F) originalX is changed multiple times during an execution of 
 * animateFromOrigin().
 * 
 * (T/F) The two threads access the same copy of originalX and changes made by
 * one thread to the variable can be seen by the other thread.
 *  
 * 
 * (T/F) animateFromOrigin() sets the value of the ShuttleX and ShuttleY properties of
 * the shuttle to 0 at the start of the animation.
 * 
 * (T/F) animateYFromOrigin sets the value of the ShuttleX property during the animation.
 * 
 * (T/F) animateYFromOrigin sets the value of the ShuttleY property during the animation.
 * 
 * 
 * Look at the two values of originalX and originalY printed by the two threads
 * on the console.
 * 
 * (T/F) originalX is the same value when printed in both threads.
 * 
 * (T/F) originalY is the same value when printed in both threads.
 * 
 * To answer the following questions, you might want to  print the values of 
 * startX and startY and the current thread with a print of the form:
 * 
 * System.out.println ("Thread "+  Thread.currentThread()+ " x :" + startX);
 * 
 * (I should have created additional variables rather than changing startX
 * and startY in the loop- I did so to save space in the PPT.)
 *  
 * The prints will clutter the output, so try and first answer questions without 
 * printing.
 * 
 * (T/F) Changes made by Shuttle Animation 1 to the ShuttleX property influence the
 * value of originalX in Shuttle Animation 2.
 * 
 * (T/F) Changes made by Shuttle Animation 1 to the ShuttleY property influence the
 * value of originalY in Shuttle Animation 2.
 * 
 * (T/F) The end position of the second animation is not the same as the end position
 * of the first animation.
 * 
 * (T/F) The loop in animateYFromOrigin() is executed at least once by the 
 * first thread.
 * 
 * (T/F) The loop in animateXFromOrigin() is executed at least once by the 
 * first thread.
 * 
 * (T/F) The loop in animateYFromOrigin() is executed at least once by the 
 * second thread.
 * 
 * (T/F) The loop in animateXFromOrigin() is executed at least once by the 
 * second thread
 * 
 *  
 * Now comment out the sleep and observe the values of saved X and saved Y on
 * the console and run the program and observe the animations and the output.
 * 
 * (T/F) Removing the inter-thread delay makes no difference to the "saved X"
 * and "saved Y" outputs.
 * 
 * (T/F) After removing the inter-thread delay, the loop in animateYFromOrigin()
 *  is executed at least once by the first thread.
 * 
 * (T/F) After removing the inter-thread delay, the loop in animateXFromOrigin()
 *  is executed at least once by the first thread.
 *  
 * (T/F) After removing the inter-thread delay, the loop in animateYFromOrigin()
 *  is executed at least once by the second thread.
 * 
 * (T/F) After removing the inter-thread delay, the loop in animateXFromOrigin()
 *  is executed at least once by the second thread.
 *  
 * (T/F) After removing the delay, the two animators run serially, 
 * that is, the first animation completes before the second one starts. 
 * 
 * Comment out these statements in AShuttleAnimator:
 * 	int originalX = shuttle.getShuttleX(); 
 *		int originalY = shuttle.getShuttleY();	
 * 
 * and instead put in:
 * 
 * 	int originalX = 50; 
 *		int originalY = 100;
 *  
 *  
 * (T/F) After setting originalX and originalY to predetermined values,
 *  both animations execute the X loop at least once.
 *
 * (T/F) After setting originalX and originalY to predetermined values,
 *  both animations execute the Y loop at least once.
 * 
 *  Next class: SynchronizedConcurrentShuttleAnimations
 * 
 * 
 *
 */
