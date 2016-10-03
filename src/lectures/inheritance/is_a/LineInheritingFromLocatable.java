package lectures.inheritance.is_a;
/**
 * This interface adds no extra methods
 * 
 * (T/F) An interface defining a line should inherit from an interface defining
 * a locatable, that is, LineInheritingFromLocatable used inheritance correctly.
 */
public interface LineInheritingFromLocatable extends Locatable {

	int getWidth();

	int getHeight();

	void setWidth(int newVal);

	void setHeight(int newVal);
}
