package lectures.animation.threads.ui;

import lectures.animation.threads.synchronized_methods.ASynchronizedShuttleAnimator;
import lectures.animation.threads_commands.extra.SingleShuttleAnimation;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.AnObservablePlottedShuttle;
import lectures.mvc.graphics.ObservablePlottedShuttle;
import lectures.mvc.graphics.PlottedShuttleComposer;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class InteractiveConcurrentlShuttleAnimation extends InteractiveSerialShuttleAnimation  {
	/* 
	 DYNAMIC THREADS
	 This time we will use a shuttle animator that creates a new 
	 thread each time the animate method is called. This thread executes the
	 two animation loops.
	 
	 Run the program. Observe the behavior. Again answer the questions:
	 Which thread calls the repaint() method? Which executes the paint() method?
	 Does the repaint() call execute while the X and Y loops in the animator execute?
	 Does the paint method execute while the X and Y loops in the animator execute?
	 
	 Do you understand why this version differs from the previous one?	 

	  
	 */
	public static void main (String[] args) {
		ObservablePlottedShuttle aShuttle = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		PlottedShuttleComposer.composeShuttleMVC(aShuttle);
		FancyShuttleAnimator shuttleAnimator = new AConcurrentShuttleAnimator(aShuttle);
		ObjectEditor.edit(shuttleAnimator);
	}

}
