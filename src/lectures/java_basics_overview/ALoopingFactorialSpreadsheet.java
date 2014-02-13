package lectures.java_basics_overview;

import util.annotations.ComponentWidth;
import util.annotations.Visible;
import bus.uigen.ObjectEditor;
public class ALoopingFactorialSpreadsheet implements FactorialSpreadsheet {
	int number;
	long factorial;
//	@Visible(false)
	@ComponentWidth(50)
	public int getNumber() {
		return number;
	}
	public void setNumber(int newVal) {
		number = newVal ;
		factorial = Factorials.loopingFactorial(number);
	}	
	public long getFactorial() {
		return factorial;
	}
	
	public static void main (String[] args) {
		ObjectEditor.edit(new ALoopingFactorialSpreadsheet());
	}
}
