package lectures.mvc.properties.atomic;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.misc.ThreadSupport;
import lectures.graphics.ALine;
import lectures.graphics.Line;
import lectures.mvc.properties.PropertyListenerSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;

/**
 * This class is a subclass of the one we just left that performs the same task
 * in a different (better?) way.
 * 
 * The code in this class, AnObservableLine, makes an "observable" version of
 * the code it inherits, ANonObservableLine.
 * 
 * An "observable" interacts with its "observers".
 * 
 * A listener == observer 
 * 
 * The goal of this praxis is to help explain to what an observable and observer
 * exactly mean in Computer Science.
 *  
 * Study also the class, APropertyListenerSupport, used in this code.
 *  
 * Then skip down to the instructions at the end of the main() and start there.
 *
 */
public class AnObservableLine extends ANonObservableLine implements ObservableLine  {
	
	PropertyListenerSupport propertySupport = new APropertyListenerSupport();
	
	public AnObservableLine (int initX, int initY, int initWidth, int initHeight) {
		super(initX, initY, initWidth, initHeight);
	}
	
	@Override
	public void setX(int newVal) {
		int oldVal = getX(); // save old value of X
		super.setX(newVal); // change x
		
		// put breakpoint here and step into notifyAllListeners
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "X", oldVal,
				newVal));
	}
/*
 * Follow these instructions when asked.
 * 
 * Hover over PropertyChangeEvent to see the associated documentation.
 * 
 * After looking at this call, go into APropertyListenerSupport, look at the
 * notifyAllListeners() method, and answer the questions in it.
 * 
 * A setter in an observable notifies observers about (choose all that apply):
 * (a) the name of the property that changed.
 * (b) the old value of the property before the setter was called.
 * (c) the new value of the property set by the method.
 * (d)  the original value of the property, right after the object was
 *  initialized by its constructor 
 *  
 *  
 * 
 */
	@Override
	public void setY(int newVal) {
		int oldVal = getY();
		super.setY(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Y", oldVal,
				newVal));
	}
	@Override
	public void setWidth(int newVal) {
		int oldVal = getWidth();
		super.setWidth(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Width", oldVal,
				newVal));
	}
	
	@Override
	public void setHeight(int newVal) {
		int oldVal = getHeight();
		super.setHeight(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Height", oldVal,
				newVal));
	}
	
	/**
	 * This is the observer registration method.
	 * Follow the instructions associated with it when asked.
	 */
	@Override
	public void addPropertyChangeListener(PropertyChangeListener aListener) {
		/*
		 * Put breakpoint in the statement in this method and debug-run.
		 */		 
		propertySupport.add(aListener); 
/*
 * 
 * Look at the bottom two methods in the stack (in the debug window). Each method
 * in the stack was called by the method below it, so looking at the bottom can help
 * you see how you got to this break point.
 * 
 * Now, hover over the parameter, aListener, to determine the class of the
 * object assigned to it.
 * 
 * The method, addPropertyChangeListener, in AnObservableLine, is called:
 *   (a) each time a setter is invoked in  AnObservableLine.
 *   (b) when the main method is invoked in AnObservableLine.
 *   (c) each time ObjectEditor.edit() is called.
 *   
 * The type of the argument of addPropertyChangeListener is an instance of:
 *   (a) ObservableLine
 *   (b) PropertyListenerSupport
 *   (c) PropertyChangeListener
 *   (d) None of the above
 * 
 * 
 * Step into the add method.
 * 
 * The method addPropertyChangeListener:
 * 	 (a) prints the observer passed as an argument.
 *   (b) stores the observer in a history collection implemented by AnObservableLine.
 *   (c) stores the observer in a history collection implemented by APropertyListenerSupport.
*/
		
	}
	/**
	 * Creates an animation displayed in arbitrary number of editors
	 */
	public static void animateLine (Line aLine) {		
		for (int i = 0; i < NUM_STEPS; i++) {
			int newX = aLine.getX() + X_STEP;
			aLine.setX(newX);
			ThreadSupport.sleep(SLEEP_TIME);
			
		}
	}
	/**
	 * Supplies the parameters to animateLine
	 */
	public static void main(String args[]) {
		Line aLine = new AnObservableLine(10, 10, 30, 30);
		OEFrame editor1 = ObjectEditor.edit (aLine);
		OEFrame editor2 = ObjectEditor.edit (aLine);
//		OEFrame editor3 = ObjectEditor.edit (aLine);
		animateLine (aLine);
	}

/*
 * Study the animateLine() and main methods in this class and run the main method to
 * create the animation.
 * 
 * Uncomment the code to create editor3 and change animateLine if necessary to 
 * refresh all three editors.
 * 
 * In ObservableLine, which of the following is required to animate the line in 
 * a third editor:
 * 
 * (a) The header of animateLine() must be changed.
 * (b) The body of animateLine() must be changed.
 * (c) None of the above.
 *
 * 
 * In ObservableLine, which methods are aware of the user-interface code 
 * (OE frames) displaying a line object:  
 *    (a) the main method.
 *    (b) animateLine()
 *    (c) equals()   
 *  
 * The remaining exercises try to explain what makes this code different.
 */
/* 
 * INTUITION
 * 
 * Based on the English meaning of these two terms, which are true:
 * (a) "Observer" objects learn about changes to "observable" objects.
 * (b) "Observable" objects learn about changes to "observer" objects.
 * 
 * If object A must learn about every change to the state of object B as soon as 
 * it occurs:
 * (a) A should periodically ask B about its current state (say every 100 ms).
 * (b) B should inform A about each change to it as soon as it occurs.
 * (c) A should know about B, that is, B should be "registered" with A.
 * (d) B should know about A, that is, A should be "registered" with B.
 * 
 * Which is true, 
 * (a) An observable should allow observers to be registered with it.
 * (b) An observer should allow observables to be registered with it.
 * 
 * Let us now see what are some of the responsibilities of an observer
 * and observer.
 */
/*
 * WRITE AND READ METHODS IN OBSERVABLES
 * 
 * It overrides the write methods.
 * 
 * A write method is one that changes object state. 
 * 
 * A read method is one that reads state.
 * 
 * (T/F) The method getX() inherited by AnObservableLine is a write method.
 * 
 * Class AnObservableLine overrides:
 * (a) all read methods of ANonObservableLine
 * (b) all write methods of ANonObservableLine 
 * 
 * Given that this class defines an observer object, which of the following properties
 * of an observable object are consistent with the code in this class.
 * 
 * To convert (the class of) a non observable object to an observable object:
 * (a) all write methods must be changed.
 * (b) all read methods must be changed.
 * (c) none of the above
 * 
 */
/*
 * OBSERVER REGISTRATION 
 * 
 * addPropertyChangeListener is the observer registration method.
 * 
 * Its header is a standard header, meaning that it has to have a particular
 * form, much like the main method header.
 * 
 * Unlike the main method, the form is defined by the Bean framework rather than Java.
 * 
 * Since it is an instance method, we can put it in an interface.
 * 
 * However, the Bean framework does not define such an interface.
 * 
 * The OE library defines such an interface, called PropertyListenerRegister. 
 * 
 * The observer registration method in AnObservableLine is a method named:
 * 	(a) setX
 * 	(b) propertyChange
 * 	(c) animateLine
 *  (d) addPropertyChangeListener
 *  
 *  The header of the observer registration code in AnObservableLine is:
 * 	(a) a standard header defined by Java.
 * 	(b) a standard header defined by the Bean framework.
 *  (c) a non standard method.
 *  
 * Since it is a standard method, ObjectEditore understands it and calls it
 * from edit(). Specifically, given an object o, edit(o) calls the method with
 * the signature addPropertyChangeListener:PropertyChangeListener-->void on each
 * object in the logical structure of o that defines such a method:
 * 
 * ObjectEditor.edit(o) calls the method with
 * the signature addPropertyChangeListener:PropertyChangeListener-->void:
 * (a) only on o if it implements the method.
 * (b) only on leaf nodes in the logical structure of o that implement the method.
 * (c) only on nodes in the logical structure that implement PropertyListenerRegisterer
 * (d) all nodes in the logical structure that implement the method.
 * 
 * Follow the instructions in the comments surrounding the method. 
 * That is, follow the instructions in addPropertyChangeListener.
 */ 
	
/*
 * OBSERVER NOTIFICATION
 * 
 * Follow the instructions surrounding setX() when asked.
 */	
/*  
 * COMPLETE PATTERN
 * 
 * (T/F) The registration method of AnObservableBMISpreadsheet notifies the 
 * registered observers.
 * 
 * This code illustrates the observer pattern for connecting objects. Which
 * of the following is true about this pattern and this class.
 * 
 * Which is true:
 *	a) An observer object defines a standard method to register one or
 * 	more observable objects. 
 *	b) An observable object defines a standard method to register one or
 * 		more observer objects.
 *  c) None of the above.
 *  
 *  Which is true?
 *  a) Write methods of an observer send change notifications
 *	b) Read methods of an observer send change notifications.
 *  c) Write methods of an observable send change notifications.
 *  d) Read methods of an observable send change notifications.
 * 
 *
 * Which is true (in the Bean framework)?
 * 	a) An observer knows at least one interface of an observable.
 * 	b) An observable knows at least one interface of an observer.
 * 
 * Which is true?
 * 	a) All observers of an observable must implement a common interface.
 *  b) All observables of an observer must implement a common interface.
 * 
 *  
 *  
 
 * 
 */
	
}
