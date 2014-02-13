package lectures.mvc.properties;

import lectures.composite.objects_shapes.ALoan;
import lectures.composite.objects_shapes.ALoanPair;
import lectures.composite.objects_shapes.APlottedShuttle;
import lectures.composite.objects_shapes.CartesianPlane;
import lectures.composite.objects_shapes.Loan;
import lectures.composite.objects_shapes.LoanPair;
import lectures.composite.objects_shapes.PlottedShuttle;
import lectures.graphics.ACartesianPoint;
import lectures.graphics.Line;
import lectures.graphics.Point;
import bus.uigen.ObjectEditor;


public class TypesDemoer  {
	static ObservableObjectHolder objectHolder;
	static ObservableObjectHolder kindHolder;
	static int amount;
	static Loan loan;
	static Point point;
	static Line line;
	static CartesianPlane cartesianPlane;
	static LoanPair loanPair;
	static PlottedShuttle shuttleLocation;
	public static void init () {
		loanPair = new ALoanPair(new ALoan(25000), new ALoan(225000));
		loan = loanPair.getCarLoan();
		amount = loan.getPrincipal();
		shuttleLocation = new APlottedShuttle(50, 100);
		cartesianPlane = shuttleLocation.getCartesianPlane();
		line = cartesianPlane.getXAxis();
		point = new ACartesianPoint(line.getX(), line.getY());
		objectHolder = new AnObservableObjectHolder();
		kindHolder = new AnObservableObjectHolder();
		toInteger();		
	}
	
	public static void toNull() {
		kindHolder.setObject("Null");
		objectHolder.setObject(null);		
	}
		
	public static void toInteger() {
		kindHolder.setObject("Primitive");
		objectHolder.setObject(amount);
		
	}	
	public static void toPoint() {
		kindHolder.setObject("Object, Atomic Shape");
		objectHolder.setObject(point);
		
	}	
	public static void toLine() {
		kindHolder.setObject("Composite Object, Atomic Shape");
		objectHolder.setObject(line);		
	}
	public static void toCartesianPlane() {
		kindHolder.setObject("Composite Object, Composite Shape");
		objectHolder.setObject(cartesianPlane);		
	}
	
	
	public static void toPlottedShuttle() {
		kindHolder.setObject("Composite Object, Composite Shape");
		objectHolder.setObject(shuttleLocation);		
	}
	
	public static void toLoan() {
		kindHolder.setObject("Object");
		objectHolder.setObject(loan);
	}	
	public static void toLoanPair() {
		kindHolder.setObject("Composite Object");
		objectHolder.setObject(loanPair);
	}
		
	public static void main (String[] args) {
		init();
		ObjectEditor.edit("Hellow");
//		OEFrame oeFrame1 = ObjectEditor.edit(objectHolder);		
//		OEFrame oeFrame2 = ObjectEditor.edit(kindHolder);
//		oeFrame1.showTreePanel();
//		oeFrame1.showDrawPanel();
//		oeFrame1.setSize(600, 800);
//		oeFrame2.setSize (300, 200);


	}	

}
