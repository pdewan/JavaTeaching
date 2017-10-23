package lectures.animation.threads.wait_notify;

import lectures.animation.threads.ui.FancyShuttleAnimator;
import lectures.animation.threads.wait_notify.lock.AControlledShuttleAnimator;
import lectures.animation.threads.wait_notify.lock.ALock;
import lectures.animation.threads.wait_notify.lock.Lock;
import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/*
 LOCK BASED ON WAIT AND NOTIFY
  An important concept in computer science is the concept of a "lock".
  This example illustrated what that means and how it can be implemented using wait and notify.
  It is much like the "traffic control" we saw earlier except that the control is done not by
  an interactive clearance manager "traffic policemen" but by a programmer lock object serving as
  automatic traffic lights.
   
  Run this program. Three shuttle animators will be created,
  one for animating each shuttle. Neither of them knows about the other. They do know about the 
  central lock object, one of which is created. 
  Run the animateShuttle command in each animator in quick succession. 
  What happens in the shuttle frames?
  What happens in the lock frame, which shows the lock status and a queue of waiting threads.
  What causes the lock status to become true?
  What causes it to become false?
  What causes the queue to change?
  Does the lock queue ever have all threads?
  
 The shuttle animator is different now. Have a look at it.
 
 Look also at the class ALock instantiated below, which makes the calls
 to the the methods wait() and notify() inherited from Object.
 
 Can you define what a computer lock is and why it is so called?
 */
public class InteractiveAutomaticShuttleTrafficControl extends ManualShuttleTrafficControl {
	static final int SHUTTLE3_X = 50;
	static final int SHUTTLE3_Y = 50;
	static final int SHUTTLE_FRAME_X = 50;
	static final int START_FRAME_Y = 50;
	static final int FRAME_WIDTH = 400;
	static final int FRAME_HEIGHT = 275;
	static final int ANIMATION_FRAME_X = SHUTTLE_FRAME_X + FRAME_WIDTH;
	static int shuttleNumber = 0;
	static final int ANIMATION_PAUSE_TIME = 500;
	static void createAndDisplayShuttleAndAnimator(int shuttleX, int shuttleY,  Lock aLock1, Lock aLock2) {
		int aFrameY = START_FRAME_Y + shuttleNumber*FRAME_HEIGHT;
		PlottedShuttle aShuttle = new AnObservablePlottedShuttle(shuttleX, shuttleY );		
		OEFrame aShuttleFrame = ObjectEditor.edit(aShuttle);
		aShuttleFrame.hideMainPanel();
		aShuttleFrame.setLocation(SHUTTLE_FRAME_X, aFrameY);
		aShuttleFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		FancyShuttleAnimator aShuttleAnimator = new AControlledShuttleAnimator(aShuttle, aLock1, aLock2);
		aShuttleAnimator.setAnimationPauseTime(ANIMATION_PAUSE_TIME);
		OEFrame anAnimatorFrame = ObjectEditor.edit(aShuttleAnimator);
		anAnimatorFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		anAnimatorFrame.setLocation(ANIMATION_FRAME_X, aFrameY);
		shuttleNumber++;
	}
	
	public static void main(String[] args) {
		Lock aLock1 = new ALock();
		Lock aLock2 = new ALock();
		createAndDisplayShuttleAndAnimator(SHUTTLE1_X, SHUTTLE1_Y, aLock1, aLock2);
		createAndDisplayShuttleAndAnimator(SHUTTLE2_X, SHUTTLE2_Y, aLock1, aLock2);
		createAndDisplayShuttleAndAnimator(SHUTTLE3_X, SHUTTLE3_Y, aLock1, aLock2);	
//		displayControlFrame(aLock1);
	}	
}
