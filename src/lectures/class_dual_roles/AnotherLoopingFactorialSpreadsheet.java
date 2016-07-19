package lectures.class_dual_roles;

import lectures.java_basics_overview.Factorials;


public class AnotherLoopingFactorialSpreadsheet 
{
	
	int number;
//  factorual is no longer an instance variable
//	long factorial;
	// no static in method declarations as these methods access instance  variables
	public int getNumber() {
		return number;
	}
	// set number no longer computes the factorial
	public void setNumber(int newValue) {
		number = newValue ;
	}	
	// we compute the factorial only on demand
	public long getFactorial() {
		return Factorials.loopingFactorial(number);
	}
}
