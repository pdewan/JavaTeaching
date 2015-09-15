package praxis.composite.tree_dag_graph_objects_windows;

import lectures.composite.objects_shapes.ALineWithObjectProperty;
import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.composite.tree_dag_graph_objects_windows.DAGCartesianPlane;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.AStringShape;
import lectures.graphics.Point;
import lectures.graphics.StringShape;
import util.annotations.Visible;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
public class APraxisGraphCartesianPlane implements DAGCartesianPlane {
	int originX, originY;
	int axesLength;
	PraxisLineWithObjectProperty xAxis;
	LineWithObjectProperty yAxis;

	Point xAxisLocation, yAxisLocation;
	StringShape xLabel;
	StringShape yLabel;
	public APraxisGraphCartesianPlane(int theAxesLength, int theOriginX, int theOriginY) {
		axesLength = theAxesLength;
		originX = theOriginX;
		originY = theOriginY;
		xAxisLocation = toXAxisLocation();
		yAxisLocation = toYAxisLocation();
		xAxis = new APraxisLineWithObjectProperty(xAxisLocation, theAxesLength, 0);
		xAxis.setGraph(this);
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
	// comment this in
//	@Visible(false)
	public Point getXAxisLocation() {
		// comment this out
		return null;
		// uncomment this in
//		return xAxisLocation;
	}
	// comment this in
//	@Visible(false)
	public Point getYAxisLocation() {
		// comment this out
		return null;
		// uncommment this in
//		return yAxisLocation;
	}	
	public void setAxesLength(int anAxesLength) {
		axesLength = anAxesLength;
		xAxis.setWidth(axesLength);
		yAxis.setHeight(axesLength);
		xAxis.setLocation(toXAxisLocation());
		yAxis.setLocation(toYAxisLocation());
		xAxisLocation = xAxis.getLocation();
		yAxisLocation = yAxis.getLocation();
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
		DAGCartesianPlane plane = new APraxisGraphCartesianPlane(200, 125, 125);
		OEFrame editor = ObjectEditor.edit(plane);
		editor.showTreePanel();
		editor.setSize(1200, 600);
		// set break point on statement below
		System.out.println("Plane Displayed");
	}
}