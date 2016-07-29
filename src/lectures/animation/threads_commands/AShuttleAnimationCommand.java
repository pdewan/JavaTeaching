package lectures.animation.threads_commands;

import lectures.animation.loops.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
// A Command Object is one that provides an "execute" method to
// execute a target command - method with parameters - on another target object.
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
		// Select  one of the stopped threads, Press F8 to go to the next break point.		
		shuttleAnimator.animateFromOrigin(shuttle, animationStep, animationPauseTime);
	}
}
