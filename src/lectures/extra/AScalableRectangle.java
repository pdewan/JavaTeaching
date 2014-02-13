package lectures.extra;


public class AScalableRectangle implements ScalableRectangle {
	int x, y, width, height;
	public AScalableRectangle(int theX, int theY, int theWidth, int theHeight) {
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
	public void scale(int percentage){
		width = (width*percentage)/100;
		height = (height*percentage)/100;		
	}
}
