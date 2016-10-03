package lectures.inheritance.extra;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.inheritance.is_a.Locatable;
// MULTIPLE CLASS INHERITANCE
public class ALocatableStringHistory 
	extends AStringHistory
	implements Locatable, StringHistory // a class implementing multiple interfaces
// Comment this out and see that you will get an error
//	, ALocatable
// Why is multiple inheritance not allowed?	
	
	
// Hint: both ALocatable and AStringHistory have an implementation of toString() methods
{

// MULTIPLE INTERFACE IMPLEMENTATION
	public static void typingThisClass() {
		Locatable aLocatable = new ALocatableStringHistory();
		StringHistory aStringHistory = new ALocatableStringHistory();
		// uncomment the statements below and see which give errors 
//		aLocatable.addElement("Joe Doe");
//		aLocatable.setX(10);
//		aStringHistory.addElement("Joe Doe");
//		aStringHistory.setX(10);
		
		//how to type this class using an interface so all of its operations are accessible?
	}
	
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int newVal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setY(int newVal) {
		// TODO Auto-generated method stub
		
	}
}
