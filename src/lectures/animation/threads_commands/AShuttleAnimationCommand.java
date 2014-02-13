package lectures.animation.threads_commands;

import lectures.animation.loops.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;

public class AShuttleAnimationCommand implements Runnable {
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
//	public int getAnimationStep() {
//		return animationStep;
//	}
	public void run() {
		shuttleAnimator.animateFromOrigin(shuttle, animationStep, animationPauseTime);
	}
}
