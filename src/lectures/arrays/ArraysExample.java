package lectures.arrays;

import lectures.extra.ALoan;
import lectures.extra.AnotherLoan;
import lectures.extra.Loan;
import lectures.interfaces.ABMISpreadsheet;
import lectures.interfaces.ALoopingFactorialSpreadsheet;
import lectures.interfaces.ARecursiveFactorialSpreadsheet;
import lectures.interfaces.AnotherBMISpreadsheet;
import lectures.interfaces.BMISpreadsheet;
import lectures.interfaces.FactorialSpreadsheet;

public class ArraysExample {
	// initialized arrays
	int[] assignmentScores = {100, 98, 99, 100, 90, 80};
	double[] gpas = {3.8, 3.1, 3.7, 3.1, 3.6, 3.9};
	String[] initials = {"JFK", "FDR", "JC", "BC", "RR", "GB"};
	FactorialSpreadsheet[] factorialSpreadsheets = {
			new ALoopingFactorialSpreadsheet(), 
			new ARecursiveFactorialSpreadsheet()};
	int[] unInitializedAssignmentScores;
	int[] assignmentScoresWithUninitializedElements = new int[3];
	String[] initialsWithUninitializedElements = new String[3];
	
	public void assignNewArrayWithDifferentSize() {
		assignmentScores = new int[] {60, 40, 50};		
	}
	public void operateOnArrays() {
		assignmentScores = new int[] {60, 40, 50};	
		System.out.println (
				initials.length + " " +
				initials[0] + " " + " " +
				initials[initials.length - 1]);
		initials[0] = "HT";				
	}
	public void causeArrayIndexOutOfBoundsException() {
		initials[initials.length] = "HT";		
	}	
	public void initializeAfterDeclaration() {
		int[] assignmentScores;
		unInitializedAssignmentScores = new int[] {60, 40, 50};
	}
	
	public void accessUninitializedArray () {
		System.out.println(unInitializedAssignmentScores.length);		
	}
	public void accessUninitializedPrimitiveArrayElements () {
		System.out.println(assignmentScoresWithUninitializedElements.length);
		System.out.println(assignmentScoresWithUninitializedElements[0]);
		System.out.println(assignmentScoresWithUninitializedElements[0]);
	}
	public void accessUninitializedObjectArrayElements () {
		System.out.println(initialsWithUninitializedElements[0]);
		System.out.println(initialsWithUninitializedElements[0].length());
	}
	public static void main (String[] anArgs) {
		
	}
	

}
