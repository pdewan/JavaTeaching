package lectures.style;

import java.util.StringTokenizer;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import lectures.state_properties.ABMISpreadsheet;
public class StyleErrorsCS1 {
	static int lengthInInches;
	static int mLengthInInches;
	public final static double CMS_IN_INCHES = 2.54;
	public final static double cmsInInches = 2.54;	
	public static double PI = 3.4;
	static java.util.Scanner scanner = new java.util.Scanner(System.in);

	String[] args;
	static String p;
	static String a;
	
	public static String add(String a, String b){
		return a + b;
	}
	
	
	public static String badAdd(String a, String b) {
		p = add (a, b);
		return p;
	}

	static int marker = 0;
	
	public static char nextChar(){
		marker++;
		return p.charAt(marker);
	}
	public static String getP(){
		return p;
	}
	public static void setP(String p) {
		System.out.println(p);		
	}
	

	public static int Sum(int anArg1, int anArg2) {
		return anArg1 + anArg2;
	}	
	public static void printArray() {
		int[][][] anArray = {{{1, 2}, {3, 4}}};
		for (int i = 0; i < anArray.length; i++) {
			for (int j = 0; j < anArray[i].length;j++) {
				for (int k = 0; k < anArray[i][j].length; k++)
					System.out.println(anArray[i][j][k]);
			}
		}
	}
	
	public void print (int[] anArray) {
		for (int k = 0; k < anArray.length; k++)
			System.out.println(anArray[k]);
	}
	
	public void print (int[][] anArray) {
		for (int k = 0; k < anArray.length; k++)
			print(anArray[k]);
	}
	public void modularPrintArray () {
		int[][][] anArray = {{{1, 2}, {3, 4}}};
		for (int i = 0; i < anArray.length; i++) {
			print(anArray[i]);			
		}
	}
	
	
	public static void main(String[] args) {
		if (!p.equals("Hello"))			
			setP("Hello");
		if (!(p == "Hello"))
			setP("Hello");

		int lengthInInches = 0;
		if (lengthInInches <= 0 ); 
		{
		    System.out.println ("Error!");		
		}
		double lengthInCMS = lengthInInches*2.54;
		lengthInCMS = lengthInInches*CMS_IN_INCHES;
		boolean roundingError = lengthInCMS/lengthInInches != CMS_IN_INCHES;
		if (roundingError == true) {
			System.out.println ("Java has rounding errors");
		}
		if (roundingError) {
			System.out.println ("Java has rounding errors");
		}
		if (roundingError = lengthInCMS/lengthInInches != CMS_IN_INCHES ) {
			System.out.println ("Java has rounding errors");
		}	
		if (lengthInCMS/lengthInInches != CMS_IN_INCHES) 
			roundingError = true;
			System.out.println ("Java has rounding errors");
		if (roundingError) System.out.println ("Java has rounding errors");
	}

}