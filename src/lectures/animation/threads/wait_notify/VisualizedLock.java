package lectures.animation.threads.wait_notify;

import lectures.inheritance.StringDatabase;
import util.models.ListenableVector;
import util.models.PropertyListenerRegisterer;

public interface VisualizedLock extends Lock, PropertyListenerRegisterer {
	public ListenableVector getWaitingThreads() ;
}
