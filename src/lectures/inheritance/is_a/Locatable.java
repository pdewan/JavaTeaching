package lectures.inheritance.is_a;
// ADDING EXTRA TYPES TO CREATE MEANINGFUL SUBTYPE RELATIONSHIPS
// Press F4 on the interface Locatable and see the correct type hierarchy for sharing
// code between different kinds of shapes
public interface Locatable {
	int getX();
	int getY();
	void setX(int newVal);
	void setY(int newVal);
}
