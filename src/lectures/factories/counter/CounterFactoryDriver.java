package lectures.factories.counter;

import lectures.mvc.Counter;
import bus.uigen.ObjectEditor;

public class CounterFactoryDriver {
	
	
//	public static void main (String args[]) {
//    	(new AConsoleUI()).edit (new ACounter());
//	}
	
//	public static void main (String args[]) {
//	    ObservableCounter model = new AnObservableCounter(); 
//	    model.addObserver (new  ACounterConsoleView());
//	    CounterController controller = new ACounterController();
//	    controller.setModel(model);
//	    controller.processInput();
//	}
	
//	public static void main (String args[]) {
//		ObservableCounter model = new AnObservableCounter(); 
//	    model.add(10);
//	    model.addObserver(new ACounterConsoleView());
//	    model.addObserver(new ARocketLaunchingCounterObserver());
//	    CounterController controller = new ACounterController();
//	    controller.setModel(model);
//	    controller.processInput();
//	}
	public static void main (String args[]) {
		CounterFactory counterFactory =  CounterFactorySelector.getCounterFactory();
		Counter model = counterFactory.createCounter(); 
		ObjectEditor.edit(model);
	}
}
