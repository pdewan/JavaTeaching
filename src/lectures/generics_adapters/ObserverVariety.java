package lectures.generics_adapters;

import lectures.arrays.collections_implementation.AStringHistory;
import lectures.arrays.collections_implementation.StringHistory;
import lectures.interfaces.BMISpreadsheet;
import lectures.mvc.ACounterConsoleView;
import lectures.mvc.AnObservableCounter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;
import lectures.mvc.properties.AnObservableBMISpreadsheet;
import lectures.mvc.properties.ObservableBMISpreadsheet;
/*
 NON-COLLECTION GENERIC
 Here is an example from the MVC section of a generic type, GenericObserver
 that is not a collection. Study the interface GenericObserver carefully
 as well as the interface ElaboratingObservableCounter and the class 
 AnElaboratingObservableCounter and AnElaboratingCounterConsoleView
 
 
 
 */
public class ObserverVariety {

	public static void specializedObserverObservable() {
		ObservableCounter anObservableCounter = new AnObservableCounter();
		CounterObserver aCounterObserver = new ACounterConsoleView();
		anObservableCounter.addObserver(aCounterObserver);
		aCounterObserver.update(anObservableCounter);
		
	}
	public static void elaboratingObserverObservable() {
		ElaboratingObservableCounter anObservableCounter = new AnElaboratingObservableCounter();
		GenericObserver<ElaboratingObservableCounter> aCounterObserver = new AnElaboratingCounterConsoleView();
		anObservableCounter.addObserver(aCounterObserver);
		aCounterObserver.update(anObservableCounter);
		
		/*
		 Does the following pass compiler checks?
		 */
		
//		GenericObserver<BMISpreadsheet> aBMIObserver = null; // we have no class for this
//		anObservableCounter.addObserver(aBMIObserver);
//		aBMIObserver.update(anObservableCounter);

		
	}


}
