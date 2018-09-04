package lectures.arrays;
/*
  The following is a library class we use for printing array
 */
import java.util.Arrays;

import lectures.interfaces.ALoopingFactorialSpreadsheet;
import lectures.interfaces.ARecursiveFactorialSpreadsheet;
import lectures.interfaces.FactorialSpreadsheet;

/*

 * This class should help you understand the different ways of declaring 
 * array variables, creating array objects, and assigning to elements of 
 * array objects, which are distinct steps.
 *  
 * 
 */
public class ArrayLifeCycle {
	
	/*
	 *  The element type of an array 
	 * 	   (a) must be a primitive type.
	 *     (b) must be an object type.
	 *     (c) can be a primitive or object type.
	 *   
	 * An array is a sequence of  variables, called elements of the array,
	 * all of which have to be of a certain type, called the element type of the 
	 * array.
	 * 
	 * The element types in the arrays below are int and FactorialSpreadsheet.
	 * 
	 */
	
	static int[] uninitializedPrimitiveArray;
	static int[] initializedPrimitiveArray = {5, 10};
	static int[] initializedEmptyArray = {};
	static int[] uninitializedPrimitiveElements = new int[5];

	 
	static FactorialSpreadsheet[] uninitializedObjectArray; 
	static FactorialSpreadsheet[] uninitializedElements = new FactorialSpreadsheet[5];
	static FactorialSpreadsheet[] initializedElements = {
			new ALoopingFactorialSpreadsheet(),
			new ARecursiveFactorialSpreadsheet()			
	};

	public static void main (String[] anArgs) {
		/*
		 * 
		 * (T/F) It is possible for an array variable to have
		 * 		 the null value.
		 * (T/F) It is possible for an array to have no elements.
		 * (T/F) It is possible for an array object to have null elements.
		 */
		System.out.println("Uninitialized primitive array:" +
				Arrays.toString(uninitializedPrimitiveArray));
		System.out.println("Uninitialized object array:" +
				Arrays.toString(uninitializedObjectArray));
		System.out.println("Array with no elements:" + Arrays.toString(initializedEmptyArray));
		System.out.println("Primitive array with uninitialized elements:" 
				+ Arrays.toString(uninitializedPrimitiveElements));
		System.out.println("Object array with uninitialized elements:" +
				Arrays.toString(uninitializedElements));
		System.out.println("Object array with initialized elements:" +
				Arrays.toString(initializedElements));
		
		System.out.println(); // just a line break
		
		System.out.println ("Length of uninitializedElements: "
				+ uninitializedElements.length);
		
		// Put break point below (for later in the praxis)
		uninitializedElements[0] = new ARecursiveFactorialSpreadsheet();
		uninitializedElements[0] = new ALoopingFactorialSpreadsheet();
		System.out.println (uninitializedElements.length);
		System.out.println("Contents of unininitializedElements:" +
				Arrays.toString(uninitializedElements));

		// Let's set uninitializedElements to point to a different, new array
		uninitializedElements = new FactorialSpreadsheet[] {
				new ALoopingFactorialSpreadsheet()
		};
		System.out.println ("Length of uninitializedElements now: " +
				uninitializedElements.length);
		System.out.println("Contents of unininitializedElements:" +
				Arrays.toString(uninitializedElements));
		/*
		 * (T/F) The size of an array can change dynamically during program 
		 * execution.
		 * 
		 * This is tricky. Did either of the arrays assigned to uninitializedElements ever change
		 * size in this program? Keep in mind that these are two different arrays we are talking about.
		*/

	}
	/*	
	 * To better understand arrays, debug-run the program and look at (mouse-over)
	 * the variable uninitializedElements. 
	 * 
	 * What id (pointer) do you see next to the array variable name?
	 * 
	 * What size (in brackets) do you see next to it? 

	 * What are the values of elements and their ids?
	 * 
	 * Now press F6 ("step over") to step over the next statement and execute the assignment
	 * to the array's first element.
	 * 
	 * View the variable in the same way. Did the id change? What about the id of any elements?
	 * 
	 * Press F6 to do another assignment to the same element. View the variable the same way.
	 * 
	 * Did any of the ids change?
	 * 
	 * Press F6 to step over until you hit the last println
	 * 
	 * View the variable in the same way. Did the id change? 
	 * 
	 * (T/F) The pointer or address of an array object changes each time an 
	 * element of it changes.
	 * 
	 * (T/F) The size of an array object changes each time an element of it changes.
	 * 
	 * (T/F) The pointer of an array element can change when an assignment is 
	 * made to the element.
	 * 
	 */

		
	
	
}
