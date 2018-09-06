package lectures.inheritance_vs_delegation.wrong_is_a;

import lectures.graphics.extra.ACartesianPoint;

public class ASquareIS_A_Point extends ACartesianPoint {
	int sideLength;
	public ASquareIS_A_Point(int theX, int theY, int theSideLength) {
		super(theX, theY);
		sideLength = theSideLength;
	}
	public int getSideLength() {return sideLength;}
}
