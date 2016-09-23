package lectures.animation.threads.wait_notify;

import lectures.inheritance.InheritingStringDatabase;
import util.models.ListenableVector;
import util.models.PropertyListenerRegisterer;

public interface Lock extends BasicLock, PropertyListenerRegisterer {
	public ListenableVector getWaitingThreads() ;
}
