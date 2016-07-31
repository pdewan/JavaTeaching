package lectures.animation.threads.ui;

import lectures.animation.threads.synchronized_methods.ASynchronizedShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.PlottedShuttleComposer;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.mvc.properties.ObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/*
 * This animator does the job main has done so far, supplying the animation step and pause time values
 * defined byt properties that can be set interactively using say Objecteditor.
 * The animateShuttle() method simply supplies these parameters to the inherited public method.
 */
public class AFancyShuttleAnimator extends ASynchronizedShuttleAnimator implements FancyShuttleAnimator {
	static final int DEFAULT_ANIMATION_STEP = 5;
	static final int DEFAULT_ANIMATION_PAUSE_TIME = 100;
	int animationStep = DEFAULT_ANIMATION_STEP; 
	int animationPauseTime = DEFAULT_ANIMATION_PAUSE_TIME;
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
	
//	public static void main (String[] args) {
//		ObservablePlottedShuttle shuttle = new AnObservablePlottedShuttle(50, 100);
//		PlottedShuttleComposer.composeShuttleMVC(shuttle);
//		OEFrame oeFrame = ObjectEditor.edit(shuttle);
//		oeFrame.hideMainPanel();
//		oeFrame.setSize (450, 450);
//		FancyShuttleAnimator shuttleAnimator = new AFancyShuttleAnimator(shuttle);
//		ObjectEditor.edit(shuttleAnimator);
//	}

}
