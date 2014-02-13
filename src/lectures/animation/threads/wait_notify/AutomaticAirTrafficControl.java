package lectures.animation.threads.wait_notify;

import lectures.animation.loops.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class AutomaticAirTrafficControl  {	
	static final int SHUTTLE_FRAME_X = 50;
	static final int START_FRAME_Y = 50;
	static final int FRAME_WIDTH = 400;
	static final int FRAME_HEIGHT = 275;
	static final int ANIMATION_FRAME_X = SHUTTLE_FRAME_X + FRAME_WIDTH;
	static int shuttleNumber = 0;
	static void createAndDisplayShuttleAndAnimator(int shuttleX, int shuttleY,  Lock aLock) {
		int frameY = START_FRAME_Y + shuttleNumber*FRAME_HEIGHT;
		PlottedShuttle shuttle = new AnObservablePlottedShuttle(shuttleX, shuttleY );		
		OEFrame shuttleFrame = ObjectEditor.edit(shuttle);
		shuttleFrame.hideMainPanel();
		shuttleFrame.setLocation(SHUTTLE_FRAME_X, frameY);
		shuttleFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		ShuttleAnimator shuttleAnimator = new AControlledShuttleAnimator(shuttle, aLock);
		OEFrame animatorFrame = ObjectEditor.edit(shuttleAnimator);
		animatorFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		animatorFrame.setLocation(ANIMATION_FRAME_X, frameY);
		shuttleNumber++;
	}
	public static void main(String[] args) {
		Lock lock = new ALock();
		createAndDisplayShuttleAndAnimator(100, 100, lock);
		createAndDisplayShuttleAndAnimator(100, 50, lock);
		createAndDisplayShuttleAndAnimator(50, 50, lock);		
	}	
}
