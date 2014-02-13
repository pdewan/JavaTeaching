package lectures.animation.threads.wait_notify;

import lectures.animation.threads.ui.AConcurrentShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;

public class AShuttleAnimatorWatitingForClearance extends AConcurrentShuttleAnimator {
	ClearanceManager sequencer;
	public AShuttleAnimatorWatitingForClearance(PlottedShuttle theShuttle, ClearanceManager aSequencer) {
		super(theShuttle);
		sequencer = aSequencer;
	}
	protected void animateYFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime, int startY, int endY) {	
		sequencer.waitForProceed();
		super.animateYFromOrigin(shuttle, animationStep, animationPauseTime, startY, endY);
	}
}
