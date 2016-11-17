package lectures.animation.threads.wait_notify;

import lectures.animation.threads.wait_notify.lock.Lock;
import lectures.inheritance.InheritingStringDatabase;
import util.models.ListenableVector;
import util.models.PropertyListenerRegisterer;

public interface ComplicatedLock extends Lock, PropertyListenerRegisterer {
	public ListenableVector getWaitingThreads() ;
}
