package lectures.animation.threads.wait_notify;

import lectures.animation.loops.ShuttleAnimator;
import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
/*
 COLLABORATING THREADS
 So far,we have seen threads that are independent of each other, those that interfere
 with each other and those that try not to step on each others toes.
 In none of these cases did a thread depend on another thread to do its job. Now we
 will create threads that do, and hence form a team collaborating with each other.
 
 The shuttle animator is different now. Have a look at it.
 Look also at the class AClearanceManager instantiated below, which makes the calls
 to the the methods wait() and notify() inherited from Object.
 
 Now that you have seen all of the code, run the program. Two shuttle animators will be created,
 one animating each shuttle. Neither of them knows about the other. They do know about the 
 central clearance manager, one of which is created. It provides a button to proceed.
 
 Run the animateShuttle command in each animator. What happens?
 Press the proceed command once, pause, and press proceed again. What happens on each proceed?
 
 Answer the questions in the clearance manager class. 
 
 */
public class ManualShuttleTrafficControl extends ConcurrentShuttleLaunchAnimation {

	public final static int ANIMATOR_FRAME_HEIGHT = 125;
	public final static int CLEARANCE_FRAME_WIDTH = 200;
	public final static int CLEARANCE_FRAME_HEIGHT = 150;
	static int animatorNumber;	
	public static void displayShuttleAnimator(ShuttleAnimator shuttleAnimator1) {
		OEFrame frame = ObjectEditor.edit(shuttleAnimator1);
		frame.setLocation(START_FRAME_X + (animatorNumber * SHUTTLE_FRAME_WIDTH), START_FRAME_Y + SHUTTLE_FRAME_HEIGHT);
		frame.setSize(SHUTTLE_FRAME_WIDTH, ANIMATOR_FRAME_HEIGHT);
		animatorNumber++;
	}		
	public static void displayClearanceManager(ClearanceManager aClearanceManager) {
		OEFrame frame = ObjectEditor.edit(aClearanceManager);
		frame.setLocation(START_FRAME_X,  START_FRAME_Y + SHUTTLE_FRAME_HEIGHT/2);
		frame.setSize(CLEARANCE_FRAME_WIDTH, CLEARANCE_FRAME_HEIGHT);
	}
	public static void main(String[] args) {
		ClearanceManager clearanceManager = new AClearanceManager();
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		displayShuttleFrame(shuttle1);
		ShuttleAnimator shuttleAnimator1 = new AShuttleAnimatorWatitingForClearance(shuttle1, clearanceManager);
		displayShuttleAnimator(shuttleAnimator1);
		PlottedShuttle shuttle2 = new AnObservablePlottedShuttle(SHUTTLE2_X, SHUTTLE2_Y);
		displayShuttleFrame(shuttle2);		
		ShuttleAnimator shuttleAnimator2 = new AShuttleAnimatorWatitingForClearance(shuttle2, clearanceManager);
		displayShuttleAnimator(shuttleAnimator2);
		displayClearanceManager(clearanceManager);
	}
}
