package lectures.static_state;

import lectures.graphics.extra.Point;


public class ACartesianPointComputingMidPoint implements Point {
	
	private static int numInstances = 0;
	
	int x, y;
	public ACartesianPointComputingMidPoint(int theX, int theY) {
		x = theX;
		y = theY;
		numInstances++;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	} 	
	public double getAngle() {
		return Math.atan((double) y/x);
	}
	public double getRadius() {
		return  Math.sqrt(x*x + y*y);
	}
	
	public static int getNumInstances() {
		return numInstances;
	}
	
	public static Point mid (int x1, int y1, int x2, int y2 ) {
        return new ACartesianPointComputingMidPoint(x1 + (x2 - x1)/2, y1 + (y2 - y1)/2);	
	}
	
	public static Point mid (Point p1,  Point p2 ) {
        return mid (p1.getX(), p1.getY(), p2.getX(), p2.getY());	
	}

}