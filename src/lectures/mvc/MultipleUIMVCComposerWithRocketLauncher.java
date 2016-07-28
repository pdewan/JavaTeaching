package lectures.mvc;
// COMPOSER
// When we decompose code into multiple classes, we need some composition code that composes 
// of these classes together.
public class MultipleUIMVCComposerWithRocketLauncher {
	static final int COUNT_DOWN_START = 5;
	public static void main(String args[]) {
		// Create a counter model
		ObservableCounter model = new AnObservableCounter();
		model.add(COUNT_DOWN_START);
		// Create a joption view and register it with model
		model.addObserver(new ACounterJOptionView());
		// Create a console view and register it with model
		model.addObserver(new ACounterConsoleView());
		// Create a rocket launcher observer and register it with model
		model.addObserver(new ARocketLaunchingCounterObserver());
		// Create a controller
		CounterController controller = new ACounterController();
		// Inform the controller about the model
		controller.setModel(model);
		// Ask the controller to run its input loop, this better be the last statement
		controller.processInput();
		// Use F6 and F5 to step into processInput and see how the chain of events
		// triggered by a user input
	}
	// How will you change this code to create the three original user-interfaces in the
	// mvc.monolithic package?
}
