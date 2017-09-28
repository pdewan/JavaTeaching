package lectures.composite.objects_shapes;

import lectures.graphics.Line;
import lectures.graphics.StringShape;

public interface CartesianPlane {
	static final int INIT_ORIGIN_X = 200;
	static final int INIT_ORIGIN_Y = 125;
	static final int INIT_AXES_LENGTH = 100;
	static final int FRAME_WIDTH = 600;
	static final int FRAME_HEIGHT = 600;

	public int getAxesLength();
	public void setAxesLength(int anAxesLength);
    public Line getXAxis();
    public Line getYAxis();
    public StringShape getXLabel();
	public StringShape getYLabel();  
}
