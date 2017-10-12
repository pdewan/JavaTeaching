package lectures.interfaces;
/**
 * Now we no longer differentiate between variables holding instances of the 
 * two factorial classes.
 * We use a special type {FactorialSpreadsheet}, which is an 
 * interface rather than a class.
 * This class illustrates why interfaces are important.
 */
public class NextTimePolymorphicType {	
/*
 * Go to the declaration of FactorialSpreadsheet (interface), ALoopingFactorialSpreadsheet,
 * and  ARecursiveFactorialSpreadsheet ((Fn) F3/ (CTRL/CMD) click). 
 * Use ALT <- in each of these types to return here.
 * Note the aspects common to both
 * ALoopingFactorialSpreadsheet and ARecursiveFactorialSpreadsheet captured by
 * the interface FactorialSpreadsheet.
 * 
 * 
 * An interface declares:
 * 	 method headers and bodies that appear in all classes that implement it.
 *   method headers that appear in all classes that implement it.
 *   method bodies that that appear in all classes that implement it. 
 *   
 * (T/F) An interface provides a Java type to unite classes that implement the 
 * same conceptual type
 */
	
/*
 * Below the interface is used as the type of variables.
 */
	static FactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();	
	static FactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
/*   
 * (T/F If class C implements interface I, then an instance of C can be 
 *  assigned to a variable of type I.
 */
	
/*
 * Uncomment the statement below and note any compile errors you get.
 * Comment it back to remove any errors
 */
//	static ARecursiveFactorialSpreadsheet d = new ALoopingFactorialSpreadsheet();
/*	
 * (T/F) If classes C1 and C2 implement an interface I, then an instance of C1
 * can be assigned to a variable of type C2.
 */	
/*
 * Let us try to better understand what the implements clause really means. 
 * Uncomment the method, public int getA(), in the interface, which does
 * not appear in the classes. 
 * Do you get a compile error in the two classes
 * (ALoopingFactorialSpreadsheet or ARecursivefactoralSpreadsheet) 
 * that implement it? If so, what does it say? 
 * Comment getA() out if you do.
 * 
 * Now go to {ALoopingFactorialSpreadsheet)		
 * Uncomment getN(), which does not appear in the interface.
 * Do you get an error message? If so, what does it say.
 * Comment getN() out if you do, otherwise keep it.
 * 
 * (T/F) If class C implements I, then C must have a method matching 
 * every method in I.
 * (T/F) If class C implements I, then I must have a method matching 
 * every method in C.
 */
	 
/* 
 * Comment out the following statements. Notice any compile errors?
 * (a is assigned an instance of ALoopingFactorialSpreadsheet; * 
 */	
public static void casting() {
//	System.out.println (a.getN());
//	System.out.println (((ALoopingFactorialSpreadsheet) a).getN());
}		
/*
 *  Given an arbitrary class C that implements I and given an uncast variable v of type
 *  I:
 *  (a) all methods implemented by C can be invoked on v.
 *  (b) methods declared in I can be invoked on v.
 *  (c) no method implemented by C can be invoked on v.
 *  
 * (T/F) Casting can be used to change the set of methods that can be invoked on an Object value
 */
	/**
	 * Run this method when asked.
	 */
	public static void main (String[] args) {		
		System.out.println ("Before the call to maybeAssignToA a is assigned an instance of:" + a.getClass().getSimpleName());
		maybeAssignToA();
		System.out.println ("After the call to maybeAssignToA a is assigned an instance of:" + a.getClass().getSimpleName());		
//		callPrints();		
//		printInstanceOf();	
	}
/*
 * Run the main a few times (at least 5) to look at the outputs. 
 */
	public static void maybeAssignToA() {
		/*
		* There is a 50/50 chance, when the program is executed, that the
		* condition of the following if will be satisfied.
		*/
		if (Math.random() > 0.5) { // hover on random to see what it does				
			a = b;			
		}
   }
/*	 
 * In class PolymoprhicType, before the call to  maybeAssignToA(), the 
 * class of the object assigned to a is:
 * (a) always ALoopingFactorialSpreadsheet.
 * (b) always ARecursiveFactorialSpreadsheet.
 * (c) sometimes ALoopingFactorialSpreadsheet and sometimes ARecursiveFactorialSpreadsheet.
 * (d) None of the above.
 * 
 * At the end of the call to maybeAssignToA() the class of the object assigned to a is:
 * (a) always ALoopingFactorialSpreadsheet.
 * (b) always ARecursiveFactorialSpreadsheet.
 * (c) sometimes ALoopingFactorialSpreadsheet and sometimes ARecursiveFactorialSpreadsheet.
 * (d) None of the above.  
 * 
 * (T/F) A compiler analysis of the source code of any class can always determine 
 * the class of the object assigned to any variable after a procedure call
 * or some other statement of the program.
 * 
 * Given the variable declaration:
 *     I v = new C();
 * the operations that are allowed on v by the compiler should depend on:
 *    (a) I
 *    (b) C
 *  
 *  A polymorphic variable is one that can be assigned instances of different
 *  classes.
 *  
 *  (T/F) In PolymorphicType, the variable, a, is polymorphic.
 *  
 *  Comment out the call to the above method in main to unclutter the output.
 */
	
/*
 * Uncomment the call to the following method in main and run main again and view the
 * output.
 */
	public static void printInstanceOf () {
		System.out.println (a instanceof ALoopingFactorialSpreadsheet);
		System.out.println (a instanceof FactorialSpreadsheet);
		System.out.println (a instanceof ARecursiveFactorialSpreadsheet);
		System.out.println (b instanceof FactorialSpreadsheet);
	}	
/*
 * You can click F3 or CTRL/COMMAND Click on the name of variables a and b to see their
 * declarations and use ALT <- to return here. 
 * 
 * If C1 and C2 implements I then:
 *     (a) all instances of C1 are also instances of I.
 *     (b) all instances of I are also instances of C1.
 *     (c) all instances of C1 are also instances of C2.
 * 
 * Click on the name FactorialSpreadsheet and press F4, Fn F4 or 
 * Right Menu-> Open Type Hierarchy
 * 
 * In the type hierarchy:
 *    (a) ALoopingFactorialSpreadsheet is a child of FactorialSpreadsheet.
 *    (b) ARecursiveFactorialSpreadsheet is a child of ALoopingFactorialSpreadsheet.
 *    (c) FactorialSpreadsheet is a child of ALoopingFactorialSpreadsheet.
 *    
 * In the type hierarchy, if TC is a child of TP, then all instances of:
 *    TC are also instances of TP.
 *    TP are also instances of TC.
 *    None of the above. 
 * 
 * Comment out the call to the method in main to unclutter the output. 
 */
	
/*
 * Study the definition of  printPolymorphic.
 */
	public static void printPolymorphic (FactorialSpreadsheet aFactorialSpreadsheet) {
		System.out.println (aFactorialSpreadsheet.getNumber() + ":" + aFactorialSpreadsheet.getFactorial());
	}
/* 
 * (T/F) The type of the formal parameter of printPolymorphic is an interface.
 */		
	
/*
 * Now study the definition of printNonPolymoprhic.
 */	
	public static void printNonPolymoprhic (ALoopingFactorialSpreadsheet aFactorialSpreadsheet) {
		System.out.println (aFactorialSpreadsheet.getNumber() + ":" + aFactorialSpreadsheet.getFactorial());
	}
/* 
 * (T/F) The type of the formal parameter of printNonPolymoprhic is an interface.
 */	
	
	public static void callPrints() {
		ALoopingFactorialSpreadsheet l = new ALoopingFactorialSpreadsheet();
		ARecursiveFactorialSpreadsheet r = new ARecursiveFactorialSpreadsheet();
/*	 
 * Uncomment the statements below and note the error messages.
 * Do the error messages make sense.
 */	
//		printPolymorphic(l);
//		printPolymorphic(r);
//		printPolymorphic(a);
//		printPolymorphic(b);
//		
//		printNonPolymoprhic(l);
//		printNonPolymoprhic(r);
//		printNonPolymoprhic(a);
//		printNonPolymoprhic(b);			
	}
/* 
 * In PolymorphicType, the formal parameter of printPolymorphic can be 
 * assigned an actual parameter of type 
 *    a) ALoopingFactorialSpreadsheet.
 *    b) ARecursiveFactorialSpreadsheet.
 *    c) FactorialSpreadsheet
 *  
 * In PolymorphicType, the formal parameter of printNonPolymorphic can be 
 * assigned an actual parameter of type: 
 *    a) ALoopingFactorialSpreadsheet.
 *    b) ARecursiveFactorialSpreadsheet.
 *    c) FactorialSpreadsheet 
 *    
 *(T/F) If class C implements interface I, then a variable of type I can be 
		assigned a variable of type C. 
 *(T/F) If class C implements interface I, then a variable of type C can be 
		assigned a variable of type I. 
 * A polymorphic method is one that declares at least parameter that 
 * is a polymorphic variable.
 * 	  
 * (T/F) A polymorphic method has one or more (formal) parameters that can be 
 * assigned instances of multiple classes. 
 * 				 
 * Which print is more versatile, that is, can operate on a greater 
 * variety of objects?
 * 
 * (T/F) printPolymorphic is more reusable, that is can be used in more contexts,
 * than printNonPolyMoprhic.
 * 
 * A parameter is an example of a variable.
 * 
 * (T/F) If class C implements I, then C should be used as the type of a variable. 
 * 
 * Interfaces
 *    (a) make code more reusable
 *    (b) constrain or specify the nature of classes that implement them.
 *    (c) provide an abstract description of the classes that implement them.
 *    (d) none of the above.
 *    
 * (T/F) Every class (with one or more instance methods) should implement an interface. * 
 */	
}
