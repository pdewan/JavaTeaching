package lectures.inheritance;


public interface InheritingStringDatabase extends BaseStringHistory {
//	public static final int MAX_SIZE = 10;
	public void removeElement(String element);
    public void clear();
    public boolean member(String element);
}
/*
 * Since InheritingStringDatabase extends BaseStringHistory 
 * InheritingStringDatabase is a subtype of BaseStringHistory
 * BaseStringHistory is a base type/supertype of
 * InheritingStringDatabase.
 * 
 * Which of the following is consistent with the above statements.
 *
 * If interface A extends interface B:
 *     (a) A is a superclass of B.
 *     (b) B is a supertype of A.
 *     (c) A is a subclass of B.
 *     (d) B is a base type of A.
 */
/*
 * Use Alt <- to return
 */
