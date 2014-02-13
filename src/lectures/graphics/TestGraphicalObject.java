package lectures.graphics;

public class TestGraphicalObject {

	int width = 50;
	
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	public int getWidth() {
		return width;
	}
	
	public Line getLine() {
		return new ALine(50,50,width,0);
	}
	
}
