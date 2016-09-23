package lectures.animation.threads.wait_notify;

import java.beans.PropertyChangeListener;

import lectures.inheritance.InheritingStringDatabase;
import lectures.inheritance.extra.AnObservableStringSet;
import lectures.mvc.properties.APropertyListenerSupport;
import lectures.mvc.properties.PropertyListenerSupport;
import util.annotations.ComponentWidth;
import util.annotations.Row;
import util.models.AListenableVector;
import util.models.ListenableVector;
import bus.uigen.ObjectEditor;
/*
 Does the println after notify ever not follow the println before notify?
 Does the println after wait ever not follow the println before wait?
 Does the wait ended message ever not follow wait started?
 Does the same thread ever execute both wait and notify?
 */
public class AClearanceManager implements ClearanceManager {
	ListenableVector waitingThreads = new AListenableVector<>();
	PropertyListenerSupport propertyListenerSupport = new APropertyListenerSupport();
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
				String aThreadID = Thread.currentThread().toString();
				System.out.println( aThreadID + ": before wait");
				waitingThreads.addElement(aThreadID);
				wait(); // Defined in call Object. Hover over it to see its explanation. Think of a monitor as simply an object.
				System.out.println( aThreadID + ": after wait");
				waitingThreads.removeElement(aThreadID);
			} catch (Exception e) {
				e.printStackTrace();
			}
//		}
	}
	@Row(2)
	public ListenableVector getWaitingThreads() {
		return waitingThreads;

	}
	@Override
	public void addPropertyChangeListener(PropertyChangeListener arg0) {
		propertyListenerSupport.add(arg0);
	}

}
