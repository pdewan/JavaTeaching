package lectures.interfaces;

import lectures.interfaces.FactorialSpreadsheet;
import lectures.java_basics_overview.Factorials;


public class ALoopingFactorialSpreadsheet 
	implements FactorialSpreadsheet // ignore the implements clause on first reading
{
	// no static n variable declaration, this means these variables are  
	// created in memory dynamiclaly when we do new ALoopinFactorialSpreadsheet
	// to "instantiate" the class
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
