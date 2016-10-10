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
 * This class is a subclass of the one we just left, that performs the same task
 * in a different (better?) way.
 * 
 * It overrides the write methods and re-implements the two setter methods.
 * 
 * A write method is one that changes object state. In a Bean, setters are write
 * methods.
 * 
 * (T/F) The method getX() inherited by AnObservableLine is a write method.  
 *  
 *  Study the code below. 
 *  
 * Study also the class, APropertyListenerSupport, used in this code.
 *  
 * Then follow the instructions below. 
 *
 */
public class AnObservableLine extends ANonObservableLine implements ObservableLine  {
	PropertyListenerSupport propertySupport = new APropertyListenerSupport();
	public AnObservableLine (int initX, int initY, int initWidth, int initHeight) {
		super(initX, initY, initWidth, initHeight);
	}
	
	public void setX(int newVal) {
		int oldVal = getX(); // save old value of X
		super.setX(newVal); // change x
		
		/*
		 * 	
		 * Hover over PropertyChangeEvent to see the associated documentation.
		 * 
		 * Put breakpoint here and step into notifyAllListeners and answer
		 * questions in it.
		 * 
		 * A setter in an observable notifies observers about:
		 * (a) the name of the property that changed.
		 * (b) the old value of the property before the setter was called
		 * (c) the new value of the property set by the method.
		 * (d) the original value of the property, right after the object was
		 *  initialized by its constructor 
		 * 
		 */
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "X", oldVal,
				newVal));
	}
	public void setY(int newVal) {
		int oldVal = getY();
		super.setY(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Y", oldVal,
				newVal));
	}
	public void setWidth(int newVal) {
		int oldVal = getWidth();
		super.setWidth(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Width", oldVal,
				newVal));
	}
	
	public void setHeight(int newVal) {
		int oldVal = getHeight();
		super.setHeight(newVal);
		propertySupport.notifyAllListeners(new PropertyChangeEvent(this, "Height", oldVal,
				newVal));
	}
	
	/**
	 * This is the observer registration method.
	 * 
	 * Its header is a standard header, like a main header.
	 * 
	 * It is defined by the Bean framework rather than Java.
	 * 
	 * Since it is an instance method, we can put in an interface.
	 * 
	 * However, the Framework does not define such an interface.
	 * 
	 * The OE library defines such an interface, called PropertyListenerRegister.
	 * 
	 * Since it is a standard method, ObjectEditore understands it and calls it
	 * from edit().
	 * 
	 *  The header of the observer registration code in AnObservableLine is:
	 * 	(a) a standard header defined by Java.
	 * 	(b) a standard header defined by the Bean framework
	 *  (c) a non standard method
	 */
	@Override
	public void addPropertyChangeListener(PropertyChangeListener aListener) {
		/*
		 * Put breakpoint here.
		 * 
		 * Look at the bottom two methods in the stack.
		 * 
		 * Hover over the parameter, aListener, to determine the class of the
		 * object assigned to it.		 * 
		 * 
		 * The method, addPropertyChangeListener, in AnObservableLine, is called:
		 *   (a) each time a setter is invoked in  AnObservableLine.
		 *   (b) when the main method is invoked in AnObservableLine.
		 *   (c) each time ObjectEditor.edit() is called
		 *   
		 * The class of the argument of addPropertyChangeListener is an instance of:
		 *   (a) AnObservableLine
		 *   (b) APropertyChangeSupport
		 *   (c) PropertyChangeEvent
		 *   (b) LineAdapter		    
		 * 
		 * 
		 * Step into the add method.
		 * 
		 * The method addPropertyChangeListener:
		 * 	 (a) prints the observer passed as an argument.
		 *   (b) stores the observer in a history collection implemented by AnObservableLine.
		 *   (c) stores the observer in a history collection implemented by APropertyListenerSupport
		 */
		propertySupport.add(aListener); //
		
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
	/*
	 * Supplies the parameters to animateLine
	 */
	public static void main(String args[]) {
		Line aLine = new AnObservableLine(10, 10, 30, 30);
		OEFrame editor1 = ObjectEditor.edit (aLine);
		OEFrame editor2 = ObjectEditor.edit (aLine);
//		OEFrame ediitor3 = ObjectEditor.edit (aLine);
		animateLine (aLine);
	}
/*
 *
 * 
 * Comment out the code to create editor3 and change animateLine, if necessary.
 * to refresh all three editors.
 * 
 * (T/F) Code animating an instance of AnObservableLine must know about the
 * user-interface objects displaying it.
 * 
 * 
 * This code illustrates the observer pattern for connecting objects. 
 *  
 * 
 * In this pattern, an "observable" object defines a method to register one or
 * more observer objects.
 * 
 * Each write method of the observable calls a "notification method" in each
 * "observer" to notify it about the change.
 * 
 *  
 * The instance methods implement the observer behavior and the static methods
 * call ObjectEditor.edit() to display an instance of this class.
 * 
 * The edit method, in turn, creates appropriate observers and registers them
 * with the displayed observable.
 * 
 * To see more details of  how this pattern is implemented, 
 * put break points in setX() and  addPropertyChangeListener,
 * debug-run and follow the instructions associated with these break points.
 * 
 * The observer registration method in AnObservableLine is a method named:
 * 	(a) setX
 * 	(b) propertyChange
 *  (c) animateLine
 *  (d)addPropertyChangeListener
 * 
 *  
 */
}
