package lectures.inheritance.is_a;

public interface WronglyInhertingLine extends NotInheritingPoint {
	int getWidth();

	int getHeight();

	void setWidth(int newVal);

	void setHeight(int newVal);
}
