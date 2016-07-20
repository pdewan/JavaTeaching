package lectures.interfaces;

public class WhatIsAType {
	// purposely using bad names
	static ALoopingFactorialSpreadsheet a = new ALoopingFactorialSpreadsheet();
	static ARecursiveFactorialSpreadsheet b = new ARecursiveFactorialSpreadsheet();
	static ABMISpreadsheet c = new ABMISpreadsheet();
	public static void main (String[] args) {
		a.setNumber(5);
		System.out.println (a.getNumber() + ":" + a.getFactorial());
		
		
	}

}
