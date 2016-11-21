package lectures.generics_adapters;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
/**
 * This class motivates the need for generics.
 * 
 * Look at the code.
 * 
 * Go to AnObjectHistory to see how it is different from AStringHistory studied
 * before.
 *
 * Answer questions below.
 */
public class ObjectHistoryUser {
	public static void manipulatePoints() {
		ObjectHistory aPointHistory = new AnObjectHistory();
		/*
		 * Swap the two addElements when asked
		 */
		aPointHistory.addElement(new ACartesianPoint(0, 1));
//		aPointHistory.addElement("hello");
		
		/*
		 * Swap the two printlns when asked
		 */
		System.out.println (((Point)aPointHistory.elementAt(0)).getX());
//		System.out.println (aPointHistory.elementAt(0).getX());
	}
	public static void manipulateStrings() {
		ObjectHistory aStringHistory = new AnObjectHistory();
		/*
		 * Swap the two addElements when asked
		 */
//		aStringHistory.addElement(new ACartesianPoint(0, 1));
		aStringHistory.addElement("hello");
		
		/*
		 * Swap the two printlns when asked
		 */
		System.out.println (((String)aStringHistory.elementAt(0)).charAt(0));
//		System.out.println ((aStringHistory.elementAt(0)).charAt(0));
	}
	public static void main (String[] args) {
		manipulatePoints();
		manipulateStrings();		
	}	
}
/*
 * (T/F) The element type of AnObjectHistory is a String
 * 
 * (T/F) An instance of AnObjectHistory can have String elements.
 * 
 * (T/F) AnObjectHistory can be instantiated to create a history of any type of
 * element.
 * 
 * Run the program.
 * (T/F) Executing the original program results in runtime programs.
 * 
 * In manipulateStrings() swap the two addElement() calls, and run it if there
 * are no compile errors.
 * 
 * (T/F) Swapping the two addElement() calls results in a compile error.
 * (T/F) Swapping the  two addElement() calls results in a runtime error.
 * 
 * Next, in manipulateStrings() swap the two println() calls, and run if there
 * are no compile errors.
 * 
 * (T/F) Swapping the two println() calls results in a compile error.
 * (T/F) Swapping the  two println()  calls results in a runtime error.
 * 
 * (T/F) String elements of AnObjectHistory must be cast to String if String operations
 * are to be executed on them.
 * 
 * Recall that AStringHistory was a history with String elements.
 * 
 * (T/F) String elements of AStringHistory must be cast to String if String operations
 * are to be executed on them.
 * 
 * (T/F) AnObjectHistory is more versatile than AStringHistory - it can be used
 * to create more kinds of histories and thus used in a greater variety of applications.
 * 
 * (T/F) AnObjectHistory is less safe than AStringHistory - it can lead to 
 * class cast exceptions when elements are to be manipulated in different applications.
 */
