package lectures.inheritance;
/*
 * Illustrates use of static factory methods
 */
public class StringHistoryFactory {	
	public static BaseStringHistory createStringHistory() {
		return new ABaseStringHistory();
		// alternate return
//		return new AnInheritingStringSet();
	}
/*
 * createStringHistory is an example of a factory method.
 * 
 * Which statements are consistent with this example?
 * 
 * A factory method:
 *     (c) is a void method, returning nothing
 *     (b) always returns the same instance.
 *     (d) has a polymorphic return type, that is, can return an instance of multiple
 *     classes.
 *     (e) chooses which instance of an object type is returned
 *     (f) none of the above      
 */
}
/*
 * Next class StringHistoryReverser
 */
