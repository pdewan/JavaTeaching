package lectures.interfaces;
/*
 * T/F) It s possible for two types in two different languages
 * to implement the same conceptual type.
 * 
 * This class motivates but does not use interfaces.
 * It uses classes as types of variables.
 * It distinguishes between  Java types, which are known to Java,
 * and conceptual types, which are in the head of the programmer.
 * To illustrate, the mathematical type, integer, is language independent 
 * and Java has two types,one a primitive type, int, and
 * another a class, Integer, to capture in in the language. 
 */
public class ConceptualType {
	/*
	 * Purposely using bad names for variables.
	 *  
	 * 
	 */
	static ALoopingFactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();
	static ARecursiveFactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
	static ABMISpreadsheet c = new ABMISpreadsheet();
	
	
	/*
	 * (T/F) The Java type of an object variable determines which operations 
	 * (methods) can be performed on it.
	 * 
	 * Comment out each of the following declarations and see what compile errors you get
	 */
//	long factorial1 = a.getFactorial();
//	int factorial2 = c.getFactorial();
	
	/*
	 * This space left intentionally blank.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */		
	public static void main (String[] args) {
		
		
		System.out.println (a.getNumber() + ":" + a.getFactorial());
		System.out.println (b.getNumber() + ":" + b.getFactorial());
		System.out.println (c.getHeight() + "," + c.getWeight() + ":" + c.getBMI());
		/*
		 * 	
		 * 
		 * (T/F) If two Java classes implement the same conceptual type, then 
		 * it is not possible to distinguish between them based on their 
		 * external use.
		 * 
		 * Based purely the the usage of the three variables, a, b, and c,
		 * can you tell without whether c is assigned an instance of 
		 * {@link ALoopingFactorialSpreadsheet}, 
		 * {@link ARecursiveFactorialSpreadsheet}, or 
		 * {@link ABMISpreadsheet}	
		 * 	 
		 * Can you do the same for a (or b), that is, whether a (b) is assigned
		 * an instance of ALoopingFactorialSpreadsheet
		 * ARecursiveFactorialSpreadsheet, or ABMISpreadsheet
		 * 
		 * If instances of two Java classes cannot be distinguished by their 
		 * public operations (methods), then
		 * they are of the same conceptual type.		 * 
		 * Though they may be internally implemented very differently and 
		 * give different performance.
		 *
		 */
		
		/*
		 * (T/F) The  Java type of an object variable determines which 
		 * instances can be assigned to it.
		 * (T/F) If Java classes C1 and C2 implement the same conceptual type, 
		 * and a variable c is declared to be of Java type C1,
		 * then c can be assigned an instance of C2.
		 * 
		 * Comment out each of the statements and see if you get a compile error
		 */
//		a = new ALoopingFactorialSpreadsheet();
//		a = new ARecursiveFactorialSpreadsheet();	
		
	}
}
/*
 * Next class: {@link PolymorphicType}
 */
