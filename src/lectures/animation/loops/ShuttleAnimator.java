package lectures.animation.loops;

import lectures.composite.objects_shapes.PlottedShuttle;
import bus.uigen.OEFrame;

public interface ShuttleAnimator {	
	public void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime);	
//	public void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, OEFrame frame);
	

}
