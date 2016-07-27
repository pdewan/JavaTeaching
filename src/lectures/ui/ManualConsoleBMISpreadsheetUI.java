package lectures.ui;

import java.util.Scanner;

import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
// USER INTERFACE VS (ProGRAMMING) INTERFACE
// The interfaces we saw earlier are programming interfaces.
// They allow an object to interact with another object - they are interfaces
// between programmed objects.
// Another kind of interfaces - user interfaces - allow users to interact with programmed objects
// They are interfaces between programmed objects and users
// User interfaces have to be implemented by user-interface code.
// This is an example of code implementing a user-interface of a programmed object we understand

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
		BMISpreadsheet aBMISpreadsheet = new ABMISpreadsheet();
		while (true) { // we will loop forever to make our programming easier
			aBMISpreadsheet.setHeight(readHeight());
			aBMISpreadsheet.setWeight(readWeight());
			printBMI(aBMISpreadsheet.getBMI());			
		}
		
	}
// USER-INTERFACE CODE
// To provude a programming interface, one must declare an interface
// one line of code per method in the class. How much effort to provide a user-interface
	
// How many lines of user-interface code here?
// How many lines of code in the very simple class, ABMISpreadsheet?
// Usually the code required to interact with an object is as much as
// the code to implement the object.
// This means our effort doubles.
// How can we solve this problem, at least in this class.
// Eclipse will automatically extract a programming interface from a clsas.
// Can we similarly automatically extract a user-interace from a class?
}
