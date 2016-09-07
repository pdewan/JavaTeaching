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
	public void setNumber(int newValue) {
		number = newValue ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public long getFactorial() {
		return factorial;
	}
}
