package lectures.animation.threads_commands;

public class ThreadSupport {
	
	public static void sleep(long interval) {
		try {
			Thread.sleep(interval);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
