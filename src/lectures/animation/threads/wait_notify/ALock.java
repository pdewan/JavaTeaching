package lectures.animation.threads.wait_notify;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.models.AListenableVector;
import util.models.ListenableVector;
import util.models.PropertyListenerRegisterer;
import lectures.inheritance.AnObservableStringSet;
import lectures.inheritance.StringDatabase;
import lectures.mvc.collections.AnObservableStringHistory;
import lectures.mvc.collections.ObservableStringHistory;
import lectures.mvc.properties.APropertyListenerSupport;
import lectures.mvc.properties.PropertyListenerSupport;

public class ALock implements Lock {
	ListenableVector waitingThreads = new AListenableVector();
	PropertyListenerSupport propertyListenerSupport = new APropertyListenerSupport();
	protected boolean locked;		
	@Override
	public synchronized void getLock() {
		boolean anOldLocked = locked;
		if (locked) {
			try {
				String aThreadID = Thread.currentThread().toString();
				System.out.println(aThreadID + ": before wait");
				waitingThreads.addElement(aThreadID);
				wait();
				waitingThreads.removeElement(aThreadID);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		locked = true;
		propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Locked", anOldLocked, locked));
	}
	@Override
	public synchronized void releaseLock() {
		boolean anOldLocked = locked;
		locked = false;
		notify();
		propertyListenerSupport.notifyAllListeners(new PropertyChangeEvent(this, "Locked", anOldLocked, locked));

	}
	public ListenableVector getWaitingThreads() {
		return waitingThreads;
	}
	public boolean isLocked() {
		return locked;
	}
	@Override
	public void addPropertyChangeListener(PropertyChangeListener arg0) {
		propertyListenerSupport.add(arg0);
	}
}
