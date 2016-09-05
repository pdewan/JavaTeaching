package lectures.constructors_pointers;


public class AssigningVariables {
	// understand and then execute the program
	public static void main (String[] args) {
		double aWeight1 = 75;
		ABMISpreadsheet aBMISpreadsheet1 = new ABMISpreadsheet();
		double aWeight2 = aWeight1; // what does this really mean?
		System.out.println (aWeight1 == aWeight2); // it must imply this returns true
		ABMISpreadsheet aBMISpreadsheet2 = aBMISpreadsheet1; // what does this really mean?
		System.out.println (aBMISpreadsheet1 == aBMISpreadsheet2); // it must imply this returns true
		aWeight1 += 2; 
		System.out.println (aWeight1 == aWeight2); // are they still equal?
		aBMISpreadsheet1.setWeight(aWeight1);
		System.out.println (aBMISpreadsheet1 == aBMISpreadsheet2); // are they still equal?
		System.out.println (aWeight1);
		System.out.println(aWeight2);
		System.out.println(aBMISpreadsheet1); // what do you expect to be printed1
		System.out.println(aBMISpreadsheet1); // what do you expect to be printed
		// Can you explain the difference in behavior for primitive variables and object variables
		// 
	}

}
