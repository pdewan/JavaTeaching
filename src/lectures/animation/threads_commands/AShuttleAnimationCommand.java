package lectures.animation.threads_commands;

import lectures.animation.loops.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
// This is an example of a command object.
// A Command Object is one that provides a parameterless method to
// execute a command - method with parameters - on another object called the target object.
// We will refer to such a method as an execute method.
// What is the execute method called in this example.
// What is the class of the target object.
// What is the name of the target method?
// How is the target object determined in this example?
// How is the target method determined?
// How are the parameters of the target method determined?
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
		// Put break point below.
		// When you hit it, which method is in the base of the stack of the stopped threads - 
		// that is the threads in which the break occurred?
		// Is the main thread in the list?
		// Select one of the two stopped threads, Press F8 to go to the next break point.	
		System.out.println (
				Thread.currentThread() +
				" about to call animateFromOrigin in:" +
				shuttleAnimator);
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
}
