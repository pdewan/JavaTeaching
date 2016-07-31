package lectures.animation.threads.ui;

import lectures.animation.loops.SingleShuttleAnimation;
import lectures.animation.threads.synchronized_methods.ASynchronizedShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.PlottedShuttleComposer;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.mvc.properties.ObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class InteractiveConcurrentlShuttleAnimation extends InteractiveSerialShuttleAnimation  {
	/* 
	 DYNAMIC THREADS
	 This time we will use a shuttle animator that creates a new 
	 thread each time the animate method is called. This thread executes the
	 two animation loops.
	 
	 Run the program. Observe the behavior.
	 Which thread calls the repaint() method? Which executes the paint() method?
	 Does the repaint() call execute while the X and Y loops in the animator execute?
	 Does the paint method execute while the X and Y loops in the animator execute?
	 
	 Do you have a theory as to why this version differs from the previous one?	 

	  
	 */
	public static void main (String[] args) {
		ObservablePlottedShuttle aShuttle = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		PlottedShuttleComposer.composeShuttleMVC(aShuttle);
//		OEFrame oeFrame = ObjectEditor.edit(shuttle);
//		oeFrame.hideMainPanel();
//		oeFrame.setSize (SHUTTLE_FRAME_WIDTH, SHUTTLE_FRAME_HEIGHT);
		FancyShuttleAnimator shuttleAnimator = new AConcurrentShuttleAnimator(aShuttle);
		ObjectEditor.edit(shuttleAnimator);
	}

}
