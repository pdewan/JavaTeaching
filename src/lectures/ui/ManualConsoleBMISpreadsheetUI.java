package lectures.ui;
import java.util.Scanner;
/**
 * A TALE OF TWO INTERFACES
 * 
 *   
 * (T/F) A programming interface of an object allows another object to
 * interact with it. 
 * 
 * (T/F) A user interface of an object allows a human user to
 * interact with it.
 * 
 * (T/F) Java automatically provides a user-interface to interact with each object.
 * 
 *  
 * The interfaces in computer science are special cases of the notion of a general
 * interface in English. 
 * 
 * The Java interfaces we just studied are programming interfaces.
 .
 * They allow an object to interact with another object - they are interfaces
 * between (programmed) objects.
 * 
 * Another kind of interfaces - user interfaces - allow users to interact with 
 * (programmed)objects.
 * 
 * They are interfaces between (programmed) objects and users. 
 * 
 * User interfaces have to be implemented by user-interface code. They are
 * not automatically provided by Java, though there are libraries to
 * make them easy to write.
 * 
 * 
 * EXTENT OF USER-INTERFACE CODE
 * 
 * All instances of a class, of course, share the same user-interface code just
 * as they share the same (programming) interface declaration.
 * 
 * Creating an interface definition is relatively trivial (once we understand the concept).
 * Creating user-interface code is a more laborious job. 
 * 
 * The size of the user-interface code we write to interface with a class of objects
 * is usually proportional to the size of the class. 
 * 
 * The class for which the UI is created is called the computation or model class 
 * and the code in it is called the model or computation code.
 * 
 * This class provides code for implementing the user-interface of  AUIBMISpreadsheet,
 * which is an extension of ABMISpreadsheet that has two additional methods for
 * incrementing the height and weight to do do what-if computations.
 * 
 * Run this class to see what it does and terminate it by pressing on the red button to kill
 * the program.
 * 
 * Based on the ManualConsoleBMISpreadSheetUI example, the UI code is:
 * 	   (a) an order of magnitude (about ten times) smaller than the computation code.
 * 	   (b) an order of magnitude larger than the computation code.
 *     (c) about the same size as the computation code.
 * 
 * Go to AUIBMISpreadsheet and count the number of lines in that class.
 * 
 * Now count the number of lines of code in this class. Exclude comments if you can.
 * 
 * To show line numbers, Go to Windows -> Preferences->General ->Text Editors ->
 * Show line numbers .
 * 
 */
public class ManualConsoleBMISpreadsheetUI {
	static Scanner scanner = new Scanner(System.in);
	static double readHeight () {
		System.out.println ("Please enter height:");
		return (Double.parseDouble(scanner.nextLine()));// no error checking for simplicity
	}
	static double readWeight () {
		System.out.println ("Please enter weight:");
		return (Double.parseDouble(scanner.nextLine())); // no error checking for simplicity
	}
	static void printBMI(double aBMI) {
		System.out.println ("The BMI is:" + aBMI);

	}
	public static void main(String[] args) {
		UIBMISpreadsheet aBMISpreadsheet = new AUIBMISpreadsheet();
		while (true) { // we will loop forever to make our programming easier
			aBMISpreadsheet.setHeight(readHeight());
			aBMISpreadsheet.setWeight(readWeight());
			printBMI(aBMISpreadsheet.getBMI());			
		}		
	}
/*

 * How can we reduce the problem of writing UI code? 
 * 
 * Eclipse will automatically extract a programming interface from a class.
 * 
 * Can we build a tool that similarly automatically extract a user-interface from
 * a class?
 * 
 * Go to AutoBMISpreadsheetGUI (press F3 or CTRL-click)
 * 
 */
}
