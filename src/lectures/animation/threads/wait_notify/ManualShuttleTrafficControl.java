package lectures.animation.threads.wait_notify;

import util.models.AListenableVector;
import lectures.animation.loops.ShuttleAnimator;
import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.inheritance.AnInheritingStringSet;
import lectures.inheritance.extra.AnObservableStringSet;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import bus.uigen.attributes.AttributeNames;
/*
 COLLABORATING THREADS AND WAIT/NOTOFY
 So far,we have seen threads that are independent of each other, those that interfere
 with each other and those that try not to step on each others toes.
 In none of these cases did a thread depend on another thread to do its job. Now we
 will create threads that do, and hence form a team collaborating with each other.
 
 Run the program. Two shuttle animators will be created,
 one for  animating each shuttle. Neither of them knows about the other. They do know about the 
 central clearance manager, one of which is created. It provides a button to proceed.
 It also shows a queue of waiting threads.

 Run the animateShuttle command in each animator. What happens? 
 Press the proceed command once, pause, and press proceed again. What happens on each proceed?
 What happens in the shuttle frames?
 What happens in the clearance manager frame?
 What causes the queue to change?
 Does the queue ever have all threads?
 
 You can repeat this process many times.

 Any theory on what is happening?
 
 The shuttle animator is different now. Have a look at it.
 Look also at the class AClearanceManager instantiated by the factory class, ClearanceManagerFactory, which makes the calls
 to the the methods wait() and notify() inherited from Object.
 
 Answer the questions in the clearance manager class. 
 
 */
public class ManualShuttleTrafficControl extends ConcurrentShuttleLaunchAnimation {

	public final static int ANIMATOR_FRAME_HEIGHT = 125;
	public final static int CONTROL_FRAME_WIDTH = 250;
	public final static int CONTROL_FRAME_HEIGHT = 180;
	static int animatorNumber;	
	public static void displayShuttleAnimator(ShuttleAnimator shuttleAnimator1) {
		OEFrame frame = ObjectEditor.edit(shuttleAnimator1);
		frame.setLocation(START_FRAME_X + (animatorNumber * SHUTTLE_FRAME_WIDTH), START_FRAME_Y + SHUTTLE_FRAME_HEIGHT);
		frame.setSize(SHUTTLE_FRAME_WIDTH, ANIMATOR_FRAME_HEIGHT);
		animatorNumber++;
	}		
	public static void displayControlFrame(Object aController) {
		ObjectEditor.setPropertyAttribute(AListenableVector.class, "element", AttributeNames.COMPONENT_WIDTH, CONTROL_FRAME_WIDTH);
		OEFrame frame = ObjectEditor.edit(aController);
		frame.setLocation(START_FRAME_X,  START_FRAME_Y + SHUTTLE_FRAME_HEIGHT/2);
		frame.setSize(CONTROL_FRAME_WIDTH, CONTROL_FRAME_HEIGHT);
	}
	public static void main(String[] args) {
		ClearanceManager aClearanceManager = ClearanceManagerFactory.getClearanceManager();
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		displayShuttleFrame(shuttle1);
		ShuttleAnimator shuttleAnimator1 = new AShuttleAnimatorWatitingForClearance(shuttle1, aClearanceManager);
		displayShuttleAnimator(shuttleAnimator1);
		PlottedShuttle shuttle2 = new AnObservablePlottedShuttle(SHUTTLE2_X, SHUTTLE2_Y);
		displayShuttleFrame(shuttle2);		
		ShuttleAnimator shuttleAnimator2 = new AShuttleAnimatorWatitingForClearance(shuttle2, aClearanceManager);
		displayShuttleAnimator(shuttleAnimator2);
		displayControlFrame(aClearanceManager);
	}
}
