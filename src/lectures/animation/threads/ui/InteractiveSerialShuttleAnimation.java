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
	 	  
	 */
	public static void main (String[] args) {
		ObservablePlottedShuttle shuttle = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		PlottedShuttleComposer.composeShuttleMVC(shuttle);
//		OEFrame oeFrame = ObjectEditor.edit(shuttle);
//		oeFrame.hideMainPanel();
//		oeFrame.setSize (SHUTTLE_FRAME_WIDTH, SHUTTLE_FRAME_HEIGHT);
		FancyShuttleAnimator shuttleAnimator = new AFancyShuttleAnimator(shuttle);
		ObjectEditor.edit(shuttleAnimator);
	}

}
