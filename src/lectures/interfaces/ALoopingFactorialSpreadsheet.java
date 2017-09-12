package lectures.interfaces;

import lectures.class_dual_roles.statics.Factorials;
import lectures.interfaces.FactorialSpreadsheet;


public class ALoopingFactorialSpreadsheet 
	implements FactorialSpreadsheet // ignore the implements clause on first reading
{	
	int number;
	long factorial;
	public int getNumber() {
		return number;
	}
//	public int getN() {
//		return number;
//	}
	public void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	// method header, part of method declaration before the first curly brace
	public long getFactorial() 
	// method body, part of method declaration after the method header
	{ 
		return factorial;
	}	
}
