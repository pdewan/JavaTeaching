package lectures.assertions.advanced;

import java.util.Collection;
import java.util.Iterator;

public class AnAsserter<ElementType> implements Asserter<ElementType> {
	public void myAssert(boolean boolExp, String message) throws AssertionError {
		if (boolExp)
			throw new AssertionError(message);
	}

	public void assertUniversal(Iterator<ElementType> elements,
			ElementChecker elementChecker, String message) {
		while (elements.hasNext())
			if (!elementChecker.check(elements.next()))
				throw new AssertionError(message);
	}
	

	public void assertExistential(Iterator<ElementType> elements,
			ElementChecker elementChecker, String message) {
		while (elements.hasNext())
			if (elementChecker.check(elements.next()))
				return;
		throw new AssertionError(message);
	}
	public boolean checkUniversal(Collection<ElementType> elements,
			ElementChecker elementChecker, String message) {
		for (ElementType element:elements)
			if (!elementChecker.check(elements))
				return false;
		return true;
	}	

	public boolean checkExistential(Collection<ElementType> elements,
			ElementChecker elementChecker, String message) {
		for (ElementType element:elements)
			if (elementChecker.check(element))
				return true;
		return false;
	}
}