package lectures.graphics;
import java.util.Scanner;

import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import lectures.inheritance.extra.MutablePoint;
import lectures.inheritance.is_a.extra.AMutablePoint;

public class PointUIs {
	static Scanner scanner = new Scanner(System.in);
	static int readX () {
		System.out.println ("Please enter x:");
		return (Integer.parseInt(scanner.nextLine()));// no error checking for simplicity
	}
	static int readY () {
		System.out.println ("Please enter y:");
		return (Integer.parseInt(scanner.nextLine()));// no error checking for simplicity
	}
	static void printRadius(double aRadius) {
		System.out.println ("The Radius is:" + aRadius);
	}
	static void printAngle(double anAngle) {
		System.out.println ("The Angle is:" + anAngle);
	}
	public static void main(String[] args) {
		MutablePoint aPoint = new AMutablePoint();
		OEFrame anOEFrame = ObjectEditor.edit(aPoint);
		while (true) { // we will loop forever to make our programming easier
			aPoint.setX(readX());
			aPoint.setY(readY());
			anOEFrame.refresh();
			printRadius(aPoint.getRadius());
			printAngle(aPoint.getAngle());					
		}		
	}
}
