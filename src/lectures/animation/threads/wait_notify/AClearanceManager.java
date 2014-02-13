package lectures.animation.threads.wait_notify;

import util.annotations.ComponentWidth;
import util.annotations.Row;
import bus.uigen.ObjectEditor;

public class AClearanceManager implements ClearanceManager {
//	boolean clearance;
	@Row(0)
	@ComponentWidth(100)
//	@Label("Proceed")
	public synchronized void proceed() {
//		clearance = true;
		notify();
	}
	public synchronized void waitForProceed() {
//		if (!clearance) {
			try {
				wait();
//				clearance = false;
			} catch (Exception e) {
				e.printStackTrace();
			}
//		}
	}
	public static void main(String[] args) {
		ObjectEditor.edit(new AClearanceManager());
	}
}
