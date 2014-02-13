package lectures.nester;

public interface ScalableNester {

	public ScalableShape getNestedRectangle();

	public ScalableShape getEnclosingRectangle();

	public void scale(int percentage);

}