package lectures.animation.loops;

import lectures.composite.objects_shapes.APlottedShuttle;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
// ANMIMATION_BASICS
// Understanding the example is important for the discussion on threads.
// Run the program.
// Experiment with different values of ANIMATION_STEP and ANIMATION_PAUSE_TIME and see what happens.
// In main, switch from AnObservablePlottedShuttle to APlottedSuttle
// What happens and why?
// Uncomment the print statement in AShuttleAnimator to better understand what is going on.
// How many different "threads" involved in the animation?
// How many different shuttles involved in the animation?

public class SingleShuttleLaunchAnimation {	
	protected final static int SHUTTLE1_X = 50;
	protected final static int SHUTTLE1_Y = 100;
	protected final static int SHUTTLE_FRAME_WIDTH = 400;
	protected final static int SHUTTLE_FRAME_HEIGHT = 300;
	protected final static int ANIMATION_STEP = 5; 
//	protected final static int ANIMATION_STEP = 2; // an alternative step value
	protected final static int ANIMATION_PAUSE_TIME = 100; 
//	protected final static int ANIMATION_PAUSE_TIME = 300; // an alternative pause time value
	public static void serialShuttleAnimation(ShuttleAnimator aShuttleAnimator, PlottedShuttle aShuttle) {
		aShuttleAnimator.animateFromOrigin(aShuttle, ANIMATION_STEP, ANIMATION_PAUSE_TIME);	
	}
	protected static void displayShuttleFrame (PlottedShuttle aShuttle) {
		OEFrame oeFrame1 = ObjectEditor.edit(aShuttle);
		oeFrame1.hideMainPanel();
		oeFrame1.setSize (SHUTTLE_FRAME_WIDTH, SHUTTLE_FRAME_HEIGHT);
	}
	public static void main(String[] args) {
//		PlottedShuttle aHhuttle = new APlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		PlottedShuttle aShuttle = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		displayShuttleFrame(aShuttle);
		displayShuttleFrame(aShuttle);
		ShuttleAnimator aShuttleAnimator = new AShuttleAnimator();
		serialShuttleAnimation(aShuttleAnimator, aShuttle);
	}
}
