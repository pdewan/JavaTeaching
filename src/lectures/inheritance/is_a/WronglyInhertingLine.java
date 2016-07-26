package lectures.inheritance.is_a;

import lectures.graphics.Point;
// WRONG USE OF INHERITANCE
// We are inheriting the X and Y Coordinates of Point
// Does it make sense to say Line IS-A Point 
// Should you be able to use a Line where a Point is expected?
// How can we inherit code and yet not get into this semantic problem?
// Go to interface Locatable
public interface WronglyInhertingLine extends Point {
	int getWidth();

	int getHeight();

	void setWidth(int newVal);

	void setHeight(int newVal);
}
