package praxis.inheritance.is_a;

import java.util.Arrays;

import praxis.composite.objects_shapes.f15.APraxisCartesianPlane;
import praxis.inheritance.APraxisStringDatabase;
import praxis.inheritance.APraxisStringHistory;
import praxis.inheritance.APraxisStringSet;
import praxis.inheritance.PraxisStringDatabase;
import praxis.inheritance.PraxisStringHistory;
import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.composite.objects_shapes.Point;
import lectures.interfaces.BMISpreadsheet;

public class PraxisTypeCheckingExamples {

  public static void print (PraxisStringHistory aCollection) {
	   System.out.println("Printing:" + aCollection);
	   for (int i = 0; i < aCollection.size(); i++) {
		   System.out.println (aCollection.get(i));
	   }
   }
   public static void print (PraxisStringDatabase aCollection) {
	   System.out.println("Printing:" + aCollection);
	   for (int i = 0; i < aCollection.size(); i++) {
		   System.out.println (aCollection.get(i));
	   }
   }
//   public static void addElements(PraxisStringDatabase aCollection) {
   public static void addElements(PraxisStringHistory aCollection) {
	   aCollection.add("Joe Doe");
	   aCollection.add("Joe Doe");
   }
   public static void removeElements(PraxisStringDatabase aCollection) {
	   aCollection.removeElement("Joe Doe");
	   
   }
   
   public static void main(String[] args) {
	   PraxisStringHistory aHistory = new APraxisStringHistory();
	   PraxisStringDatabase aSet = new APraxisStringSet();
	   PraxisStringHistory aSetMaqueradingAsAHistory = new APraxisStringSet();
	   addElements(aHistory);
	   addElements(aSet);
	   addElements(aSetMaqueradingAsAHistory);
	  
	   print (aHistory);
	   print(aSet);
	   print(aSetMaqueradingAsAHistory);
	   // comment this out
	   aHistory = aSet;
//	   removeElements(aHistory);
	   removeElements((PraxisStringDatabase) aHistory);
	   double d = 2.5;
	   System.out.println ("d:" + d + " d with casting: " + (int) d);
//	   aSet = aHistory;
	   removeElements(aSet);
	  
	   


	   
	   
   }
   
   
}
