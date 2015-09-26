package praxis.inheritance.is_a;

import praxis.inheritance.APraxisStringDatabase;
import praxis.inheritance.APraxisStringHistory;
import praxis.inheritance.PraxisStringDatabase;
import praxis.inheritance.PraxisStringHistory;
import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.graphics.Point;
import lectures.interfaces.BMISpreadsheet;

public class TypeCheckingExamples {
	public  void assigningToAMoreSpecificType() {
//		StringDatabase stringDatabase = new AStringHistory();
//		stringDatabase.clear();	
//		String[] strings = {"Joe Doe", new Object()};		
	}
	
   public  void assigningToAMoreGeneralType() {
	   PraxisStringHistory stringHistory = new APraxisStringDatabase();
	   stringHistory.size();
//	   stringHistory .clear();
	   ((PraxisStringDatabase) stringHistory) .clear();
	   if (stringHistory instanceof PraxisStringDatabase) {
		   ((PraxisStringDatabase) stringHistory) .clear();
	   } else {
		   System.out.println("Got unlucky");
	   }
	}
   
   public  void incorrectCompileTimeAndRunTimeCasts() {
	   PraxisStringDatabase database= (PraxisStringDatabase) new APraxisStringHistory(); // runtime error known at compile to be error
//	   String[] strings= (String)  "Joe Doe";
	   Point point = (Point) (new APraxisStringHistory()); // runtime error and known to be wrong at compile time
	   StringHistory stringHistory = new APraxisStringHistoryAndPoint(); 
	   point = (Point) stringHistory; 
//	   point = (Point) "hello";
	}
   
   public void legalAndIllegalArrayExamples() {
	   Object[] objects = { "Joe Doe", new APraxisStringDatabase(), new AStringHistory()};
	   PraxisStringDatabase[] database= {(PraxisStringDatabase) new AStringHistory()};
   }
   
   public void specialObjectRules() {
	   PraxisStringHistory stringHistory = new APraxisStringDatabase(); 
	   Object o = stringHistory; // StringHistory is an object
	   System.out.println(stringHistory);  // println takes Object arguments

   }
   public void primitiveExamples() {
//	   int i= 2.5;
	   int i = (int) 2.5;
	   double d = 2;	
	   i = (int) d;;
   }
   
   public void printPointOrBMIProperties(Object pointOrBMI) {
	   if (pointOrBMI instanceof Point) {
		   Point point = (Point) pointOrBMI;
		   System.out.println(point.getX());
	   } else if (pointOrBMI instanceof BMISpreadsheet) {
		   BMISpreadsheet bmiSpreadsheet = (BMISpreadsheet) pointOrBMI;
		   System.out.println(bmiSpreadsheet.getBMI());
	   }
   }
   
}
