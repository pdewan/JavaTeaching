package lectures.class_dual_roles;

import lectures.interfaces.FactorialSpreadsheet;


public class ALoopingFactorialSpreadsheet 
{
	// no static n variable declaration, this means these variables are  
	// created in memory dynamiclaly when we do new ALoopinFactorialSpreadsheet
	// to "instantiate" the class
	// with the cursor in the name of a variable, method, class, pakage or any other named entity, 
	// ALT-SHIFT-R changes its name 
	int number;
	long factorial;
	// no static in method declarations as these methods access instance  variables
	public int getNumber() {
		return number;
	}
	public void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public long getFactorial() {
		return factorial;
	}
}
