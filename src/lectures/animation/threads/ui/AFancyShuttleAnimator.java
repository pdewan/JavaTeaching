package lectures.animation.threads.ui;

import lectures.animation.threads.synchronized_methods.ASynchronizedShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class AFancyShuttleAnimator extends ASynchronizedShuttleAnimator implements FancyShuttleAnimator {
	int animationStep = 5; 
	int animationPauseTime = 300;
	PlottedShuttle shuttle;
	public AFancyShuttleAnimator(PlottedShuttle theShuttle) {
		shuttle = theShuttle;
	}
	public int getAnimationStep() {
		return animationStep;
	}
	public void setAnimationStep(int animationStep) {
		this.animationStep = animationStep;
	}
	public int getAnimationPauseTime() {
		return animationPauseTime;
	}
	public void setAnimationPauseTime(int animationPauseTime) {
		this.animationPauseTime = animationPauseTime;
	}
	public void animateShuttle() {
		animateFromOrigin(shuttle, animationStep, animationPauseTime);
	}
	
	public static void main (String[] args) {
		PlottedShuttle shuttle = new AnObservablePlottedShuttle(50, 100);
		OEFrame oeFrame = ObjectEditor.edit(shuttle);
		oeFrame.hideMainPanel();
		oeFrame.setSize (450, 450);
		FancyShuttleAnimator shuttleAnimator = new AFancyShuttleAnimator(shuttle);
		ObjectEditor.edit(shuttleAnimator);
	}

}
