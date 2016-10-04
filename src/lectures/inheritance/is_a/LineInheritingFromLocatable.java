package lectures.inheritance.is_a;
/**
 * This is another interface that represents a line, but now that the X and Y
 * coordinate properties are in a separate interface, it inherits from that instead
 * of from point.
 * 
 * Does it make sense to use a line somewhere where something locatable is expected?
 * 
 * (T/F) An interface defining a line should inherit from an interface defining
 * a locatable. That is, LineInheritingFromLocatable used inheritance correctly.
 */
public interface LineInheritingFromLocatable extends Locatable {

	int getWidth();

	int getHeight();

	void setWidth(int newVal);

	void setHeight(int newVal);
}
