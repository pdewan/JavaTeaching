package lectures.composite.design_pattern;

import bus.uigen.ObjectEditor;
public class ALeafShape implements LeafShape {
	int x, y, width, height;
	public ALeafShape(int theX, int theY, int theWidth, int theHeight) {
		x = theX;
		y = theY;
		width = theWidth;
		height = theHeight;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public int getWidth() {return width;}	
	public int getHeight() { return height;}	
	public void setHeight(int newVal) {height = newVal;}
	public void setWidth(int newVal) {width = newVal;}
	public void scale(double fraction){
		width =  (int) (width*fraction);
		height = (int) (height*fraction);		
	}	
	public static void main (String[] args) {
		ObjectEditor.edit( new ALeafShape (0, 0, 20, 20));
	}
}
