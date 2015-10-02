package praxis.mvc.properties;

import java.util.Scanner;

import praxis.composite.objects_shapes.PraxisCartesianPlane;

public class APraxisCartesianPlaneController implements PraxisConsoleController{
	static Scanner scanner = new Scanner(System.in);
	PraxisCartesianPlane model;
	public APraxisCartesianPlaneController(PraxisCartesianPlane aModel) {
		model = aModel;		
	}
	public void processInput () {
		while (true) {
			System.out.println ("Please enter new positive axes length and a negative number to terminate:");
			String nextString = scanner.nextLine();
			int nextInt = Integer.parseInt(nextString);
			if (nextInt < 0) 
				break;
			model.setAxesLength(nextInt);
			
		}
	}
}
