package lectures.animation.threads_commands;

import lectures.animation.threads_commands.extra.SingleShuttleAnimation;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/*
 * You see the nature of threads in three stages.
 * First, you see visually, in animating user-interfaces,
 * the consequence of having multiple threads.
 * 
 * Second,  you see threads more directly, through console prints and 
 * the debugger, the existence of threads.
 * 
 * Finally, you see them most closely, through new kinds of object that 
 * result in the threads being created.
 * 
 * Study the code in this class, and follow the instructions at the end.
 */
 








public class ConcurrentShuttleLaunchAnimation extends SingleShuttleAnimation  {
	static int threadNumber = 0;
	protected final static String SHUTTLE_THREAD_NAME = "Shuttle Animation";
	protected final static int START_FRAME_X = 50;
	protected final static int START_FRAME_Y = 50;
	protected final static int SHUTTLE2_X = 100;
	protected final static int SHUTTLE2_Y = 50;
	protected static int shuttleNumber = 0;
	protected static PlottedShuttle shuttle1;
	protected static PlottedShuttle shuttle2;
	protected  static ShuttleAnimator shuttleAnimator1;
	protected static ShuttleAnimator shuttleAnimator2;
	protected static void printAllThreads() {
		System.out.println ("Current threads:" + Thread.getAllStackTraces().keySet());
	}
	public static void concurrentDemoShuttleAnimation(ShuttleAnimator aShuttleAnimator, PlottedShuttle aShuttle) {
		
		Thread thread = new Thread(
			new AShuttleAnimationCommand(
					aShuttleAnimator, aShuttle, 
					ANIMATION_STEP, 
					ANIMATION_PAUSE_TIME));	
//		Thread thread = new Thread(
//				new AShuttleAnimationCommand(
//						aShuttleAnimator, aShuttle, 
//						ANIMATION_STEP, 
//						ANIMATION_PAUSE_TIME));
		threadNumber++;
		thread.setName(SHUTTLE_THREAD_NAME + " " + threadNumber);
		/*
		 * Comment this out
		 */
		thread.start();
	}
	
	public static void serialShuttleAnimation() {
		serialShuttleAnimation(shuttleAnimator1, shuttle1);
		serialShuttleAnimation(shuttleAnimator2, shuttle2);
	}
	public static void concurrentShuttleAnimation() {
		concurrentDemoShuttleAnimation(shuttleAnimator1, shuttle1);
		concurrentDemoShuttleAnimation(shuttleAnimator2, shuttle2);
	}

	public static void main(String[] args) {
		shuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		shuttle2 = new AnObservablePlottedShuttle(SHUTTLE2_X, SHUTTLE2_Y);
		displayShuttleFrame(shuttle1);
		displayShuttleFrame(shuttle2);
		shuttleAnimator1 = new AShuttleAnimator();
		shuttleAnimator2 = new AShuttleAnimator();	
		// you will need to switch between the two calls
//		serialShuttleAnimation();		
		concurrentShuttleAnimation();
		System.out.println ("Main terminates");

	}
/*
 * SERIAL VS CONCURRENT ANIMATIONS
 * 
 * Run the program and observe the animations in the object editor user interfaces.
 * 
 * Now uncomment the call to concurrentShuttleAnimation and comment out the
 * call to serialShuttleAnimation.
 * 
 * Observe the animations again.
 * 
 * (T/F)serialShuttleAnimation starts animating shuttle2 after finishing animating
 * shuttle1.
 * 
 * (T/F)serialShuttleAnimation ensures that the two shuttles do not climb up at the same
 * time. 
 * 
 * (T/F) concurrentShuttleAnimation starts animating shuutle2 after finishing 
 * animating shuttle1. 
 * 
 * (T/F)serialShuttleAnimation ensures that the two shuttles do not climb up at the same
 * time.   
 * 
 */
/*
 * THREAD OBJECTS
 * 
 * We will go through the same process again, but this time look at the console
 * output in addition to the OE display.
 * 
 * The idea is to understand the nature of Thread objects, where Thread is
 * a predefiend Java class.
 * 
 * The program displays these objects using strings of the form:
 * Thread[<Thread Name>} 
 * where <Thread Name> is a name given to the Thread object. 
 * 
 * In this program, we give each Thread object a different name.
 * 
 * 
 * Run main again and observe console output and see how many different Thread 
 * objects are printed out.
 * 
 * Switch back to serialShuttleAnimation and run main again and observe console
 * output and see how many different Thread objects are printed out.
 * 
 * When serialShuttleAnimation runs, the number of thread objects printed is:
 *    0
 *    1
 *    2
 *    3
 * When concurrentShuttleAnimation runs, the number of thread objects printed is:
 *    0
 *    1
 *    2
 *    3 
 * 
 * To get further under the hood, let is try and understand where these objects
 * are being printed.
 * 
 * Go to AShuttleAnimator and answer the questions there. You will need to
 * switch between serial and concurrent execution.
 */
/*
 * COMMAND OBJECTS
 * 
 * You saw in AShuttleAnimator something about the behavior of running threads.
 * Let us try to understand how threads are started.
 * 
 * We saw that each runnable thread is associated with a Thread object. 
 * We also saw that other than the main thread, all threads have Thread.run()
 * at the base of the stack.
 * If different threads do different things, then somehow different Thread.run() calls
 * should call different methods.
 * 
 * Thread.run() does not take parameters. So this means, when a Thread object is
 * constructed we must tell the constructor which method to call and what the parameters of the
 * method should be.
 * 
 * These two pieces of information are encapsulated in a command object, which
 * is passed to the thread constructor.
 * 
 * concurrentDemoShuttleAnimation shows the use of Thread objects.
 * 
 * It creates a thread and then starts it. * 
 * 
 * 
 * Comment out Thread.start(), switch to concurrent animation, and observe what
 * happens.
 * 
 * (T/F) If a thread is not started, then its run method is not called.
 * 
 * Uncomment Thread.start() and switch to the alternate commented out Thread 
 * instantiation and observe what happens.
 * 
 * (T/F) If the command object is not passed to the Thread constructor, then
 * the animation does not start.
 * 
 *  Go to AShuttleAnimationCommand
 * 
 * 
 * 
 * 
 */
/*
 * THREAD AND ANIMATION DESIGN PATTERN
 * We see here a design pattern for using threads to animate objects that has
 * the following components:
 * 
 * Animated object - the object being animated. In this case it is an instance of
 * PlottedShuttle.
 * 
 * The animating object -  the object implementing the animation. In this case,
 * it is an instance of APlottedShuttle.
 * 
 * Command object - the object that interacts with the animating object
 * to start the animation -> AShuttleAnimationCommand
 * 
 * Thread object - this object that interacts with the commmand object.
 * 
 * Based on this design pattern answer the following questions:
 * 
 * (T/F) The class of the animated object must be changed to change the animation.
 * 
 * (T/F) A Thread object knows how an object is animated.
 * 
 * (T/F) A Thread object interacts with a command object directly.  
 * 
 * (T/F) A Thread object interacts with an animating object directly.
 * 
 * (T/F) A command object interacts with an animated object directly.
 * 
 * (T/F) A command object interacts with an animating object directly.
 * 
 * (T/F) The class of a command object is a subclass of the Thread class.
 * 
 * (T/F) It is possible to create two different threads and command objects that
 * animate the same object simultaneously.
 * 
 * (T/F) A command object can be used only to start threads.
 * 
 * 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
/*
 * ANIMATING METHOD AND THREAD STACKS
 * 
 * To get further under the hood, let is try and understand wqhere
 * 
 * The console prints out Java thread objects
 * 
 * You will see printouts of the form: Thread[<Thread Name>} where <Thread Name>
 * gives the name of a thread. Each of these printouts
 * 
 * 
 * 
 * 
 * 
 * 
 * The console output is cluttered, so we will at different aspects of the output.
 * 
 * 
 * 
 * Switch back to serialShutleAnimation again.
 * 
 */

	 
	
}
