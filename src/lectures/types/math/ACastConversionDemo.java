package lectures.types.math;
public class ACastConversionDemo {
	public static final double EXAMPLE_DOUBLE = 5.4;
	public static final long EXAMPLE_LONG = Long.MAX_VALUE;
	/**
	 * If T1 is a subset of T2, this method helps us understand if and how we 
	 * can assign an expression of type T2 to a variable of type T1.
	 */
	public static void narrowingATypeDiscovery() {		
//		int aDoubleToInt = EXAMPLE_DOUBLE; 
//		System.out.println(EXAMPLE_DOUBLE + " --> int:" + aDoubleToInt);
//		int aLongToInt =  EXAMPLE_LONG;		
//		System.out.println(EXAMPLE_LONG + " --> in:" + aLongToInt);			
	}
/*
 * Uncomment the code in the method above by using @block-comment (CTRL \). 
 * Look at the errors. Hover over each of them and click on them see the suggestions.
 * Take a suggestion that asks for a cast. Execute @run (CTRL-F11).
 * 
 * Q.The first print statement displays:
 *	(a) 0
 *	(b) NAN
 *X	(c) 5 
 * 
 *Q. Which of the the following statements are consistent with your observations. 
 *   If T1 is a subset of T2, an expression of type T2
 *	(a) can never be assigned to a variable of type T1.
 *X	(b) can be assigned to a variable of type T1 using a cast, which does a lossy
 *     conversion of T2 to T1.
 *	(c) can be assigned to a variable of type T1 using a cast, which converts the
 *     value to 0.
 */
	
	public static void main (String[] args) {
		narrowingATypeDiscovery();
		narrowingATypeExplanation();
	}
	
	/**
	 * This method shows that if T1 is a subset of T2, then an expression E of 
	 * type T2 can be assigned to a variable v type of type by using a cast of 
	 * the form (T1) E, which does a lossy conversion of T2 to T1 in which some 
	 * but no all information in E is lost.
	 */
	public static void narrowingATypeExplanation() {
		int aDoubleToInt = (int) EXAMPLE_DOUBLE; // truncating double
		System.out.println(EXAMPLE_DOUBLE + " --> int:" + aDoubleToInt);
		int aLongToInt = (int) EXAMPLE_LONG;// truncating long		
		System.out.println(EXAMPLE_LONG + " --> in:" + aLongToInt);		
	}
/*
 * What do you expect as the output of the program based on the method comment 
 * above.
 * 
 * Q. Run the method and observe the output.
 * The first print statement displays:
 * (a) 0
 * (b) NAN
 * (c) 5  
 * 
 */
}
