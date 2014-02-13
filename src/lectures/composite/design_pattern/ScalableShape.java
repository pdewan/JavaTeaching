package lectures.composite.design_pattern;

public interface ScalableShape  {
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public void scale(double fraction);
}
