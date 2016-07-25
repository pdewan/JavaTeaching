package lectures.inheritance.is_a;

import java.util.Arrays;






import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.AStringSetMain;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.graphics.Point;
import lectures.inheritance.AStringDatabase;
import lectures.inheritance.AStringSet;
import lectures.inheritance.StringDatabase;
import lectures.interfaces.BMISpreadsheet;

public class TypeCheckingExamples {
    // IS_A DEFINITION AND VISUALIZATION
   // Click on StringHistory below and press F4 (Open Type Hierarchy).
   // Look at the Type Hierarchy tab on the upper left.
   // This tab shows the IS-A relationship between StringHistory and other types
   // in the workspace. Look carefully at the descendants of StringHistory - both direct children
   // and other descendants. StringHistory is an interface. Are the descendants all interfaces?
   // Can you formally define the IS-A relationship in terms of the implements and extends 
   // relationships we have seen so far?   
   // 
	

  public static void print (StringHistory aCollection) {
	   System.out.println("String History Print:" + aCollection);
	   for (int i = 0; i < aCollection.size(); i++) {
		   System.out.println (aCollection.elementAt(i));
	   }
   }
  
  // Overloading the method above with a type that IS-A the type of the previous method
   public static void print (StringDatabase aCollection) {
	   System.out.println("StringDatabase Print:" + aCollection);
	   for (int i = 0; i < aCollection.size(); i++) {
		   System.out.println (aCollection.elementAt(i));
	   }
   }

   public static void instanceOfTest(Object aCollection) {
	   System.out.println (aCollection instanceof StringHistory);
	   System.out.println (aCollection instanceof StringDatabase);
	   System.out.println (aCollection instanceof AStringSet);
   }
   public static void main(String[] args) {
	   StringDatabase aSet = new AStringSet();
	   StringHistory aSetMasqueradingAsAHistory = new AStringSet();
	   
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
	   //Which statements give errors?
	   // Can you explain the reason?
	   // Comment in the ones that gives errors.
	   
	   // Uncomment the following statement and try to determine what will happen when you execute it
	   // with the above cast uncommented
	   System.out.println (aSet.member("Joe Doe"));
	   // run the program and observe the error.
	   // Comment the statement back.
	   
	   // INSTANCE OF RULES
	   // To consolidate what you have learned uncommen the following and run the program
	   instanceOfTest(new AStringHistory());
	   instanceOfTest(new AStringDatabase());
	   instanceOfTest(new AStringSet());
	  
	  
   }
   
 
   
   
   
   
}
