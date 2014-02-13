package lectures.animation.threads.synchronized_methods;

import lectures.animation.loops.AShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import bus.uigen.OEFrame;
public class ASynchronizedShuttleAnimator extends AShuttleAnimator  {	
	public synchronized void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime) {		
		super.animateFromOrigin(shuttle, animationStep, animationPauseTime);
	}
	public synchronized void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, OEFrame frame) {
		super.animateFromOrigin(shuttle, animationStep, animationPauseTime, frame);
	}
}
