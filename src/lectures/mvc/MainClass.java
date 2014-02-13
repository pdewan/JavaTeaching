package lectures.mvc;


public class MainClass {
	
	
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
		ObservableCounter model = new AnObservableCounter(); 
	    model.addObserver(new ACounterConsoleView());
	    CounterController controller = new ACounterController();
	    controller.setModel(model);
	    controller.processInput();
	}


}
