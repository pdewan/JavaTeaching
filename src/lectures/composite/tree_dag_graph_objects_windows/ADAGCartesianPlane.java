package lectures.composite.tree_dag_graph_objects_windows;
/**
 * The widget examples show that data structures that are displayed in a hierarchical
 * fashion should be trees.
 * 
 * Here we will create a DAG and try and display it both in the tree view 
 * and the graphics view.
 * 
 * Now we have two additional properties XAxisLocation and YAxisLocation in
 * this class.
 * 
 * These are children of XAxis and YAxis, which are also children of 
 * this Cartesian Plane.
 * 
 * So they are both grandchildren and children of this Cartesian Plane.
 * 
 * 
 */

import lectures.composite.objects_shapes.ALineWithObjectProperty;
import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.AStringShape;
import lectures.graphics.Point;
import lectures.graphics.StringShape;
import util.annotations.Visible;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
public class ADAGCartesianPlane implements DAGCartesianPlane {
	int originX, originY;
	int axesLength;
	LineWithObjectProperty xAxis, yAxis; // we are using different lines for axes
	Point xAxisLocation, yAxisLocation; // we have two additional variables (and properties)
	StringShape xLabel;
	StringShape yLabel;
	public ADAGCartesianPlane(int theAxesLength, int theOriginX, int theOriginY) {
		axesLength = theAxesLength;
		originX = theOriginX;
		originY = theOriginY;
		xAxisLocation = toXAxisLocation(); //making grandchild a child
		yAxisLocation = toYAxisLocation();  //making grandchild a child
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
//	@Visible(false)
	public Point getXAxisLocation() { // additional property
		return xAxisLocation;
	}
//	@Visible(false)
	public Point getYAxisLocation() { // additional property
		return yAxisLocation;
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
		DAGCartesianPlane aCartesianPlane = new ADAGCartesianPlane(200, 125, 125);
		OEFrame anOEFrame = ObjectEditor.edit(aCartesianPlane);
		anOEFrame.showTreePanel();
		/*
		 * This print statement verifies that we have a DAG, two different paths
		 * from the root lead to the same node
		 * 
		 */
		System.out.println(aCartesianPlane.getXAxis().getLocation() + " " + aCartesianPlane.getXAxisLocation());
	}
	/*
	 * Look at the tree view and the graphics view. 
	 * 
	 * Do each of the views make sense?
	 * 
	 * Uncomment the visible annotations above. 
	 * 
	 * Do the views make more sense now?
	 * 
	 * Many of you will want to create data structures that are Graphs or DAGs for
	 * convenience point of view. 
	 * 
	 * The Visible annotation tells Objecteditor to ignore
	 * certain edges when displaying the object.
	
	 * For the curious, execute the Common->Display Widget Tree command to see the
	 * widget tree created by ObjectEditor to display this object.
	 * 
	 * (T/F) The ObjectEditor tree view can display an arbitrary DAG.
	 * 
	 * (T/F) Annotations can be used to ask ObjectEditor to ignore certain
	 * nodes when displaying a structured object.
	 */
	
}