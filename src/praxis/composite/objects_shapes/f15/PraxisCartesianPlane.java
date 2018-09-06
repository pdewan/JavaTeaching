package praxis.composite.objects_shapes.f15;

import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.graphics.extra.Line;
import lectures.graphics.extra.StringShape;

public interface PraxisCartesianPlane {
	public int getAxesLength();
	public void setAxesLength(int anAxesLength);
    public LineWithObjectProperty getXAxis();
    public Line getYAxis();
    public StringShape getXLabel();
	public StringShape getYLabel();  
}
