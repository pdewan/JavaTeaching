package lectures.nester;

import bus.uigen.ObjectEditor;

public class ANesterDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScalableShape nestedRectangle = new ARectangle (0, 0, 30, 20);
		ScalableNester nester = new AScalableNester(nestedRectangle);
		ObjectEditor.edit(nester);

	}
	public static void doubleTheSize (ScalableShape theShape) {
		theShape.scale(200);
	}
	public static void doubleTheSize (ScalableNester theNester) {
		theNester.scale(200);
	}	

}
