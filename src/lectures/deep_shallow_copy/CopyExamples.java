package lectures.deep_shallow_copy;

import lectures.inheritance.AMutablePoint;
import lectures.inheritance.MutablePoint;

public class CopyExamples {
	public static void assignmentIsNotCopy() {
		MutablePoint p1 = new AMutablePoint(200, 200);
		MutablePoint p2 = p1;
		p1.setX (100);
		System.out.println(p2.getX() == p1.getX());		
	}
	
	public static void userCopies() {
		MutablePoint p1 = new AMutablePoint(200, 200);
		MutablePoint p2 = new AMutablePoint (p1.getX(), p1.getY());
		p1.setX (100);
		System.out.println(p2.getX() == p1.getX());		
	}
	
	public static void pointDefaultCopy() {
		CloneablePoint p1 = new ACloneablePoint(200, 200);
		CloneablePoint p2 = (CloneablePoint) p1.clone();  
		p1.setX (100);
		System.out.println(p2.getX() == p1.getX());	
	}
	public static void boundedPointDefaultCopy() {
		CloneableBoundedPoint p1 = new ACloneableBoundedPoint (75, 75,  
				  new ACloneablePoint(50,50), new ACloneablePoint(100,100));
		CloneableBoundedPoint p2 = (CloneableBoundedPoint) p1.clone();  
		p1.setX (100);
		p1.getUpperLeftCorner().setX(200);
		System.out.println(p2.getX() == p1.getX());	
		System.out.println(p1.getUpperLeftCorner().getX() == p2.getUpperLeftCorner().getX());		
	}
	public static void boundedPointDeepCopy() {
		CloneableBoundedPoint p1 = new ACloneableBoundedPoint (75, 75,  
				  new ACloneablePoint(50,50), new ACloneablePoint(100,100));
		CloneableBoundedPoint p2 =  p1.deepCopy();  
		p1.setX (100);
		p1.getUpperLeftCorner().setX(200);
		System.out.println(p2.getX() == p1.getX());	
		System.out.println(p1.getUpperLeftCorner().getX() == p2.getUpperLeftCorner().getX());		
	}
	public static void graphBoundedPointDeepCopy() {
		CloneableBoundedPoint p1 = new ACloneableBoundedPoint (75, 75,  
				  new ACloneablePoint(50,50), new ACloneablePoint(100,100));
		p1.setUpperLeftCorner(p1);
		CloneableBoundedPoint p2 =  p1.deepCopy();  
		p1.setX (100);
		p1.getUpperLeftCorner().setX(200);
		System.out.println(p2.getX() == p1.getX());	
		System.out.println(p1.getUpperLeftCorner().getX() == p2.getUpperLeftCorner().getX());		
	}
	public static void printGraphArray() {
		Object[] recursive = new Object[1];
		recursive[0] = recursive;
		System.out.println(recursive);
				
	}
}
