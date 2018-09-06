package lectures.graphics.extra;

import lectures.composite.objects_shapes.ACartesianPoint;
import lectures.composite.objects_shapes.Point;


public class ACartesianPointTester {
	public void test() {
		test(10, 0, 10.0, 0); // 0 degree angle
		test(0, 10, 10.0, Math.PI / 2); // 90 degree angle
		test(0, -10, 10.0, -Math.PI / 2); // -90 degree angle
		test(-10, 0, 10.0, Math.PI); // -180 degree angle
	}

	public void test(int theX, int theY, double theCorrectRadius,
			double theCorrectAngle) {
		Point point = new ACartesianPoint(theX, theY);
		double computedRadius = point.getRadius();
		double computedAngle = point.getAngle();
		System.out.println("------------");
		System.out.println("X:" + theX);
		System.out.println("Y:" + theY);
		System.out.println("Expected Radius:" + theCorrectRadius);
		System.out.println("Computed Radius:" + computedRadius);
		System.out.println("Radius Error:"
				+ (theCorrectRadius - computedRadius));
		System.out.println("Expected Angle:" + theCorrectAngle);
		System.out.println("Computed Angle:" + computedAngle);
		System.out.println("Angle Error:" + (theCorrectAngle - computedAngle));
		System.out.println("------------");
	}
	
	public static void main (String[] args) {
		(new ACartesianPointTester()).test();
	}
}
