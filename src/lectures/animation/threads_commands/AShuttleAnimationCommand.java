package lectures.animation.threads_commands;

import lectures.composite.objects_shapes.PlottedShuttle;
/**
 * This is an example of a command-object.
 * A command object represents a method call or commmand. 
 * 
 * It provides a parameterless method, called execute or run,  
 * which can be used to make the call.
 * 
 * Thus, its execute method is called to make another call, which we will
 * call the target call.
 * 
 * In this class, the execute method is named run, and it calls animateFromOrigin
 * in an instance of ShuttleAnimator. 
 * 
 * The object on which a target call is made and the parameters of the call
 * are passed as arguments to the constructor of a command object.
 * 
 * In this example, the instance of ShuttleAnimator and the parameters of 
 * animateFromOrigin are passed as parameters to the constructor.
 * 
 * These parameters are then used by the run method to make the call.
 * 
 * The execute() method of a command object is defined by some standard interface.
 *  
 * 
 * 
 * Study the constructor and instance method provided by this class. *
 * 
 * Follow the instructions below. 
 * 
 *
 */
public class AShuttleAnimationCommand 
	implements Runnable { // A Java Interface
	ShuttleAnimator shuttleAnimator;
	PlottedShuttle shuttle;
	int animationStep;
	int animationPauseTime;	
	public AShuttleAnimationCommand (ShuttleAnimator aShuttleAnimator,
								PlottedShuttle aShuttle, 
								int anAnimationStep, 
								int anAnimationPauseTime) {
		shuttleAnimator = aShuttleAnimator;
		shuttle = aShuttle;
		animationStep = anAnimationStep;
		animationPauseTime = anAnimationPauseTime;
	}
	
	
	public void run() {
			
		System.out.println (
				Thread.currentThread() +
				" about to call animateFromOrigin in:" +
				shuttleAnimator);
		/*
		 * Put break point below
		 */
		shuttleAnimator.animateFromOrigin(shuttle, animationStep, animationPauseTime);
		System.out.println (
				Thread.currentThread().getName() +
				" finished call to animateFromOrigin in:" +
				shuttleAnimator);
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + "@" + hashCode();
	}
/*
 * 
 * Put the break point in the  run() method of the class and look at the stack.
 * 
 * Switch to concurrentShuttleAnimation and debug-run the main class.
 * 
 * 
 * (T/F) The run() method of the command object takes parameters. 
 * 
 * (T/F) The constructor of the command object determines the instance on which
 * the run method makes the target call.
 * 
 * (T/F) The constructor of the command object determines the parameters of the
 * target call.
 * 
 * (T/F) The constructor of the command object determines which method is invoked
 * in the target call.
 * 
 * (T/F) The run() method of AShuttleAnimationCommand is called by the Thread constructor.
 * 
 * (T/F) The run() method of AShuttleAnimationCommand is called by the Thread.run().
 * 
 * (T/F) The run() method of AShuttleAnimationCommand is defined in the predefined
 * Java interface,  Runnable
 * 
 * 
 * Go to DESIGN PATTERN in main class:ConcurrentShuttleLaunchAnimation
 *
 *
 */
}
