package lectures.test.junit;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;

//import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class ACartesianPointJUnitTester {	
	@Test
	public void test() {
		test(10, 0, 10.0, 0); // 0 degree angle
		test(0, 10, 10.0, Math.PI / 2); // 90 degree angle
		test(0, -10, 10.0, -Math.PI / 2); // -90 degree angle
		test(-10, 0, 10.0, Math.PI); // 180 degree angle
	}	
	public void test(int theX, int theY, double theCorrectRadius,
			double theCorrectAngle) {
		Point point = new ACartesianPoint(theX, theY);
		double computedRadius = point.getRadius();
		double computedAngle = point.getAngle();	
		Assert.assertTrue(computedRadius == theCorrectRadius);
		Assert.assertTrue(computedAngle == theCorrectAngle);	
	}

}
