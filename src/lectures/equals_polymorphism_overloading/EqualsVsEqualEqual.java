package lectures.equals_polymorphism_overloading;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;
import lectures.inheritance.ABaseStringHistory;
import lectures.inheritance.AnInheritingStringSet;
import lectures.inheritance.BaseStringHistory;

public class EqualsVsEqualEqual {
	public static void main (String[] args) {
		defaultEqualsVsEqualEqual();
		defaultEqualsVsCustomEquals();
	}
	public static void defaultEqualsVsEqualEqual() {
		Point p1 = new ACartesianPoint(200, 200); 
		Point p2 = p1;
		System.out.println(p1 == p2);
		p2 = new ACartesianPoint(200, 200);		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		StringHistory stringHistory1 = new AStringHistory();
		StringHistory stringHistory2 = new AStringHistory();
		System.out.println(stringHistory1.equals(stringHistory2));
			
	}
	public static void defaultEqualsVsCustomEquals() {		
		BaseStringHistory stringHistory1 = new ABaseStringHistory();
		BaseStringHistory stringHistory2 = new ABaseStringHistory();
		System.out.println(stringHistory1.equals(stringHistory2));
		stringHistory1 = new AStringHistoryWithCustomEquals();
		stringHistory2 = new AStringHistoryWithCustomEquals();
		System.out.println(stringHistory1.equals(stringHistory2));
		System.out.println(stringHistory1.equals(new AnInheritingStringSet()));
		System.out.println(((StringHistoryWithCustomEquals)stringHistory1).equals(stringHistory2));		
	}
	

}
