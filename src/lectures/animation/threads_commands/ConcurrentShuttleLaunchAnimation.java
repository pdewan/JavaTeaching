package lectures.animation.threads_commands;

import lectures.animation.loops.AShuttleAnimator;
import lectures.animation.loops.ShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.mvc.properties.AnObservablePlottedShuttle;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

public class ConcurrentShuttleLaunchAnimation  {
	static int threadNumber = 0;
	public static String SHUTTLE_THREAD_NAME = "Shuttle Animation";
	public static int START_FRAME_X = 50;
	public static int START_FRAME_Y = 50;
	public static int SHUTTLE_FRAME_WIDTH = 400;
	public static int SHUTTLE_FRAME_HEIGHT = 300;
	public static int SHUTTLE1_X = 50;
	public static int SHUTTLE1_Y = 100;
	public static int SHUTTLE2_X = 100;
	public static int SHUTTLE2_Y = 50;
	protected static int shuttleNumber = 0;

	public static void concurrentDemoShuttleAnimation(ShuttleAnimator aShuttleAnimator, PlottedShuttle aShuttle) {
		// what if these were executed?
//		aShuttle.setCartesianX(100);
//		aShuttle.setCartesianX(50);		
		Thread thread = new Thread(new AShuttleAnimationCommand(aShuttleAnimator, aShuttle, 5, 100));	
		threadNumber++;
		thread.setName(SHUTTLE_THREAD_NAME + " " + threadNumber);
		thread.start();
	}
	public static void displayShuttleFrame (PlottedShuttle aShuttle, int aFrameX, int aFrameY) {
		OEFrame oeFrame1 = ObjectEditor.edit(aShuttle);
		oeFrame1.hideMainPanel();
		oeFrame1.setLocation(aFrameX, aFrameY);
		oeFrame1.setSize(SHUTTLE_FRAME_WIDTH, SHUTTLE_FRAME_HEIGHT);
	}
	public static void displayShuttleFrame (PlottedShuttle aShuttle) {
		displayShuttleFrame(aShuttle, START_FRAME_X  + (shuttleNumber *SHUTTLE_FRAME_WIDTH) , START_FRAME_Y);
		shuttleNumber++;
	}
	public static void main(String[] args) {
		PlottedShuttle shuttle1 = new AnObservablePlottedShuttle(SHUTTLE1_X, SHUTTLE1_Y);
		PlottedShuttle shuttle2 = new AnObservablePlottedShuttle(SHUTTLE2_X, SHUTTLE2_Y);
		displayShuttleFrame(shuttle1);
		displayShuttleFrame(shuttle2);
		// why two animators?
		ShuttleAnimator shuttleAnimator1 = new AShuttleAnimator();
		ShuttleAnimator shuttleAnimator2 = new AShuttleAnimator();
//		shuttleAnimator1.animateFromOrigin(shuttle1, 5, 100);
//		shuttleAnimator2.animateFromOrigin(shuttle2, 5, 100);
		concurrentDemoShuttleAnimation(shuttleAnimator1, shuttle1);
		concurrentDemoShuttleAnimation(shuttleAnimator2, shuttle2);
	}	
}
