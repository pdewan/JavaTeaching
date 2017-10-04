package lectures.inheritance.is_a;
/**
 * This is an extra interface we have added, which is not directly implemented by
 * any class. 
 *
 */
public interface Locatable {
	int getX();
	int getY();
	void setX(int newVal);
	void setY(int newVal);
}
/* 
 * Press F4 (Open Type Declaration) on the interface Locatable and see 
 * subtypes of this interface.
 * 
 * Notice that there is another version of an interface representing a line, but
 * also that there is another version of an interface representing a point.
 * 
 * Does it make sense to use a point somewhere where something locatable is expected?
 *
 * 
 * (T/F) t makes sense for a type defining a point to inherit from a type
 *  defining a locatable. That is, PointInheritingFromLocatable uses inheritance correctly.
 * 
 * Does it make sense to use a line somewhere where something locatable is expected?
 * 
 * (T/F) It makes sense for a type defining a line to inherit from a type 
 * defining a locatable. That is, LineInheritingFromLocatable uses 
 * inheritance correctly.
 * 
 * 
 * Go to interface PointInheritingFromLocatable
 *
 */
