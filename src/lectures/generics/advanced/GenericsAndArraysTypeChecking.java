package lectures.generics.advanced;

import java.util.ArrayList;
import java.util.List;

import lectures.generics_adapters.AHistory;
import lectures.generics_adapters.History;
import lectures.graphics.extra.ACartesianPoint;
import lectures.graphics.extra.Point;
import lectures.inheritance.is_a.extra.BoundedPoint;

public class GenericsAndArraysTypeChecking {
	
	public static void collectionISA() {
		History<String>  stringHistory   = new AHistory();
//		History<Object> objectHistory = stringHistory;
		stringHistory.addElement("hello");
//		objectHistory.addelement(new ACartesianPoint(5,10));		
	}
	public static void arrayISA() {
		String[] strings   = new String[50];
		Object[] objects   = strings;
		strings[0] = "hello";
		objects[1] = new ACartesianPoint(5,10);	
	}
	static void printXWildCard (History<? extends Point> pointHistory) {
		for (int index = 0; index < pointHistory.size(); index++)
			System.out.println(pointHistory.elementAt(index).getX());
	}
	
	static void printX (History<Point> pointHistory) {
		for (int index = 0; index < pointHistory.size(); index++)
			System.out.println(pointHistory.elementAt(index).getX());
	}
	
	static void addAll (History<? extends Point> pointHistory) {
		for (int index = 0; index < pointHistory.size(); index++)
//			 pointHistory.addElement(new ACartesianPoint(5,6))
			;
	}
	
	static void printX (Point[] points) {
		for (int index = 0; index < points.length; index++)
			System.out.println(points[index].getX());
	}
	
	static void elaborateInstantiationOrNot() {
		List<String> contents = new ArrayList();
		List<String> contents2 = new ArrayList<String>();
//		String  nonExistingElement = (new ArrayList()).get(0);
		String  nonExistingElement2 = (new ArrayList<String>()).get(0);
		contents.add("test");
		List<String> correctCopy = new ArrayList(contents);
		List<Point> incorrectCopy= new ArrayList(contents);
		incorrectCopy.add(new ACartesianPoint(5,5));
		Point firstElement = incorrectCopy.get(0);
//		List<Point> checkedCopy1 = new ArrayList<String>(contents);
//		List<Point> checkedCopy2 = new ArrayList<Point>(contents);
	}
	
	



	
	public static void main (String[] args) {
		History<BoundedPoint> boundedPointHistory = new AHistory();
//		printX(boundedPointHistory);
		printXWildCard(boundedPointHistory);

		
	}



}
