package lectures.animation.threads.wait_notify;

import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.graphics.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class OrdinaryAndVIPShuttleAnimatorDriver  extends ConcurrentShuttleLaunchAnimation {
	public static final int ANIMATOR_FRAME_HEIGHT = 125;
	public static final int CLEARANCE_FRAME_WIDTH = 200;
	public static final int CLEARANCE_FRAME_HEIGHT = 150;
	static int animatorNumber;
	
	public static void displayShuttleAnimator(ShuttleAnimator shuttleAnimator1) {
		OEFrame frame = ObjectEditor.edit(shuttleAnimator1);
		frame.setLocation(START_FRAME_X + (animatorNumber * SHUTTLE_FRAME_WIDTH), START_FRAME_Y + SHUTTLE_FRAME_HEIGHT);
		frame.setSize(SHUTTLE_FRAME_WIDTH, ANIMATOR_FRAME_HEIGHT);
		animatorNumber++;
	}	
	public static void main(String[] args) {
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		displayShuttleFrame(shuttle1);		
		PlottedShuttle shuttle2 = new AnObservablePlottedShuttle(SHUTTLE2_X, SHUTTLE2_Y);
		displayShuttleFrame(shuttle2);	
		ClearanceManager clearanceManager = new AClearanceManager();
		ShuttleAnimator shuttleAnimator1 = new AShuttleAnimatorGivingClearance(shuttle1, clearanceManager);		
		displayShuttleAnimator(shuttleAnimator1);
		ShuttleAnimator shuttleAnimator2 = new AShuttleAnimatorWatitingForClearance(shuttle2, clearanceManager);
		displayShuttleAnimator(shuttleAnimator2);
	}	
}
