package lectures.interfaces.extra;

import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;

public class BMISpreadsheetPrinter {
	public static void print (BMISpreadsheet aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight());
		System.out.println ("Weight:" + aBMISpreadsheet.getWeight());
		System.out.println("BMI:" + aBMISpreadsheet.getBMI());		
	}
	
	public static void print (ABMISpreadsheet aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight());
		System.out.println ("Weight:" + aBMISpreadsheet.getWeight());
		System.out.println("BMI:" + aBMISpreadsheet.getBMI());		
	}
	
	public static void print(AnotherBMISpreadsheet aBMISpreadsheet) {
		System.out.println ("Height:" + aBMISpreadsheet.getHeight());
		System.out.println ("Weight:" + aBMISpreadsheet.getWeight());
		System.out.println("BMI:" + aBMISpreadsheet.getBMI());		
	}
	
	public static void main (String[] args) {
		print (new AnotherBMISpreadsheet());
		print (new ABMISpreadsheet());
	}

}
