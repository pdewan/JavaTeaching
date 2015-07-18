package lectures.mvc;

public class MultipleUIMVCComposerWithRocketLauncher {
	public static void main(String args[]) {
		ObservableCounter model = new AnObservableCounter();
		model.add(5);
		model.addObserver(new ACounterJOptionView());
		model.addObserver(new ACounterConsoleView());
		model.addObserver(new ARocketLaunchingCounterObserver());
		CounterController controller = new ACounterController();
		controller.setModel(model);
		controller.processInput();
	}
}
