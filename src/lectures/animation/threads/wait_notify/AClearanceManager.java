package lectures.animation.threads.wait_notify;

import util.annotations.ComponentWidth;
import util.annotations.Row;
import bus.uigen.ObjectEditor;
/*
 Does the println after notify ever not follow the println before notify?
 Does the println after wait ever not follow the println before wait?
 Does the wait ended message ever not follow wait started?
 Does the same thread ever execute both wait and notify?
 */
public class AClearanceManager implements ClearanceManager {
	@Row(0)
	@ComponentWidth(100)
	public synchronized void proceed() {
		System.out.println( Thread.currentThread() + ": before notify");
		notify(); // Defined in call Object. Hover over it to see its explanation. Think of a monitor as simply an object.
		System.out.println( Thread.currentThread() + ": after notify");
	}
	public 
//		 Comment out the synchronized keyword. What error do you get? 
		synchronized 
			void waitForProceed() {
			try {
				System.out.println( Thread.currentThread() + ": before wait");
				wait(); // Defined in call Object. Hover over it to see its explanation. Think of a monitor as simply an object.
				System.out.println( Thread.currentThread() + ": after wait");
			} catch (Exception e) {
				e.printStackTrace();
			}
//		}
	}
	
}
