package lectures.inheritance.is_a;

import java.util.ArrayList;
import java.util.Arrays;






import java.util.Collection;
import java.util.List;

import lectures.inheritance.ABaseStringHistory;
import lectures.arrays.collections_implementation.AStringSetMain;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.graphics.Point;
import lectures.inheritance.AnInheritingStringDatabase;
import lectures.inheritance.AnInheritingStringSet;
import lectures.inheritance.BaseStringHistory;
import lectures.inheritance.InheritingStringDatabase;
import lectures.interfaces.BMISpreadsheet;
/*
 * This class uses several examples to illustrate the IS-A relationship 
 * and some its implications in type checking and program execution.
 * 
 */

public class TypeCheckingExamplesNextTime {

/*   
 * IS-A DEFINITION AND VISUALIZATION
 * Click on BaseStringHistory (here or in the code below) and 
 * press F4 (Right Menu-->Open Type Hierarchy).
 * 
 * Look at the Type Hierarchy tab on the upper left.
 * 
 * This tab shows the IS-A ("is a") relationship between StringHistory and other types
 * in the workspace.
 * 
 * In this hierarchy, if node A is descendant of node B, then A IS-A B ("A is a B").
 * 
 * Look carefully at the descendants of BaseStringHistory - 
 * both direct children and other descendants. 
 * 
 * Look at both interfaces and classes in the hierarchy to understand the basis for creating
 * this hierarchy. Simply double click a class or interface to go to it.
 * 
 * Can you formally define the IS-A relationship in terms of the implements and extends 
 * relationships we have seen so far?
 * 
 * Answer the following questions based on what you see in this example.  
 * In other words, which of these statements are consistent with what you see.
 * 
 * (T/F) If A is an interface and B is an interface, it is possible that A IS-A B.
 * 
 * (T/F) If A is a class and B is a class, it is possible that A IS-A B.
 * 
 * (T/F) If A is class and B is an interface, it is possible that A IS-A B.
 * 
 * (T/F) If A is an interface and B is a class, it is possible that A IS-A B.
 * 
 * (T/F) If A extends B, then A IS-A B.
 * 
 * (T/F) If A implements B, then A IS-B.    * 
 *
 * You will need to continue to refer to this hierarchy when answering the questions below.
 *
 */
  public static void instanceOfTest() {
	   instanceOfTest(new ABaseStringHistory());
	   instanceOfTest(new AnInheritingStringSet());
   }
   public static void instanceOfTest(Object anObject) {
	   System.out.println ("Checking object of class:" + anObject.getClass().getSimpleName());
	   System.out.println (anObject instanceof ABaseStringHistory);
	   System.out.println (anObject instanceof InheritingStringDatabase);
	   System.out.println (anObject instanceof AnInheritingStringSet);
   }
/*
 * INSTANCE OF
 * 
 * Here we try to understand what "instanceof" means when we add inheritance
 * to the language.
 * 
 * Run the program and look at the output the method above produces the two 
 * times it is called.
 * 
 * (T/F) If A extends B, and a is an instance of A, then a is an instance
 * of B.
 * 
 * (T/F) If A implements B, and a is an instance of A, then a is an instance
 * of B.
 * 
 * (T/F) If A IS-A B, and a is an instance of A, then a is an instance
 * of B.
 * 
 * (T/F) If A IS-A B, and b is an instance of B, then b is an instance
 * of A.
 */   
   
   public static void assignmentTest() {
	   InheritingStringDatabase aSet = new AnInheritingStringSet();
	   BaseStringHistory aHistory = new ABaseStringHistory();
	   
	   /*	     
	    * Uncomment the statements below and see which assignments are legal
	    * at compile time.	    
	    */
	   
//	   aHistory = aSet;
//	   aSet = aHistory;	  
	   
   }
/*
 * COMPILE-TIME ASSIGNMENT RULES
 * 
 * The code above helps us understand when we can assign an expression, e, of type
 * E to a variable, v, of type V.
 * 
 * Uncomment the statements above and see which assignments are legal
 * at compile time.
 * 
 * (T/F) Expression e of type E can be assigned to variable v of type V
 * if E IS-A V.
 * 
 * (T/F) In real-life T1 IS-A T2, if T1 has all the traits of T2.
 *
 * (T/F) Expression e of type E can be assigned to variable v of type V
 * if V IS-A E
 * 
 * 
 * (T/F) In real-life T1 IS-A T2, it an instance of T1 can be supplied where
 * an instance of T2 is expected.
 * 
 * An (instance of) a type can be used in some code fragment if it does not
 * cause compile errors in the code fragment.
 * 
 * (T/F) In Java type T1 IS-A T2, if an instance of T1 can be used
 *        wherever an instance of T2 is expected.
 *        
 * (T/F) In Java, substituting an instance of T1 with an instance of T2 in a program 
 * can cause the program to give different results. 
 * 
 */     
   public static void castAssignmentTest() {
//	   InheritingStringDatabase aSet = new AnInheritingStringSet();
//	   BaseStringHistory aSetMasqueradingAsAHistory = 
//			   new AnInheritingStringSet();	   
//	   aSet = aSetMasqueradingAsAHistory;
//	   aSet = (InheritingStringDatabase) aSetMasqueradingAsAHistory; 
//	   aSetMasqueradingAsAHistory = new ABaseStringHistory();
//	   aSet = (InheritingStringDatabase) aSetMasqueradingAsAHistory; 	   
   }
/*
 * Typing and Casting an Object
 * 
 * Here we will try to understand the difference between the actual class
 * of an object and how it is typed in the program.
 * 
 * Uncomment the lines above and see which ones give compile errors.
 * 
 * Then comment the lines that give errors and run the program, noting
 * any runtime errors.
 * 
 * Finally comment all lines in the method all back.
 * 
 * (T/F) Type checking rules involving no casts depend on how an assigned
 * variable is typed. That is, they look at the type of the variable
 * rather than the class of the object assigned to the variable. 
 * 
 * (T/F) Type checking rules involving casts depend on how an assigned 
 * variable is cast, that is, they look at the type used in the cast
 * rather than the type of the assigned variable.
 * 
 * (T/F) Casts an lead to runtime errors.
 *  
 */   
   static  final String EXAMPLE_ITEM = "Joe Doe";
   public static void overrideResolutionTest() {
	  
	   AnInheritingStringSet aSet = new AnInheritingStringSet();
	   ABaseStringHistory aSetMasqueradingAsAHistory = 
			   new AnInheritingStringSet();	
	   
	   //Place break point here
	   aSet.addElement(EXAMPLE_ITEM);
	   aSetMasqueradingAsAHistory.addElement(EXAMPLE_ITEM);
   }

/*
 * OVERRIDE RESOLUTION
 * 
 * Here we try to determine the relationship between how an object is
 * typed and the overridden methods that are called.
 * (T/F) The typing of the two variables in overrideResolutionTest follows the style
 * rules learned so far.
 * (T/F) The two variables in overrideResolutionTest have the same type.
 * (T/F) The two variables in overrideResolutionTest are assigned objects created
 * by instantiating the same class.
 * 
 * 
 * Put a break points at the first call to addElement() and debug-run the program.
 * Step inside the call (F5) and note which class you ended up in. Then step
 * return (F7) to come back, step over (F6) to go to the next line, and step
 * into this call (F5). Again, note the class.
 * 
 * Is the same method called in both cases or different methods?
 * 
 * (T/F) addElement() invoked on a variable typed as ABaseStringHistory calls
 * the implementation of this method in ABaseStringHistory.
 * 
 * (T/F) addElement() invoked on a variable typed as AnInheritingStringSet calls
 * the implementation of this method in AnInheritingStringSet.
 * 
 * (T/F) When the call of an overridden method is directed at an object variable, 
 * which overridden method is called depends on the
 * type of the variable rather than the class of the object assigned to the variable.
 * 
 * Click on the first addElement() call and use F3 or CTRL/CMD CLICK to go to the
 * implementation of it (computed at compile time).
 * 
 * Click on the second addElement() call and use F3 or CTRL/CMD CLICK to go to the
 * implementation of it (computed at compile time).
 * 
 * Were they the ones that actually got called in these two calls.
 * 
 * (T/F) Which overridden method is called is known at compile time.  
 * 
 */ 
   
/*
 * A method with this name (but a different parameter) will be defined below
 */   
public static void print (BaseStringHistory aCollection) {  
   System.out.println("StringHistory Print:" + aCollection);
   if (aCollection == null)
	   return;
   for (int i = 0; i < aCollection.size(); i++) {
	   System.out.println (aCollection.elementAt(i));
   }
}
/*   
 * Overloading the method above with a parameter whose type is different 
 * from the type of the previous method
 */
public static void print(InheritingStringDatabase aCollection) {	
	System.out.println("StringDatabase Print:" + aCollection);
	if (aCollection == null)
		   return;
	for (int i = 0; i < aCollection.size(); i++) {
		System.out.println(aCollection.elementAt(i));
	}
}
public static void overloadResolutionTest() {	
	   InheritingStringDatabase aSet = new AnInheritingStringSet();
	   BaseStringHistory aSetMasqueradingAsAHistory = new AnInheritingStringSet();   
   //Place breakpoint here
   print (aSet);
   print(aSetMasqueradingAsAHistory);	
}
/*
 * OVERLOAD RESOLUTION 
 * 
 * Here we try to determine the relationship between how an object is typed
 * and the overridden methods that are called when it is used as an argument.
 * 
 * The type of the parameter of print(InheritingStringDatabase) method in TypeCheckingExamples is
 *    (a) unrelated to the type of the parameter of print(BaseStringHistory).
 *    (c) is a supertype of the type of the parameter of print(BaseStringHistory).
 *    (c) IS-A the type of the parameter of the parameter of print(BaseStringHistory).
 * 
 * Remove your previously placed breakpoint and put a breakpoint at the print call
 * marked above. As before, debug-run the program, step into the first call (F5),
 * step return (F7), step over (F6) to get to the second call, and step into it (F5).
 * 
 * 
 * Is the same method called in both cases or different methods?
 * 
 * (T/F) A print() call whose parameter is an AnInheritingStringSet 
 * instance typed as BaseStringHistory invokes print(BaseStringHistory).
 * 
 * (T/F) A print() call whose parameter is an AnInheritingStringSet instance 
 * typed as InheritingStringDatabase calls print (InheritingStringDatabase).
 * 
 * (T/F) When the call of an overloaded method is given an object variable 
 * as an argument, which overloaded method is called depends on the
 * type of the variable rather than the object assigned to the variable.
 * 
 * (T/F) If A IS-A B IS-A C, and there exist two overloaded methods, m, 
 * taking a single parameter of types B and C, (that is m(B) and m(C)), respectively), 
 * then when m is passed a parameter of type A, the method:
 *    m(B) is called
 *    m(C) is called
 *    the call is illegal
 *    
 * (T/F) If A IS-A B IS-A C, and there exists only one method, m, 
 * taking a single parameter of type C, 
 * then when m is passed a parameter of type A, the method:
 *    m(C) is called
 *    the call is illegal
 *    
 * (T/F) If A IS-A B IS-A C, and there exists only one method, m, 
 * taking a single parameter of type A, 
 * then when m is passed a parameter of type C, the method:
 *    m(A) is called
 *    the call is illegal  
 *    
 * (T/F) When more than one overloaded implementation of a method can 
 * service a legal call to the method, Java chooses the most specific one,
 * that is, the one whose formal (declared) parameter types are closer to the 
 * actual (supplied) parameters in the IS-A DAG.
 *    
 * Click on the first print() call and use F3 or CTRL/CMD CLICK to go to the
 * implementation of it (computed at compile time).
 * 
 * Click on the second print() call and use F3 or CTRL/CMD CLICK to go to the
 * implementation of it (computed at compile time).
 * 
 * (T/F) Which overloaded method is called is known at compile time. 
 * 
 */


public static void append (Collection anOriginal, List aList) {
	anOriginal.addAll(aList);
}
/*
 * A second overloaded method with two parameters
 */
//public static void append (List anOriginal, Collection aList) {
//	anOriginal.addAll(aList);
//}
public static void overloadResolutionTest2() {	
	append(new ArrayList<>(), new ArrayList<>());	
}
/*
 * Look at the type hierarchy of Collection (F4, Right Menu-->Open Type Hierarchy)
 * Look at the second commented out definition of append().
 * 
 * (T/F) The type of each formal parameter of append (Collection, List) IS-A the
 * the type of the corresponding parameter of append (List, Collection)
 * 
 * Uncomment the second append(). Do you get any compile time errors? If so, what
 * do they say.
 * 
 * A legal method or call is one that does not result in compile errors.
 * 
 * (T/F) It is possible for a call to two legal overloaded methods to be ambiguous
 * and thus illegal.
 * 
 * (T/F) It is possible for a legal call to a method to become illegal by adding
 * a legal overloaded method.
 * 
 * 
 */

    
public static void main(String[] args) {
  instanceOfTest();
  assignmentTest();
  castAssignmentTest();
  overrideResolutionTest();
  overloadResolutionTest();
}
}
/*
 * Now that we understand the type checking rules, let us try to understand
 * how we should use inheritance so we do not write programs that compile
 * and run yet do not make logical sense and thus are confusing.
 * 
 * Next class: LineInheritingFromPoint
 */
   
 