package lectures.assertions.advanced;

public interface ElementChecker<ElementType> {
	public boolean check(ElementType element);
}