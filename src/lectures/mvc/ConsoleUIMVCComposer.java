package lectures.mvc;

public class ConsoleUIMVCComposer {
	public static void main (String args[]) {
	       ObservableCounter model = new AnObservableCounter(); 
	       model.addObserver(new ACounterConsoleView());
	       CounterController controller = new ACounterController();
	       controller.setModel(model);
	       controller.processInput();
	}
}
