package lectures.inheritance.extra;


import lectures.composite.objects_shapes.Point;
import lectures.inheritance.ABaseStringHistory;
import lectures.inheritance.AnInheritingStringDatabase;
import lectures.inheritance.BaseStringHistory;
import lectures.inheritance.InheritingStringDatabase;
import lectures.interfaces.BMISpreadsheet;

public class InheritanceTypeCheckingExamples {
	public  void assigningToAMoreSpecificType() {
//		StringDatabase stringDatabase = new AStringHistory();
//		stringDatabase.clear();	
//		String[] strings = {"Joe Doe", new Object()};		
	}
	
   public  void assigningToAMoreGeneralType() {
	   BaseStringHistory stringHistory = new AnInheritingStringDatabase();
	   stringHistory.size();
//	   stringHistory .clear();
	   ((InheritingStringDatabase) stringHistory) .clear();
	   if (stringHistory instanceof InheritingStringDatabase) {
		   ((InheritingStringDatabase) stringHistory) .clear();
	   } else {
		   System.out.println("Got unlucky");
	   }
	}
   
   public  void incorrectCompileTimeAndRunTimeCasts() {
	   /*
	    * We know at compile time that new AStringHistory() will not
	    * be castable to StringDatabase.
	    * 
	    * Yet we do not get a compile time error.
	    */
	   InheritingStringDatabase database= (InheritingStringDatabase) new ABaseStringHistory(); 
//	   String[] strings= (String)  "Joe Doe";
	   Point point = (Point) (new ABaseStringHistory()); // runtime error and known to be wrong at compile time
	   BaseStringHistory stringHistory = new AStringHistoryAndPoint(); 
	   point = (Point) stringHistory; 
//	   point = (Point) "hello";
	}
   
   public void legalAndIllegalArrayExamples() {
	   Object[] objects = { "Joe Doe", new AnInheritingStringDatabase(), new ABaseStringHistory()};
	   InheritingStringDatabase[] database= {(InheritingStringDatabase) new ABaseStringHistory()};
   }
   
   public void specialObjectRules() {
	   BaseStringHistory stringHistory = new AnInheritingStringDatabase(); 
	   /*
	    * StringHistory is an object
	    */
	   Object o = stringHistory; 
	   /*
	    * println takes Object arguments, so we can pass stringHistory
	    */
	   System.out.println(stringHistory); 

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
