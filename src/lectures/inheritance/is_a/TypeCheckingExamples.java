package lectures.inheritance.is_a;

import java.util.Arrays;






import lectures.inheritance.ABaseStringHistory;
import lectures.arrays.collections_implementation.AStringSetMain;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.graphics.Point;
import lectures.inheritance.AnInheritingStringDatabase;
import lectures.inheritance.AnInheritingStringSet;
import lectures.inheritance.BaseStringHistory;
import lectures.inheritance.InheritingStringDatabase;
import lectures.interfaces.BMISpreadsheet;
/**
 *  
 * IS-A DEFINITION AND VISUALIZATION
 * Click on BaseStringHistory (here or in the code below) and press F4 (Open Type Hierarchy).
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
 * (T/F) If A implements B, then A IS-B.
 *
 * You will need to continue to refer to this hierarchy when answering the questions below.
 * 
 * Study the program and run it.
 */

public class TypeCheckingExamples {
      
   /**
    * INSTANCE OF
    * 
    * Here we try to understand what "instanceof" means when we add inheritance
    * to the language.
    * 
    * Answer these questions after you look at the following method
    * and the output it produces the two times it is called.
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
   public static void instanceOfTest(Object anObject) {
	   System.out.println ("Checking object of class:" + anObject.getClass().getSimpleName());
	   System.out.println (anObject instanceof ABaseStringHistory);
	   System.out.println (anObject instanceof InheritingStringDatabase);
	   System.out.println (anObject instanceof AnInheritingStringSet);
   }
   public static void instanceOfTest() {
	   instanceOfTest(new ABaseStringHistory());
	   instanceOfTest(new AnInheritingStringSet());
   }
   
   /*
    * COMPILE-TIME ASSIGNMENT RULES
    * 
    * Here we will try to understand when we can assign an expression, e, of type
    * E to a variable, v, of type V.
    * 
    *(T/F) Expression e of type E can be assigned to variable v of type V
    *if E IS-A V.
    *
    *(T/F) Expression e of type E can be assigned to variable v of type V
    *if V IS-A E
    *      
    * 
    */
   public static void assignmentTest() {
	   InheritingStringDatabase aSet = new AnInheritingStringSet();
	   BaseStringHistory aHistory = new ABaseStringHistory();
	   
	   /**
	    * 
	    * Uncomment the statements below and see which assignments are legal
	    * at compile time.	    
	    */
	   
//	   aHistory = aSet;
//	   aSet = aHistory;	  
	   
   }
   /**
    * Typing and Casting an Object
    * 
    * Here we will try to understand the difference between the actual class
    * of an object and how it is typed in the program.
    * 
    * Uncomment the lines below and see which ones give compile errors.
    * 
    * Then comment the lines that give errors and run the program, noting
    * any runtime errors.
    * 
    * Finally comment them all back.
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
   public static void castAssignmentTest() {
//	   InheritingStringDatabase aSet = new AnInheritingStringSet();
//	   BaseStringHistory aSetMasqueradingAsAHistory = 
//			   new AnInheritingStringSet();	   
//	   aSet = aSetMasqueradingAsAHistory;
//	   aSet = (InheritingStringDatabase) aSetMasqueradingAsAHistory; 
//	   aSetMasqueradingAsAHistory = new ABaseStringHistory();
//	   aSet = (InheritingStringDatabase) aSetMasqueradingAsAHistory;
	   
	   
   }
   /**
    * OVERRIDE RESOLUTION
    * 
    * Here we try to determine the relationship between how an object is
    * typed and the overridden methods that are called.
    * 
    * Put a break points at the first call to addElement() and debug the program.
    * Step inside the call (F5) and note which class you ended up in. Then step
    * return (F7) to come back, step over (F6) to go to the next line, and step
    * into this call (F5). Again, note the class.
    * 
    * Is the same method called in both cases or different methods?
    * 
    * (T/F) When the call of an overridden method is directed at an object variable, 
    * which overridden method is called depends on the
    * type of the variable rather than the object assigned to the variable.
    * 
    */   
   public static void overrideResolutionTest() {

	   InheritingStringDatabase aSet = new AnInheritingStringSet();
	   BaseStringHistory aSetMasqueradingAsAHistory = 
			   new AnInheritingStringSet();	
	   
	   //Place break point here
	   aSet.addElement("Joe Doe");
	   aSetMasqueradingAsAHistory.addElement("Joe Doe");
   }
   
   /**
    * A method with this name (but a different parameter) will be defined below
    */
   public static void print (BaseStringHistory aCollection) {
 	   System.out.println("StringHistory Print:" + aCollection);
 	   for (int i = 0; i < aCollection.size(); i++) {
 		   System.out.println (aCollection.elementAt(i));
 	   }
    }
   /**   
    * Overloading the method above with a parameter whose type has an IS-A 
    * relationship to the type of the previous method
    * 
    */
    public static void print (InheritingStringDatabase aCollection) {
 	   System.out.println("StringDatabase Print:" + aCollection);
 	   for (int i = 0; i < aCollection.size(); i++) {
 		   System.out.println (aCollection.elementAt(i));
 	   }
    }
    /**
     * OVERLOAD RESOLUTION
     * 
     * Here we try to determine the relationship between how an object is typed
     * and the overridden methods that are called when it is used as an argument.
     * 
     * Remove your previously placed breakpoint and put a breakpoint at the print call
     * marked below. As before, debug-run the program, step into the first call (F5),
     * step return (F7), step over (F6) to get to the second call, and step into it (F5).
     * 
     * Is the same method called in both cases or different methods?
     * 
     * (T/F) When the call of an overloaded method is given an object variable 
     * as an argument, which overloaded method is called depends on the
     * type of the variable rather than the object assigned to the variable.
     * 
     */
    public static void overloadResolutionTest() {
       InheritingStringDatabase aSet = new AnInheritingStringSet();
 	   BaseStringHistory aSetMasqueradingAsAHistory = new AnInheritingStringSet();
 	   
 	   //Place breakpoint here
 	   print (aSet);
 	   print(aSetMasqueradingAsAHistory);
 	   
    	
    }
    
    public static void main(String[] args) {
	  instanceOfTest();
	  assignmentTest();
	  castAssignmentTest();
	  overrideResolutionTest();
	  overloadResolutionTest();
    }
    /**
     * Now that we understand the type checking rules, let us try to understand
     * how we should use inheritance so we do not write programs that compile
     * and run yet do not make logical sense and thus are confusing.
     * 
     * Next class: LineInheritingFromPoint
     */

   }
   
 