package lectures.constructors_pointers;
/*
 * Look at this program and run it to understand the difference between
 * uninitialized primitive and object variables.
 * 
 */

public class UninitializedVariables {
	/* 
	 * (T/F) It is not possible to declare an uninitialized global (instance/static) variable.
 	 */
	static double height; // global primitive variable
	static String string; // global object variable


	public static void main (String[] args) {
		/*
		 * Uncomment the following line to answer:
		 * (T/F) It is not possible to declare an uninitialized local variable.
		 */
//		int exampleLocalVariable;
//		System.out.println (exampleLocalVariable);
		/*
		 * Looking at and running the following code helps you answer:
		 * (T/F) It is not possible to access (use) the value of an uninitialized local variable.
		 * (T/F All operations that can be performed on an initialized primitive variable can also
		 * be performed on an uninitialized primitive variable.		 * 
		 * (T/F) All operations that can be performed on an initialized object variable can also
		 * be performed on an uninitialized object variable.
		 * 
		 */
		System.out.println(height); // printing an uninitialized primitive
		System.out.println(string); // printing an uninitialized object
		System.out.println (height + 2); // doing an integer operation on height
		System.out.println (string.charAt(0)); // doing a String operation on string1;
		/*
		 * Why allow uninitialized static or instance variables?
		 * Why do the initialization rules distinguish between local and global variables? 
		 * What does a null pointer exception mean exactly?
		 */
	}

}
