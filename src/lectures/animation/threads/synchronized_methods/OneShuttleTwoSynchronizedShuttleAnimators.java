package lectures.animation.threads.synchronized_methods;

import lectures.animation.loops.ShuttleAnimator;
import lectures.animation.threads_commands.ConcurrentShuttleLaunchAnimation;
import lectures.animation.threads_commands.ThreadSupport;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class OneShuttleTwoSynchronizedShuttleAnimators extends ConcurrentShuttleLaunchAnimation  {	
	public static void main(String[] args) {
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(50, 100);
		OEFrame oeFrame = ObjectEditor.edit(shuttle1);
		oeFrame.hideMainPanel();
		oeFrame.setSize(400, 400);
		ShuttleAnimator aShuttleAnimator1 = new ASynchronizedShuttleAnimator();
		ShuttleAnimator aShuttleAnimator2 = new ASynchronizedShuttleAnimator();
		concurrentDemoShuttleAnimation(aShuttleAnimator1, shuttle1);
		ThreadSupport.sleep(500);
		concurrentDemoShuttleAnimation(aShuttleAnimator2, shuttle1);	
	}
}
