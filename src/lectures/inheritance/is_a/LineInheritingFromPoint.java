package lectures.inheritance.is_a;

import lectures.graphics.Point;
/**
 * CORRECT USE OF INHERITANCE
 * 
 * A class C should inherit from class E only if 
 * it makes sense to use C where E can be used.
 * 
 * Thus, this interface (which represents a line) should inherit
 * from Point only if it makes sense to use a line where a point
 * is expected.
 * 
 * In this interface, we are inheriting the declarations of X and
 * Y coordinate properties from Point so they do not have to be rewritten.
 * 
 * Considering the above rules, do you think this is a good idea?
 * 
 * (T/F) An interface defining a line should inherit from an interface defining
 * a point. That is, LineInheritingFromPoint used inheritance correctly.
 *    

 * 
 * Go to interface Locatable to see another way to share code with Point.
 */
public interface LineInheritingFromPoint extends Point {
	int getWidth();

	int getHeight();

	void setWidth(int newVal);

	void setHeight(int newVal);
}
