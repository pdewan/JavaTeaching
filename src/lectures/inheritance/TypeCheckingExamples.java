package lectures.inheritance;

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
	   StringHistory stringHistory = new AStringDatabase();
	   stringHistory.size();
//	   stringHistory .clear();
	   ((StringDatabase) stringHistory) .clear();
	   if (stringHistory instanceof StringDatabase) {
		   ((StringDatabase) stringHistory) .clear();
	   } else {
		   System.out.println("Got unlucky");
	   }
	}
   
   public  void incorrectCompileTimeAndRunTimeCasts() {
	   StringDatabase database= (StringDatabase) new AStringHistory(); // runtime error known at compile to be error
//	   String[] strings= (String)  "Joe Doe";
	   Point point = (Point) (new AStringHistory()); // runtime error and known to be wrong at compile time
	   StringHistory stringHistory = new AStringHistoryAndPoint(); 
	   point = (Point) stringHistory; 
//	   point = (Point) "hello";
	}
   
   public void legalAndIllegalArrayExamples() {
	   Object[] objects = { "Joe Doe", new AStringDatabase(), new AStringHistory()};
	   StringDatabase[] database= {(StringDatabase) new AStringHistory()};
   }
   
   public void specialObjectRules() {
	   StringHistory stringHistory = new AStringDatabase(); 
	   Object o = stringHistory; // StringHistory is not an object
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
