package lectures.composite.tree_dag_graph_objects_windows;

import lectures.composite.objects_shapes.ALineWithObjectProperty;
import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.AStringShape;
import lectures.graphics.Point;
import lectures.graphics.StringShape;
import util.annotations.Visible;
import bus.uigen.ObjectEditor;
// how should this share code with ACartesianPlane?
public class ADAGCartesianPlane implements DAGCartesianPlane {
	int originX, originY;
	int axesLength;
	LineWithObjectProperty xAxis, yAxis;
	Point xAxisLocation, yAxisLocation;
	StringShape xLabel;
	StringShape yLabel;
	public ADAGCartesianPlane(int theAxesLength, int theOriginX, int theOriginY) {
		axesLength = theAxesLength;
		originX = theOriginX;
		originY = theOriginY;
		xAxisLocation = toXAxisLocation();
		yAxisLocation = toYAxisLocation();
		xAxis = new ALineWithObjectProperty(xAxisLocation, theAxesLength, 0);
		yAxis = new ALineWithObjectProperty(yAxisLocation, 0, theAxesLength);
		xLabel = new AStringShape("X", toXLabelX(), toXLabelY());
		yLabel = new AStringShape("Y", toYLabelX(), toYLabelY());
	}

	public LineWithObjectProperty getXAxis() {
		return xAxis;
	}
	public LineWithObjectProperty getYAxis() {
		return yAxis;
	}
	@Visible(false)
	public Point getXAxisLocation() {
		return xAxisLocation;
	}
	@Visible(false)
	public Point getYAxisLocation() {
		return yAxisLocation;
	}	
	public void setAxesLength(int anAxesLength) {
		axesLength = anAxesLength;
		xAxis.setWidth(axesLength);
		yAxis.setHeight(axesLength);
		xAxis.setLocation(toXAxisLocation());
		yAxis.setLocation(toYAxisLocation());
		xLabel.setX(toXLabelX());
		xLabel.setY(toXLabelY());
		yLabel.setX(toYLabelX());
		yLabel.setY(toYLabelY());
	}
	
	Point toXAxisLocation() {
		 return new ACartesianPoint(toXAxisX(), toXAxisY());		
	}
	
	Point toYAxisLocation() {
		 return new ACartesianPoint(toYAxisX(), toYAxisY());		
	}
	
	public int getAxesLength() {
		return axesLength;
	}
	
	public StringShape getXLabel() {
    	return xLabel;
    }
    public StringShape getYLabel() {
    	return yLabel;
    }

	int toXAxisX() {
		return originX - axesLength / 2;
	}

	int toXAxisY() {
		return originY;
	}

	int toYAxisX() {
		return originX;
	}

	int toYAxisY() {
		return originY - axesLength / 2;
	}

	int toXLabelX() {
		return originX + axesLength / 2;
	}

	int toXLabelY() {
		return originY;
	}

	int toYLabelX() {
		return originX;
	}

	int toYLabelY() {
		return originY - axesLength / 2;
	}

	public static void main(String[] args) {
		DAGCartesianPlane plane = new ADAGCartesianPlane(200, 125, 125);
		ObjectEditor.edit(plane);
	}
}