package lectures.ui;
import java.util.Scanner;
/*
 * A TALE OF TWO INTERFACES  
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
 * This class illustrates user-interfaces. 
 * 
 * They are important for two reasons. First, many interesting applications
 * are interactive. More important, user-interface of an application is a 
 * separate concern from the rest of the application.
 * 
 * (T/F) A programming interface of an object determines how another object interacts with it. 
 * 
 * (T/F)A user interface of an object determines how a human interacts with it
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
 * A TALE OF TWO INTERFACES  
 *
 * 
 * User interfaces have to be implemented by user-interface code. They are
 * not automatically provided by Java, though there are libraries to
 * make them easy to write.
 * 
 * (T/F) Java automatically provides a user-interface to interact with each object.
 * 
 */
/*
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
 * and the code in it is called the model or computation code. Such
 * code does not directly do any input or output. The UI code is 
 * responsible for input and/or output.
 * 
 * It processes input by converting user input
 * (such as entering text in a console or a GUI) and converts it into
 * a Java value used by computation code. 
 * 
 * It processes output by converting some value computed by the 
 * model code  into output that can be viewed by the user.
 * 
 *  Computation or model code is responsible for:
 *    (a) converting user input into Java values.
 *    (b) converting Java values into user output.
 *    (c) determining the relationship between output and input.
 *    
 * User-interface code is responsible for: 
 *    (a) converting user input into Java values used by computation code.
 *    (b) converting Java values computed by computation code into user output.
 *    (c) determining the relationship between output and input. 
 *  
 * (T/F) The user-interface code of an application depends on the computation code 
 * of the application.
 * 
 * (T/F) The computation code of an application depends on the user-interface code 
 * of the application.
 * 
 * (T/F) The separation of concerns principle implies that
 * user-interface and computation code of an application should be kept
 * in separate classes.
 * 
 * We know this main class is a UI class and it does nothing but 
 * read from the console and output to the console, 
 * letting the computation of
 * BMI be done by ABMISpreadsheetComputationClass.
 * 
 * Look at the code of this class to verify it 
 * does UI and not computation.
 * 
 * Run this main class to see what it does and terminate it by
 * pressing on the red button to kill the program.
 * 
 * To make our programming easier, this class does not provide access to the 
 * full functionality of ABMISpreadsheetComputationClass: It does not provide
 * access to the increment operations nor does it do error checking.
 * 
 * Run this class to see what it does and terminate it by pressing on the red button to kill
 * the program.
 *   
 * Go to AUIBMISpreadsheet and count the number of lines in that class.
 * 
 * Now count the number of lines of code in this class. Exclude comments if you can.
 * 
 * To show line numbers, Go to Windows -> Preferences->General ->Text Editors ->
 * Show line numbers.
 * 
 *  Based on the ManualConsoleBMISpreadSheetUI example, the UI code is:
 * 	   (a) orders of magnitude (6 or more times) smaller than the computation code.
 * 	   (b) orders of magnitude (6 or more times)  larger than the computation code.
 *     (c) about the same size as the computation code (none of the above).  
 * 
 */
/*
 * How can we reduce the problem of writing UI code? 
 * 
 * Eclipse will automatically extract a programming interface from a class.
 * 
 * Can we build a tool that similarly automatically extract a user-interface from
 * a class?
 * 
 * Go to AutoBMISpreadsheetGUI (press F3 or CTRL/COMMAND-click)
 * 
 */
}
