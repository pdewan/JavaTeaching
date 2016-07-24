package lectures.arrays;

import java.util.Arrays;

import lectures.constructors_pointers.UninitializedVariables;
import lectures.interfaces.ALoopingFactorialSpreadsheet;
import lectures.interfaces.ARecursiveFactorialSpreadsheet;
import lectures.interfaces.FactorialSpreadsheet;

public class ArrayLifeCycle {
	static FactorialSpreadsheet[] uninitializedArray; 
	static FactorialSpreadsheet[] uninitializedElements = new FactorialSpreadsheet[5];
	static FactorialSpreadsheet[] initializedElements = {
			new ALoopingFactorialSpreadsheet(),
			new ARecursiveFactorialSpreadsheet()
			
	};

	public static void main (String[] anArgs) {
		
		System.out.println(Arrays.toString(uninitializedArray));
		System.out.println(Arrays.toString(uninitializedElements));
		System.out.println(Arrays.toString(initializedElements));
		
		System.out.println (uninitializedElements.length);
		// Put break point here	
		uninitializedElements[0] = new ARecursiveFactorialSpreadsheet();
		System.out.println (uninitializedElements.length);
		uninitializedElements = new FactorialSpreadsheet[] {
				new ALoopingFactorialSpreadsheet()
		};
		System.out.println (uninitializedElements.length);
		// Did the array assigned to uninitializedElements change size ever in this program?

	}	
	// Understand the different ways of declaring array variables, creating array objects,
	// and assigning elements of array objects, which are distinct steps
	// To better understand arrays, debug-run the program and look at the variable
	// uninitialized elements. What Id (pointer) do you see next to the array variable name?
	// What are the values of elements and their ids?
	// Now press F6, steo over to step over the next statement.
	// View the variable in the same way. Did the Id change? How did the elements change?
	// Press F6 to step over until you hit the last println
	// View the variable in the same way. Did the Id change? How did the elements change?

		
	
	
}
