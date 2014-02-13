package lectures.animation.threads.wait_notify;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import lectures.animation.loops.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;

public class ManualSimultaneousShuttleLaunchAnimation extends ManualShuttleTrafficControl {
	
	// can we use factory methods here?
	public static void main(String[] args) {		
		ClearanceManager clearanceManager = new ABroadcastingClearanceManager();
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
