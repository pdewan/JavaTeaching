package lectures.test.junit;

import java.util.Arrays;
import java.util.Collection;

import lectures.graphics.ACartesianPoint;
import lectures.graphics.Point;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value = Parameterized.class)
public class ACartesianPointParametrizedJUnitTester {
	int x;
	int y;
	double correctRadius;
	double correctAngle;
	
	public ACartesianPointParametrizedJUnitTester(int theX, int theY, double theCorrectRadius,
			double theCorrectAngle) {
		x = theX;
		y = theY;
		correctRadius = theCorrectRadius;
		correctAngle = theCorrectAngle;		
	}
	@Parameters
	public static Collection<Object[]> constructorParameters() {
		Object [][] data = new Object[][] {
				{10, 0, 10, 0}, // 0 degree angle
				{0, 10, 10.0, Math.PI/2},	// 90 degree angle		
				{0, -10, 10.0, -Math.PI / 2},  // -90 degree angle
				{10, 0, 10.0, Math.PI}, //wrong test, should fail
				{-10, 0, 10.0, Math.PI} //180 degree angle
		};
		return Arrays.asList(data);
	}

	@Test
	public void test() {
		Point point = new ACartesianPoint(x, y);
		double computedRadius = point.getRadius();
		double computedAngle = point.getAngle();	
		Assert.assertTrue(computedRadius == correctRadius);
		Assert.assertTrue(computedAngle == correctAngle);	
	}

}
