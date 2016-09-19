package lectures.composite.objects_shapes_extra;

import lectures.composite.objects_shapes.ALineWithObjectProperty;
import lectures.composite.objects_shapes.APlottedShuttle;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.composite.objects_shapes.LineWithObjectProperty;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.Line;
import lectures.graphics.Point;
import lectures.mvc.properties.AnObservableClassifiedObjectHolder;
import lectures.mvc.properties.ObjectDemoer;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;


public class AnObjectDemoer implements ObjectDemoer {
	int amount;
	Loan loan;
	Point point;
	Line line;
	LineWithObjectProperty compositeLine;
	CartesianPlane cartesianPlane;
	LoanPair loanPair;
	PlottedShuttle shuttleLocation;
	ClassifiedObjectHolder objectHolder;	
	public AnObjectDemoer(ClassifiedObjectHolder theObjectHolder) {
		objectHolder = theObjectHolder;
		loanPair = new ALoanPair(new ALoan(25000), new ALoan(225000));
		loan = loanPair.getCarLoan();
		amount = loan.getPrincipal();
		shuttleLocation = new APlottedShuttle(50, 100);
		cartesianPlane = shuttleLocation.getCartesianPlane();
		line = cartesianPlane.getXAxis();
		compositeLine = new ALineWithObjectProperty(new ACartesianPoint(line.getX(), line.getY()), line.getWidth(), line.getHeight());
		point = new ACartesianPoint(line.getX(), line.getY());
		toInteger();
		
	}
	public Object getObjectHolder() {
		return objectHolder;
	}	
	public void toNull() {
		objectHolder.setKind("Null");
		objectHolder.setObject(null);		
	}
		
	public void toInteger() {
		objectHolder.setKind("Primitive");
		objectHolder.setObject(amount);
		
	}	
	public void toPoint() {
		objectHolder.setKind("Object, Atomic Shape");
		objectHolder.setObject(point);
		
	}	
	public void toLine() {
		objectHolder.setKind("Object, Atomic Shape");
		objectHolder.setObject(line);		
	}
	public void toCompositeLine() {
		objectHolder.setKind("Composite Object, Atomic Shape");
		objectHolder.setObject(compositeLine);		
	}
	public void toCartesianPlane() {
		objectHolder.setKind("Composite Object, Composite Shape");
		objectHolder.setObject(cartesianPlane);		
	}
//	public void toFancyCartesianPlane() {
//		objectHolder.setKind("Composite Object, Composite Shape");
//		objectHolder.setObject(fancyCartesianPlane);		
//	}
	
	public void toPlottedShuttle() {
		objectHolder.setKind("Composite Object, Composite Shape");
		objectHolder.setObject(shuttleLocation);		
	}
	
	public void toLoan() {
		objectHolder.setKind("Object");
		objectHolder.setObject(loan);
	}	
	public void toLoanPair() {
		objectHolder.setKind("Composite Object");
		objectHolder.setObject(loanPair);
	}
		
	public static void main (String[] args) {
//		ObjectEditor.edit(new ALoan(25000));
//		ObjectEditor.edit(new ATypesDemoer(new AnObjectHolder()));
		OEFrame oeFrame = ObjectEditor.edit(new AnObjectDemoer(new AnObservableClassifiedObjectHolder()));
//		oeFrame.hideMainPanel();
		oeFrame.showTreePanel();
		oeFrame.showDrawPanel();
		oeFrame.setSize(600, 800);


	}	

}
