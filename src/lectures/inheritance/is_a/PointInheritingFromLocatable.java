package lectures.inheritance.is_a;
/**
 * This interface adds no extra methods- it merely reuses the declarations from
 * Locatable.
 * 
 * Does it make sense to use a point somewhere where something locatable is expected?
 * 
 * (T/F) An interface defining a point should inherit from an interface defining
 * a locatable. That is, PointInheritingFromLocatable used inheritance correctly.
 * 
 * Go to LineInheritingFromLocatable.
 */
public interface PointInheritingFromLocatable extends Locatable{

}
