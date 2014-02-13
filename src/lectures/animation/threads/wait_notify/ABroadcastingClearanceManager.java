package lectures.animation.threads.wait_notify;

import util.annotations.ComponentWidth;
import util.annotations.Row;

public class ABroadcastingClearanceManager extends AClearanceManager 
					implements BroadcastingClearanceManager {

	@Row(1)
	@ComponentWidth(100)
	public synchronized void proceedAll() {
//		clearance = true;
		notifyAll();		
	}
}
