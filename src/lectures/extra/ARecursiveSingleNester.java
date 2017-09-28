package lectures.extra;

import bus.uigen.ObjectEditor;


public class ARecursiveSingleNester {
	public static void main (String[] args) {
		Scalable rectangle1 = new ACompositeScalableRectangle (0, 0, 20, 20);
		Scalable rectangle2 = new ACompositeScalableRectangle (0, 0, 40, 40);
		Scalable singleNester = new ACompositeScalableNester (rectangle2, rectangle1);		
		Scalable rectangle3 = new ACompositeScalableRectangle (0, 0, 60, 60);
		Scalable doubleNester = new ACompositeScalableNester (rectangle3, singleNester);
		ObjectEditor.edit(singleNester);
		ObjectEditor.edit(doubleNester);
	}

}
