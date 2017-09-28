package lectures.animation.threads.ui;

import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import util.annotations.SeparateThread;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class AFancyShuttleAnimatorWithSeparateThreadAnnotation
             extends AFancyShuttleAnimator  {
	
	public AFancyShuttleAnimatorWithSeparateThreadAnnotation(PlottedShuttle theShuttle) {
		super(theShuttle);
	}	
	@SeparateThread(true)
	public void animateShuttle() {
		super.animateShuttle();
	}	
	public static void main (String[] args) {
		PlottedShuttle shuttle = new AnObservablePlottedShuttle(50, 100);
		OEFrame oeFrame = ObjectEditor.edit(shuttle);
		oeFrame.hideMainPanel();
		oeFrame.setSize (450, 450);
		FancyShuttleAnimator shuttleAnimator = new AFancyShuttleAnimatorWithSeparateThreadAnnotation(shuttle);
		ObjectEditor.edit(shuttleAnimator);
	}

}
