package lectures.class_dual_roles;

import lectures.java_basics_overview.Factorials;


public class ALoopingFactorialSpreadsheet 
	implements FactorialSpreadsheet 
{
	int number;
	long factorial;
//	@Visible(false)
//	@ComponentWidth(50)
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
	
//	public static void main (String[] args) {
//		ObjectEditor.edit(new ALoopingFactorialSpreadsheet());
//	}
}
