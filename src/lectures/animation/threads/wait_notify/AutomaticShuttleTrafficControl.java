package lectures.animation.threads.wait_notify;

import lectures.animation.loops.ShuttleAnimator;
import lectures.animation.threads.ui.FancyShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class AutomaticShuttleTrafficControl extends ManualShuttleTrafficControl {
	static final int SHUTTLE3_X = 50;
	static final int SHUTTLE3_Y = 50;
	static final int SHUTTLE_FRAME_X = 50;
	static final int START_FRAME_Y = 50;
	static final int FRAME_WIDTH = 400;
	static final int FRAME_HEIGHT = 275;
	static final int ANIMATION_FRAME_X = SHUTTLE_FRAME_X + FRAME_WIDTH;
	static int shuttleNumber = 0;
	static final int ANIMATION_PAUSE_TIME = 500;
	static void createAndDisplayShuttleAndAnimator(int shuttleX, int shuttleY,  Lock aLock) {
		int aFrameY = START_FRAME_Y + shuttleNumber*FRAME_HEIGHT;
		PlottedShuttle aShuttle = new AnObservablePlottedShuttle(shuttleX, shuttleY );		
		OEFrame aShuttleFrame = ObjectEditor.edit(aShuttle);
		aShuttleFrame.hideMainPanel();
		aShuttleFrame.setLocation(SHUTTLE_FRAME_X, aFrameY);
		aShuttleFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		FancyShuttleAnimator aShuttleAnimator = new AControlledShuttleAnimator(aShuttle, aLock);
		aShuttleAnimator.setAnimationPauseTime(ANIMATION_PAUSE_TIME);
		OEFrame anAnimatorFrame = ObjectEditor.edit(aShuttleAnimator);
		anAnimatorFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		anAnimatorFrame.setLocation(ANIMATION_FRAME_X, aFrameY);
		shuttleNumber++;
	}
	public static void main(String[] args) {
		Lock lock = new ALock();
		createAndDisplayShuttleAndAnimator(SHUTTLE1_X, SHUTTLE1_Y, lock);
		createAndDisplayShuttleAndAnimator(SHUTTLE2_X, SHUTTLE2_Y, lock);
		createAndDisplayShuttleAndAnimator(SHUTTLE3_X, SHUTTLE3_Y, lock);		
	}	
}
