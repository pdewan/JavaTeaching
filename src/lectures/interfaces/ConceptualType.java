package lectures.interfaces;
/*
 * 
 * This class motivates but does not use interfaces.
 * It uses classes as types of variables.
 * It distinguishes between  Java types, which are known to Java,
 * and conceptual types, which are in the head of the programmer.
 * To illustrate, the mathematical type, integer, is language independent 
 * and Java has two types,one a primitive type, int, and
 * another a class, Integer, to capture in in the language. 
 * 
 * (T/F) It s possible for two types in two different languages
 * to implement the same conceptual type.
 */
public class ConceptualType {
	/*
	 * Purposely using bad names for variables. Go to the definitions of 
	 * the three classes instantiated below to see how they are similar and different.
	 */
	static ALoopingFactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();
	static ARecursiveFactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
	static ABMISpreadsheet c = new ABMISpreadsheet();
	/*	
	 * Command/Ctrl Click or (Fn) F3 on getFactorial to see its declaration
	 * and the difference between method header and body.
	 * 
	 * Comment out each of the following declarations and see what compile errors, 
	 * if any, you get
	 */
	long factorial1 = a.getFactorial();
//	int factorial2 = b.getFactorial();
//	long factorial3 = c.getFactorial();
//	int factorial4 = a.getFactorial();
	/*
	 * (T/F) It is possible to call the method getFactorial() on a variable 
	 * typed as ALoopingFactorialSpreadsheet.
	 * (T/F) It is possible to call the method getFactorial() on a variable 
	 * typed as ARecursiveFactorialSpreadsheet. 
	 * (T/F) It is possible to call the method getFactorial() on a variable 
	 * typed as ABMISpreadsheet.
	 * (T/F) It is possible to assign the result of getFactorial() to a variable
	 * of type long.
	 * (T/F) It is possible to assign the result of getFactorial() to a variable
	 * of type int.
	 * If the type of variable c is class C, then the methods you can call on c
	 * depends only on the:
	 *    a) headers of the methods declared in C.
	 *    b) the bodies of the methods of the methods in C.
	 *    c) the headers and bodies of the methods declared in C.
	 * 	
	 * (T/F) The Java type of an object variable determines the legal ways of
	 * using the variable.
	 */
	
	
	public static void main (String[] args) {		
		
		System.out.println (a.getNumber() + ":" + a.getFactorial());
		System.out.println (b.getNumber() + ":" + b.getFactorial());
		System.out.println (c.getHeight() + "," + c.getWeight() + ":" + c.getBMI());
		/*
		 *		
		 * 
		 * Based purely the the usage of the three variables, a, b, and c,
		 * can you tell without whether c is assigned an instance of 
		 * {@ALoopingFactorialSpreadsheet}, 
		 * {@ARecursiveFactorialSpreadsheet}, or 
		 * {@ABMISpreadsheet}	
		 * 	 
		 * Can you do the same for a (or b), that is, whether a or b is assigned
		 * an instance of ALoopingFactorialSpreadsheet
		 * ARecursiveFactorialSpreadsheet, or ABMISpreadsheet
		 * 
		 * If instances of two Java classes cannot be distinguished by their 
		 * public operations (methods), then they are of the same conceptual type,		 * 
		 * though they may be internally implemented very differently and 
		 * give different performance.
		 * 
		 * (T/F) If two Java classes implement the same conceptual type, then 
		 * it is not possible to distinguish between them based on their 
		 * external use.
		 *
		 */
		
		/*		 
		 * 
		 * Comment out each of the statements and see if you get a compile error
		 */
//		a = new ALoopingFactorialSpreadsheet();
//		a = new ARecursiveFactorialSpreadsheet();	
		/*
		 * 
		 * (T/F) If Java classes C1 and C2 implement the same conceptual type, 
		 * and a variable c is declared to be of Java type C1,
		 * then c can be assigned an instance of C2.
		 * 
		 * (T/F) The Java type of an object variable determines which instances can be assigned to it.
		 */
		
	}
}
/*
 * Next class: {PolymorphicType}
 */
