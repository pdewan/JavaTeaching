package praxis.mvc.properties;

import java.util.Scanner;

import lectures.composite.objects_shapes.CartesianPlane;
import util.annotations.Tags;
@Tags({"Controller"})
public class APraxisCartesianPlaneInputter implements PraxisConsoleController{
	static Scanner scanner = new Scanner(System.in);
	CartesianPlane model;
	public APraxisCartesianPlaneInputter(CartesianPlane aModel) {
		model = aModel;		
	}
	public void processInput () {
		while (true) {
			System.out.println ("Please enter new positive axes length and a negative number to terminate:");
			String nextString = scanner.nextLine();
			// put break point 
			int nextInt = Integer.parseInt(nextString);
			if (nextInt < 0) {
				break;
			}
			model.setAxesLength(nextInt);
			
		}
	}
}
