package lectures.animation.loops;

import lectures.composite.objects_shapes.APlottedShuttle;
import lectures.composite.objects_shapes.PlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class ShuttleAnimationDriver {	
	public static void demoShuttleAnimation(ShuttleAnimator aShuttleAnimator, PlottedShuttle aShuttle,  OEFrame anOEFrame) {
		aShuttleAnimator.animateFromOrigin(aShuttle, 5, 100);	
		aShuttleAnimator.animateFromOrigin(aShuttle, 5, 100, anOEFrame);	
	}
	public static void main(String[] args) {
		PlottedShuttle shuttle = new APlottedShuttle(50, 100);
		OEFrame oeFrame = ObjectEditor.edit(shuttle);
		oeFrame.hideMainPanel();
		oeFrame.setSize (450, 450);
		ShuttleAnimator shuttleAnimator = new AShuttleAnimator();
		shuttleAnimator.animateFromOrigin(shuttle, 5, 100);
		demoShuttleAnimation(shuttleAnimator, shuttle, oeFrame);
	}
}
