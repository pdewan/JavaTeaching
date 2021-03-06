package lectures.animation.threads.ui;

import lectures.animation.threads_commands.AShuttleAnimationCommand;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class AConcurrentShuttleAnimator extends AFancyShuttleAnimator  {
	protected static int animationNumber;
	public AConcurrentShuttleAnimator(PlottedShuttle theShuttle) {
		super(theShuttle);
	}
	public void animateShuttle() {
		Thread thread = new Thread(
			(new AShuttleAnimationCommand(
				this, shuttle,animationStep, animationPauseTime)));
		thread.setName("Animation Thread " + animationNumber);
		thread.start();
		animationNumber++;
		System.out.println (thread + " created by " + Thread.currentThread());
	}
	
//	public static void main (String[] args) {
//		PlottedShuttle shuttle = new AnObservablePlottedShuttle(50, 100);
//		OEFrame oeFrame = ObjectEditor.edit(shuttle);
//		oeFrame.hideMainPanel();
//		oeFrame.setSize (450, 450);
//		FancyShuttleAnimator shuttleAnimator = new AConcurrentShuttleAnimator(shuttle);
//		ObjectEditor.edit(shuttleAnimator);
//	}

}
