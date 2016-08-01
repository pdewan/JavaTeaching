package lectures.animation.threads.ui;

import lectures.animation.loops.SingleShuttleAnimation;
import lectures.animation.threads.synchronized_methods.ASynchronizedShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.PlottedShuttleComposer;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import lectures.mvc.properties.ObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class InteractiveSerialShuttleAnimation extends SingleShuttleAnimation  {
	/* 
	 USER-INTERFACE THREAD
	 We use a different shuttle animator now. Have a look at its class.
	 Run the program. It will create two user-interfaces, one for the shuttle and one 
	 for the animator. Execute the animate shuttle command from the AFancyShuttleAnimator menu.
	 Observe what happens to the shuttle and the console.
	 
	 Go to class ACartesianPlaneView in package lectures.mvc.graphics.
	 Comment out the printlns in the paint() method and the propertyChange() method.
	 Which thread calls the repaint() method? Which executes the paint() method?
	 Does the repaint() call execute while the X and Y loops in the animator execute?
	 Does the paint method execute while the X and Y loops in the animator execute?
	 
	 Now comment out the last line in main, which calls animateShuttle, not from the user-interface
	 but the main method. See the effect of this in the GUI and console. Answer the questions above again:
	 Which thread calls the repaint() method? Which executes the paint() method?
	 Does the repaint() call execute while the X and Y loops in the animator execute?
	 Does the paint method execute while the X and Y loops in the animator execute?
	 
	 Do you have a theory to explain the behaviors you see?
	 	  
	 */
	public static void main (String[] args) {
		ObservablePlottedShuttle shuttle = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		FancyShuttleAnimator shuttleAnimator = new AFancyShuttleAnimator(shuttle);
		ObjectEditor.edit(shuttleAnimator);
//		shuttleAnimator.animateShuttle();
		
	}

}
