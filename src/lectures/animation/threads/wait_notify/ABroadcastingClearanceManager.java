package lectures.animation.threads.wait_notify;

import util.annotations.ComponentWidth;
import util.annotations.Row;

public class ABroadcastingClearanceManager extends AClearanceManager 
					implements BroadcastingClearanceManager {

	@Row(1)
	@ComponentWidth(100)
	public synchronized void proceedAll() {
		notifyAll(); // not notify, hover over the method and see Java's explanation for it		
	}
}
