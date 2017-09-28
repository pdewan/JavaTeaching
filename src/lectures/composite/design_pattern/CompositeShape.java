package lectures.composite.design_pattern;

public interface CompositeShape extends Scalable {
	public Scalable getInner();
	public LeafShape getOuter();
}
