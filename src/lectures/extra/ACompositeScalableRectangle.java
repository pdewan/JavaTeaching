package lectures.extra;

public class ACompositeScalableRectangle implements Shape, Scalable {
	int x, y, width, height;
	public ACompositeScalableRectangle(int theX, int theY, int theWidth, int theHeight) {
		x = theX;
		y = theY;
		width = theWidth;
		height = theHeight;
	}
	@Override
	public int getX() {
		return x;
	}
	@Override
	public int getY() {
		return y;
	}
	@Override
	public int getWidth() {	
		return width;
	}	
	@Override
	public int getHeight() {
		return height;
	}	
	@Override
	public void scale(int percentage){
		width = (width*percentage)/100;
		height = (height*percentage)/100;		
	}
	
}
