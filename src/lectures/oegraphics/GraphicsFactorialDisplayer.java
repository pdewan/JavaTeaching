package lectures.oegraphics;

import shapes.FlexibleShape;
import bus.uigen.ObjectEditor;

public interface GraphicsFactorialDisplayer extends FactorialGraphics {
//	public int getX();
//	public void setX(int newVal);
	public FlexibleShape getRectangle();
	public FlexibleShape getTextShape();
	public void computeDependentProperties();
}
