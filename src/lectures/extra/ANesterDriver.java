package lectures.extra;


public class ANesterDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ScalableRectangle nestedRectangle = new ANestableRectangle (0, 0, 30, 20);
//		ScalableNester nester = new AScalableNester(nestedRectangle);
//		ScalableNester doubleNester = new AScalableNester(nester);
//		ObjectEditor.edit(nester);
//		ObjectEditor.edit(doubleNester);

	}
	public static void doubleTheSize (ScalableRectangle theShape) {
		theShape.scale(200);
	}
	public static void doubleTheSize (ScalableNester theNester) {
		theNester.scale(200);
	}	

}
