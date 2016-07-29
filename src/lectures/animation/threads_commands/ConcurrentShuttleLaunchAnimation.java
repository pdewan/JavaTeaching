package lectures.animation.threads_commands;

import lectures.animation.loops.AShuttleAnimator;
import lectures.animation.loops.ShuttleAnimator;
import lectures.animation.loops.SingleShuttleLaunchAnimation;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
// THREADS
// Run the program. See what happens.
// Uncomment the printlns in AShuttleAnimator and run
// How many threads?
// How many shuttles?
// Follow the instructions in main().
// Run and observe what happens.
// What do you think the purpose of a Thread is based on your observations?


// Put break points and uncomment statements as instructed below and in the classes
// AShuttleAnimator and AShuttleAnimationCommand. Study this code and the two classes.
// Debug-run the program and when each break point is hit, follow the instructions

// Now look at all of the classes in this exercise. Can you identify a general design pattern
// for creating threaded applications and for creating threaded animation applications.

// Put a break point in the setShuttleY() method in AnObservablePlottedShuttle
// and debug-run the program. based on what you see, can you  refine your  design patterns
// and identify how these classes interact with each other.
// Can you justify why these classes should not be combined with each other?
// Why not combine the animator and animation class?
// why not combine the command object and animator?


public class ConcurrentShuttleLaunchAnimation extends SingleShuttleLaunchAnimation  {
	static int threadNumber = 0;
	protected final static String SHUTTLE_THREAD_NAME = "Shuttle Animation";
	protected final static int START_FRAME_X = 50;
	protected final static int START_FRAME_Y = 50;
	protected final static int SHUTTLE2_X = 100;
	protected final static int SHUTTLE2_Y = 50;
	protected static int shuttleNumber = 0;
	public static void concurrentDemoShuttleAnimation(ShuttleAnimator aShuttleAnimator, PlottedShuttle aShuttle) {
		// This break point will be hit twice.
		// Each time it is hit single step (using F6) through this method until you reach the end.
		// Press F8 after each  hit so you can go to teh next break point.
		// You will see a series of thread names in the stack window on the upper left in the debug perspective
		// As you single step the two times, try to determine
		// When does the main thread disappear from the thread list?
		// when a new thread appear in the thread list.
		

		Thread thread = new Thread(new AShuttleAnimationCommand(aShuttleAnimator, aShuttle, ANIMATION_STEP, ANIMATION_PAUSE_TIME));	
		threadNumber++;
		thread.setName(SHUTTLE_THREAD_NAME + " " + threadNumber);
		thread.start();
		// Uncomment this statement. Does this message appear after the anumations have finished?
//		System.out.println ("Animation Finished?");
	}
//	
//	public static void displayShuttleFrame (PlottedShuttle aShuttle, int aFrameX, int aFrameY) {
//		OEFrame oeFrame1 = ObjectEditor.edit(aShuttle);
//		oeFrame1.hideMainPanel();
//		oeFrame1.setLocation(aFrameX, aFrameY);
//		oeFrame1.setSize(SHUTTLE_FRAME_WIDTH, SHUTTLE_FRAME_HEIGHT);
//	}
//	public static void displayShuttleFrame (PlottedShuttle aShuttle) {
//		displayShuttleFrame(aShuttle, START_FRAME_X  + (shuttleNumber *SHUTTLE_FRAME_WIDTH) , START_FRAME_Y);
//		shuttleNumber++;
//	}
	public static void main(String[] args) {
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		PlottedShuttle shuttle2 = new AnObservablePlottedShuttle(SHUTTLE2_X, SHUTTLE2_Y);
		displayShuttleFrame(shuttle1);
		displayShuttleFrame(shuttle2);
		// Why two animators, what would happen if we had one?
		ShuttleAnimator shuttleAnimator1 = new AShuttleAnimator();
		ShuttleAnimator shuttleAnimator2 = new AShuttleAnimator();
		
		// Replace (by commenting/uncommenting) the two uncommented lines below with the two commented ones
//		serialShuttleAnimation(shuttleAnimator1, shuttle1);
//		serialShuttleAnimation(shuttleAnimator2, shuttle2);
		concurrentDemoShuttleAnimation(shuttleAnimator1, shuttle1);
		concurrentDemoShuttleAnimation(shuttleAnimator2, shuttle2);
	}	
}
