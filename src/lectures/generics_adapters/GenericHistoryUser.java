package lectures.generics_adapters;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
/**
 * This class illustrates the use of generics.
 * 
 * Look at the code.
 * 
 * 
 * Answer questions below.
 */
public class GenericHistoryUser {
	public static void manipulatePoints() {
		History<Point> aPointHistory = new AHistory<Point>();
		System.out.println ("The class of aPointHistory is:" + aPointHistory.getClass());
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
		History<String> aStringHistory = new AHistory<String>();
		System.out.println ("The class of aStringHistory is:" + aStringHistory.getClass());
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
 * (T/F) The element type of AHistory is a String
 * 
 * (T/F) An instance of AHistory can have String elements.
 * 
 * (T/F) AHistory can be instantiated to create a history of any type of
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
 * (T/F) String elements of AHistory must be cast to String if String operations
 * are to be executed on them.
 * 
 * Recall that AStringHistory was a history with String elements.
 * 
 * (T/F) String elements of AStringHistory must be cast to String if String operations
 * are to be executed on them.
 * 
 * (T/F) AHistory is more versatile than AStringHistory - it can be used
 * to create more kinds of histories and thus used in a greater variety of applications.
 * 
 * (T/F) AHistory is less safe than AStringHistory - it can lead to 
 * class cast exceptions when elements are to be manipulated in different applications.
 */
