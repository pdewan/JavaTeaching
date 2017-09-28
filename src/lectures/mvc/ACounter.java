package lectures.mvc;

import bus.uigen.ObjectEditor;
// COMPUTATION  CODE IN A SEPARATE CLASS
// This code will later be subclassed to become a real, full model
// no input or output, just methods to do computations that
// provide read and write access to the computation
public class ACounter implements Counter {
	int counter = 0;
	// write method
	public void add (int amount) {
		counter += amount;
	}
	// read method, called by view to display the oject
	public int getValue() {
		return counter;
	}
	
}
