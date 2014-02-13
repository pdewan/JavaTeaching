package lectures.test.junit;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ASinglePointBeforeClassJUnitMultiTester {	
	static Point point;
	@BeforeClass
	public static void createPoint() {
		System.out.println("Testing 10, 10");
		point = new ACartesianPoint(10, 10);
	}
	
	@Test
	public void testAngle() {
		double computedAngle = point.getAngle();	
		Assert.assertTrue(computedAngle == Math.PI/4);

	}
	@Test
	public void testRadius() {
		double computedRadius = point.getRadius();
		Assert.assertTrue(computedRadius == Math.sqrt(200));
		
	}
	

}
