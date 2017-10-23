package lectures.animation.threads.wait_notify.lock;

import lectures.animation.threads.ui.FancyShuttleAnimator;
import lectures.animation.threads.wait_notify.AComplicatedLock;
import lectures.animation.threads.wait_notify.ManualShuttleTrafficControl;
import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/**
 * LOCK BASED ON WAIT AND NOTIFY
 * This class shows the use of locks.
 * It creates two lock objects that are then passed to shuttle animators
 * to coordinate their animations.
 *  
 * Run this program. Three shuttle animators will be created,
 * one for animating each shuttle. 
 * 
 * Observe the behavior.
 * 
 * The three animators
 * (a) run serially,  that is, while one animator is executing, other animators wait.
 * (b) animate in the Y direction serially, that while one animator is animating
 * in the Y direction, the other animators do not animate in the Y direction.
 * (c) animate in the X and Y direction serially, that is while one animator is 
 * animating in the X (Y) direction, the other animators do not animate in the X (Y)
 * direction.
 * (c) run without any coordination.
 * 
 * 
 * Look at the code and answer the questions.
 * 
 */
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
	
	static void createAndDisplayShuttleAndAnimator2(int shuttleX, int shuttleY,  Lock aLock1, Lock aLock2) {
		int aFrameY = START_FRAME_Y + shuttleNumber*FRAME_HEIGHT;
		PlottedShuttle aShuttle = new AnObservablePlottedShuttle(shuttleX, shuttleY );		
		OEFrame aShuttleFrame = ObjectEditor.edit(aShuttle);
		aShuttleFrame.hideMainPanel();
		aShuttleFrame.setLocation(SHUTTLE_FRAME_X, aFrameY);
		aShuttleFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		FancyShuttleAnimator aShuttleAnimator = new AControlledShuttleAnimator(aShuttle, aLock1, aLock2);
		aShuttleAnimator.setAnimationPauseTime(ANIMATION_PAUSE_TIME);
		aShuttleAnimator.animateShuttle();
		shuttleNumber++;
	}
	public static void main(String[] args) {
		Lock aLock1 = new ALock();
		Lock aLock2 = new ALock();
		createAndDisplayShuttleAndAnimator2(SHUTTLE1_X, SHUTTLE1_Y, aLock1, aLock2);
		createAndDisplayShuttleAndAnimator2(SHUTTLE2_X, SHUTTLE2_Y, aLock1, aLock2);
		createAndDisplayShuttleAndAnimator2(SHUTTLE3_X, SHUTTLE3_Y, aLock1, aLock2);	
	}	
/**
 * Each (controlled shuttle) animator knows about, that is, has reference to 
 *   (a) each of the other two animators
 *   (b) two shared lock objects
 *   (c) none of the above
 * 
 * Go to ALock
 * 
 *
 */
}
