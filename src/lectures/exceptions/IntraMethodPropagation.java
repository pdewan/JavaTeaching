package lectures.exceptions;
/**
 * CLASS CAST EXCEPTION AND INTRA METHOD PROPAGATION IN NESTED BLOCKS
 * 
 * We see a new kind of exception {@link ClassCastException}. Hover over the name
 * to see the full description,
 * 
 * We see also an exception that occurs in a nested block that is caught in one
 * case within the block and another case in an outer block,
 * 
 * Study the four alternative loops and the exceptions caught. Debug-run the program 
 * in each of the four cases by placing the proper breakpoints and making the proper
 * call uncommented in main.
 * 
 
 */

public class IntraMethodPropagation {
	static final int NON_STRING_VALUE = 5;
	static final String STRING_VALUE_1 = "hello";
	static final String STRING_VALUE_2 = "goodbye";

	static Object[] list = { NON_STRING_VALUE, STRING_VALUE_1, STRING_VALUE_2 };

	public static void tryInsideBlock() {
		for (int i = 0; i < list.length; i++) {
			try {
				/*
				 *  Set breakpoint here and press F6 to see where you go next
				 */
				System.out.println((String) list[i]); 
			} catch (ClassCastException e) {
				System.out.println(e);
			}
		}
	}

	public static void tryOutsideBlock() {
		try {
			for (int i = 0; i < list.length; i++) {
				/*
				 * Set breakpoint here and press F6 to see where you go next
				 */
				System.out.println((String) list[i]); 
			}
		} catch (ClassCastException e) {
			System.out.println(e);
		}
	}
	
	public static void tryInsideAndOutsideBlock() {
		try {
			for (int i = 0; i < list.length; i++) {
				try {
					/*
					 *  Set breakpoint here and press F6 to see where you go next
					 */
					System.out.println((String) list[i]); 
				} catch (ClassCastException e) {
					System.out.println(e);
				} 
			}
		} catch (ClassCastException e) {
			System.out.println(e);
		}
	}
	public static void tryInNoBlock() {
		for (int i = 0; i < list.length; i++) {
				/*
				 * Set breakpoint here and press F6 to see where you go next
				 */
				System.out.println((String) list[i]); 			
		}
	}
	
	public static void main (String[] args) {
		tryInsideBlock();
//		tryOutsideBlock();
//		tryInsideAndOutsideBlock();
//		tryInNoBlock();
	}
}
/**
 * If an exception is thrown in method m by a statement s enclosed in two or more try blocks in m, 
 * then it is caught by:
 * (a) the innermost compatible catch block.
 * (b) the outermost compatible catch block.
 * (c) all compatible catch blocks associated with enclosing try blocks.
 * (d) a compatible catch block in the caller of m.
 * 
 * After a catch block finishes execution, control flows to:
 * (a) the statement following the corresponding try-catch-finally blocks.
 * (b) the caller of the method in which the catch block executes.
 * (c) none of the above
 * 
 * 
 * 
 */
