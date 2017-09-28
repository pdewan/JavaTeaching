package praxis.composite.objects_shapes.f15;

import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.graphics.Line;
import lectures.graphics.StringShape;

public interface PraxisCartesianPlane {
	public int getAxesLength();
	public void setAxesLength(int anAxesLength);
    public LineWithObjectProperty getXAxis();
    public Line getYAxis();
    public StringShape getXLabel();
	public StringShape getYLabel();  
}
