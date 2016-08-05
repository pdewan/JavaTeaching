package lectures.exceptions;
/**
 * CLASS CAST EXCEPTION AND INTRA METHOD PROPAGATION IN NESTED BLOCKS
 * 
 * We see a new kind of exception {@link ClassCastException}. Hover over the name
 * to see the full description,
 * 
 * We see also an exception that occurs in a nester block that is caught in one
 * case within the block and another case in an outer block,
 * 
 * Study the two alternative loops and the exceptions caught. Debug-run the program 
 * in each of the four cases.
 * 
 * In each of the four cases, do you understand what the next statement will be after an
 * exception?
 * 
 * In this example, which of the four alternatives is the best?
 * 
 * Can you imagine a different example, in which a different alternative is better?
 */

public class IntraMethodPropagation {
	static final int NON_STRING_VALUE = 5;
	static final String STRING_VALUE_1 = "hello";
	static final String STRING_VALUE_2 = "goodbye";

	static Object[] list = { NON_STRING_VALUE, STRING_VALUE_1, STRING_VALUE_2 };

	public static void tryInsideBlock() {
		for (int i = 0; i < list.length; i++) {
			try {
				// Set breakpoint here and press F6 to see where you go next
				System.out.println((String) list[i]); 
			} catch (ClassCastException e) {
				System.out.println(e);
			}
		}
	}

	public static void tryOutsideBlock() {
		try {
			for (int i = 0; i < list.length; i++) {
				// Set breakpoint here and press F6 to see where you go next
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
					// Set breakpoint here and press F6 to see where you go next
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
				// Set breakpoint here and press F6 to see where you go next
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
