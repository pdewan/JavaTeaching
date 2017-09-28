package lectures.assertions.advanced;

import java.util.Collection;
import java.util.Iterator;

public interface Asserter<ElementType> {
	public void myAssert(boolean boolExp, String message)
			throws AnAssertionFailedException;

	public void assertUniversal(Iterator<ElementType> enumParam,
			ElementChecker elementChecker, String message);

	public void assertExistential(Iterator<ElementType> enumParam,
			ElementChecker elementChecker, String message);
	public boolean checkUniversal(Collection<ElementType> elements,
			ElementChecker elementChecker, String message) ;

	public boolean checkExistential(Collection<ElementType> elements,
			ElementChecker elementChecker, String message) ;
}