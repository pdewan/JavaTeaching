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
 * IS_A DEFINITION AND VISUALIZATION
 * Click on BaseStringHistory below and press F4 (Open Type Hierarchy).
 * 
 * Look at the Type Hierarchy tab on the upper left.
 * 
 * This tab shows the IS-A relationship between StringHistory and other types
 * in the workspace.
 * 
 * In this hierarchy, if node A is descendant of node B, then A IS-A B.
 * 
 * Look carefully at the descendants of BaseStringHistory - 
 * both direct children and other descendants. 
 * 
 * Look at both interfaces and classes in the hierarchy to understand the
 * basis for creating this hierarchy. 
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
 * You will need to refer to this hierrachy when answering the questions below.
 * 
 * 
 */

public class TypeCheckingExamples {
   
	
  /**
   * A method with this name will be defined below
   */
  public static void print (BaseStringHistory aCollection) {
	   System.out.println("String History b:" + aCollection);
	   for (int i = 0; i < aCollection.size(); i++) {
		   System.out.println (aCollection.elementAt(i));
	   }
   }
  
  /**
   * Overloading the method above with a type that IS-A the type of the 
   * previous method
   * 
   */
   public static void print (InheritingStringDatabase aCollection) {
	   System.out.println("StringDatabase Print:" + aCollection);
	   for (int i = 0; i < aCollection.size(); i++) {
		   System.out.println (aCollection.elementAt(i));
	   }
   }

   public static void instanceOfTest(Object anObject) {
	   System.out.println (anObject instanceof StringHistory);
	   System.out.println (anObject instanceof InheritingStringDatabase);
	   System.out.println (anObject instanceof AnInheritingStringSet);
   }
   public static void main(String[] args) {
	   InheritingStringDatabase aSet = new AnInheritingStringSet();
	   BaseStringHistory aSetMasqueradingAsAHistory = new AnInheritingStringSet();
	   
	   // INSTANCE OF RULES
	   // To consolidate what you have learned uncomment the 
	   // following and run the program
	   instanceOfTest(new ABaseStringHistory());
	   instanceOfTest(new AnInheritingStringSet());
	   // OVERRIDE RESOLUTION
	   
	   // Which addElement is called in the two cases below, 
	   // the one in AStringHistory or the one in AStringSet?
	   // Does it matter how you type the variable holding the set?
	   aSet.addElement("Joe Doe");
	   aSetMasqueradingAsAHistory.addElement("Joe Doe");
	   
	   // OVERLOAD RESOLUTION
	   // Which of the two overloaded prints is called in the two cases
	   // the one defined for StringHistory or the one defined for StringSet?
	   // Does it matter how you type the variable holding the set?
	   print (aSet);
	   print(aSetMasqueradingAsAHistory);
	   
	   // ASSIGNMENT RULES	   
	   // Comment the statements below. 
//	   aSetMasqueradingAsAHistory = aSet;
//	   aSet = aSetMasqueradingAsAHistory;
//	   aSetMasqueradingAsAHistory = new AStringHistory();
//	   aSet = (StringDatabase) aSetMasqueradingAsAHistory;
//	   AStringDatabase aDatabaseClassInstance = aSet;
	   //Which of the statements above give errors?
	   // Can you explain the reason?
	   // Comment back the ones that gives errors.
	   
	   // Uncomment the following statement and try to determine what will happen when you execute it
	   // with the above cast uncommented
	   System.out.println (aSet.member("Joe Doe"));
	   // run the program and observe the error.
	   // Comment the statement back.
	   
	  
	   
  	   Object anObject = aSet; // aSet is typed as an interface, Object is a superclass
	   // If I is an interface, and C is a class, based on your understanding of IS-A rules, 
  	   // is it ever true that I IS-A C?
	   // If not, why was the statement above legal?
	   // This example points flaws in Java's design, it did not define an interface for class Object
  	   // and needs a special rule to make the statement above legal
	   

   }
   
 
   
   
   
   
}
