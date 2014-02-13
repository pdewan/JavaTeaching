package lectures.oegraphics;

import lectures.recursion.Factorial;
import bus.uigen.ObjectEditor;

public class AFactorialBean {
	int number;
	int factorial;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newVal) {
		number = newVal ;
	}
	public int getFactorial() {
		return Factorial.factorial(number);
	}
	
	public static void main (String[] args) {
		ObjectEditor.edit(new AFactorialBean());
	}

}
