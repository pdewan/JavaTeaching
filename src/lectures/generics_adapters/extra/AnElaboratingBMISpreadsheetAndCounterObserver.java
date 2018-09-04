package lectures.generics_adapters.extra;

import java.util.Arrays;

import lectures.generics_adapters.GenericObserver;
import lectures.interfaces.BMISpreadsheet;
import lectures.mvc.Counter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;
/*
 * IMPLEMENTING TWO DIFFERENT ELABORATIONS OF SAME GENERIC INTERFACE
 * Should we be able to do this? 
 * 
 * Look at the main method. Run it. Look at the console output.
 * 
 * Now swap the implemented interface from CounterObserver to GenericObserver<Counter>
 * Is that allowed? What output do you expect from main if it was allowed?
 
 */
public class AnElaboratingBMISpreadsheetAndCounterObserver 
	implements
		GenericObserver<BMISpreadsheet>,
//		GenericObserver<Counter>
		CounterObserver // comment this out

{

	

	@Override
	public void update(Counter anObservable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BMISpreadsheet anObservable) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[] args) {
		// Get the interfaces implemented by this class
		Class[] anInterfaces = AnElaboratingBMISpreadsheetAndCounterObserver.class.getInterfaces();
		System.out.println(Arrays.toString(anInterfaces));
	}

}
