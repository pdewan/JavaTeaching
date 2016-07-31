package lectures.animation.threads.synchronized_methods;

import lectures.animation.loops.ShuttleAnimator;
import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.animation.threads_commands.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
// ONE SYNCHRONIZED INSTANCE METHOD, TWO INSTANCES
// This is the same example as its superclass except that this time we create two instances of
// the shuttle animator class.
// Run the program. Observe the animation behavior and console output.
// Does the synchronized method execute simultaneously in the two instances?

// Do you need to further refine your theory about synchronized methods?

public class OneShuttleTwoSynchronizedShuttleAnimators extends SynchronizedConcurrentShuttleAnimations  {	
	public static void main(String[] args) {
		PlottedShuttle aShuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		displayShuttleFrame(aShuttle1);
		ShuttleAnimator aShuttleAnimator1 = new ASynchronizedShuttleAnimator();
		ShuttleAnimator aShuttleAnimator2 = new ASynchronizedShuttleAnimator();
		concurrentDemoShuttleAnimation(aShuttleAnimator1, aShuttle1);
		ThreadSupport.sleep(SECOND_THREAD_DELAY);
		concurrentDemoShuttleAnimation(aShuttleAnimator2, aShuttle1);	
	}
}
