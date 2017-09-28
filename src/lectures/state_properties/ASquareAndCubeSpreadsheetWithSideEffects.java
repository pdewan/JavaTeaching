package lectures.state_properties;

import bus.uigen.ObjectEditor;

public class ASquareAndCubeSpreadsheetWithSideEffects {
	int number;
	  int square;
	  public void setNumber(int aNumber) {
	    number = aNumber;
	  }
	  public int getNumber() {
	    return number;
	  }
	  public int getSquare() {
	    square = number*number;
	    return square;
	  }
	  public int getCube() {
	    int retVal = square*number;
	    System.out.println("The Cube is: " + retVal);
	    return retVal;
	  }
	  public static void main (String[] args) {
		  ObjectEditor.edit(new ASquareAndCubeSpreadsheetWithSideEffects());
	  }

}
