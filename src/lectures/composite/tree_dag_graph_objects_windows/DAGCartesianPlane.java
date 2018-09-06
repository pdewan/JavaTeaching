package lectures.composite.tree_dag_graph_objects_windows;

import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.graphics.extra.Point;
import lectures.graphics.extra.StringShape;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public interface DAGCartesianPlane {
    public LineWithObjectProperty getXAxis();
    public LineWithObjectProperty getYAxis();
    public Point getXAxisLocation();
    public Point getYAxisLocation();
	public int getAxesLength();
	public void setAxesLength(int anAxesLength);  
    public StringShape getXLabel();
	public StringShape getYLabel();    
}
