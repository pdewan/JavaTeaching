package lectures.animation.threads.wait_notify.lock;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.models.AListenableVector;
import util.models.ListenableVector;
import util.models.PropertyListenerRegisterer;
import lectures.animation.threads.wait_notify.ComplicatedLock;
import lectures.inheritance.InheritingStringDatabase;
import lectures.inheritance.extra.AnObservableStringSet;
import lectures.mvc.collections.AnObservableStringHistory;
import lectures.mvc.collections.ObservableStringHistory;
import lectures.mvc.properties.PropertyListenerSupport;
import lectures.mvc.properties.atomic.APropertyListenerSupport;
/**
 * This class describes how a lock can be implemented using wait and notify.
 * Study the code and answer the questions below.
 *
 */
public class ALock implements Lock {
	
	protected boolean locked = false;	
//	protected boolean locked = true;	switch the two declarations when asked
	@Override
	public 	
		synchronized // comment this out when asked
		void getLock() {
		System.out.println (Thread.currentThread() + " waiting for lock:" + this);
		if (locked) {			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println (Thread.currentThread() + " got lock:" + this);
		locked = true; // comment out when asked
	}
	@Override
	public 
		synchronized // comment this out when asked
			void releaseLock() {
		locked = false;
		System.out.println (Thread.currentThread() + " releasing lock:" + this);
		notify();
//		notifyAll(); // replace notify() with notifyAll() when asked
		System.out.println (Thread.currentThread() + " returning from releaseLock:");
	}	
	public boolean isLocked() {
		return locked;
	}	
}
/*
 * Run the main program again,  look at the console output.
 * 
 * Search in the console for the strings "waiting for lock" and "got lock:"
 * 
 * The "waiting for lock" print is immediately followed by the "got lock" print:
 *  (a) once
 *  (b) twice
 *  (c) thrice
 *  (d) none of the above
 * 
 * The "waiting for lock" print is eventually followed by the "got lock" print:
 *  (a) once
 *  (b) twice
 *  (c) thrice
 *  (d) none of the above
 * 
 * Search in the console for the strings: "releasing lock" and "returning from releaseLock"
 * 
 * The "releasing lock" print is immediately followed by the "returning from releaseLock" print:
 *  (a) once
 *  (b) twice
 *  (c) thrice
 *  (d) none of the above
 *  
  * The "releasing lock" print is eventually followed by the "returning from releaseLock" print:
 *  (a) once
 *  (b) twice
 *  (c) thrice
 *  (d) none of the above 
 *  
 *  Each "releasing lock" print is eventually followed by a "got lock" print
 *  (a) once
 *  (b) twice
 *  (c) thrice
 *  (d) none of the above
 *  
 *  (T/F) The wait() method call on an object blocks the executing thread until another thread
 *  executed notify() method on the object.
 *  
 *  Now look at the thread names printed in the print statements and the order
 *  in which lock requests are made and the order in which the locks are received.
 *  
 *  (T/F) Threads are unblocked from wait() calls in the order in which they made
 *  the calls.
 *  
 *  Replace the notify() call with the notifyAll() call.
 *  
 *  Run the main program and observe the behavior.
 *  
 *  (T/F) notifyAll() unblocks all waiting threads.
 *  
 *  Comment out the call to notify().
 *  
 *  What do you think will happen?
 *  
 *  Run the main program.
 *  
 *  When notify() is not called, the number of animations that complete is:
 *  (a) one
 *  (b) two
 *  (c) three
 *  (d) zero
 *  
 *  Replace notifyAll() with notify()
 *  
 *  Comment out the synchronized keywords in the two methods.
 *  
 *  Run the main program if there are no compile errors.
 *  
 *  (T/F) If a wait() or notify() call is made in an unsynchronized method,
 *  then the compiler gives an error.
 *  
 *  (T/F) If a wait() or notify() call is made in an unsynchronized method,
 *  then a runtime exception is thrown when the calls are made.
 *  
 *  (T/F) wait() and notify() should execute in synchronized methods as they
 *  access a common queue
 *  
 *  Uncomment the two keywords.
 *  
 *  Comment out the assignment to locked in lock().
 *  What do you think will happen?
 *  
 *  Run the main program
 *  
 *  (T/F) If lock variable is not set in the getLock() method, 
 *  then there is no coordination among the threads.
 *  
 *  Restore the assignment.
 *  
 *  Change the declaration of locked so it is initially true.
 *  
 *  What do you think will happen?
 *  
 *  If the lock variable is initially true, then the number of animations that
 *  complete are:
 *  (a) one
 *  (b) two
 *  (c) three
 *  (d) zero
 *  
 *  Restore the original declaration.
 *  
 *  Next class: AControlledShuttleAnimator
 */
