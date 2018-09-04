package lectures.constructors_pointers;
/*
 * Look at this program and run it to understand the difference between
 * uninitialized primitive and object variables.
 */

public class UninitializedVariables {
	
	static double height; // global primitive variable
	static String string; // global object variable
/* 
 * (T/F) It is not possible to declare an uninitialized global 
 * variable.
 */

	public static void main (String[] args) {
/*
 * Uncomment the following lines, and note any errors.
 * 
 */
//		int exampleLocalOPrimitiveVariable;
//		System.out.println (exampleLocalOPrimitiveVariable);
//		String exampleLocalObjectVariable;
//		System.out.println (exampleLocalObjectVariable);
/*
 * (T/F) It is not possible to declare an uninitialized local variable.
 * (T/F) It is not possible to access (use) the value of an uninitialized 
 *   local variable. *  
 * Comment out the declarations you just uncommented.   
 */
		
/*
 * Run the program and note the output.
 */
		System.out.println(height); // printing an uninitialized primitive
		System.out.println(string); // printing an uninitialized object
		System.out.println (height + 2); // doing an integer operation on height
		System.out.println (string.charAt(0)); // doing a String operation on string;		
	}
/*
 * (T/F) It is not possible to access (use) the value of an uninitialized 
 *   global variable.
 *   
 * (T/F) A constructor can initialize an arbitrary uninitialized local variable.
 * 
 * (T/F) A constructor can initialize an arbitrary uninitialized global variable.
 * 
 * (T/F) Because of constructors, Java's rules regarding whether a variable 
 * can be uninitialized distinguish between local and global variables.
 * 
 * An uninitialized primitive variable of type T has:
 *    a  value of type T
 *    has the null value.
 *    none of the above
 *    
 * An uninitialized object variable of type T has:
 *    a  value (instance) of type T
 *    the null value.
 *    none of the above
 * 
 * 
 * (T/F) A null pointer exception is thrown when an uninitialized Object variable
 * is printed.
 * 
 * (T/F) A null pointer exception is thrown when a method is called on an 
 * uninitialized Object variable.
 *
 */

}
