package lectures.animation.threads.wait_notify;

import lectures.animation.threads_commands.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
/*
 NOTIFY ALL
 This program is like its superclass except that it uses a different implementation of the Clearance
 Manager interface - ABroadcastingClearanceManager.
 
 Run it like the previous one except press proceedAll instead of proceed:
 This means you run the animateShuttle command in each animator and then
 press the proceedAll.
 What happens in the shuttle frames?
 What happens in the clearance manager frame?
 What causes the queue to change?
 Does the queue ever have all threads?
 
 Go to the class ABroadcastingClearanceManager and have a look at the proceedAll method
 which calls the notifyAll method inherited from Object.
 
 Do you understand what notfyAll does?
 */
public class ManualSimultaneousShuttleLaunchAnimation extends ManualShuttleTrafficControl {
	public static void main(String[] args) {
		// Do not use the default clearance manager built into the factory class
		ClearanceManagerFactory.setClearanceManager(new ABroadcastingClearanceManager());
		// Is this not beautiful, we can just call the main from the superclass?
		// The power of interfaces (and the factory class)
		ManualShuttleTrafficControl.main(args); 

	}	

}
