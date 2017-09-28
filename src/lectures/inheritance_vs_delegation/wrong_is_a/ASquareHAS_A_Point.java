package lectures.inheritance_vs_delegation.wrong_is_a;

import lectures.graphics.Point;

public class ASquareHAS_A_Point implements Square {
	Point center;
	int sideLength;
	public ASquareHAS_A_Point (Point theCenter, int theSideLength) {
		center = theCenter;
		sideLength = theSideLength;		
	}
	public int getX() {return center.getX();}
    public int getY() {return center.getY();}
    public double getRadius() {return center.getRadius();}
    public double getAngle() {return center.getAngle();}
    public int getSideLength() {return sideLength;}
}
