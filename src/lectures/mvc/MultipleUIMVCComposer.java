package lectures.mvc;

public class MultipleUIMVCComposer {
	public static void main (String args[]) {
    ObservableCounter model = new AnObservableCounter(); 
    model.addObserver(new ACounterJOptionView());
    model.addObserver (new ACounterConsoleView());
    CounterController controller = new ACounterController();
    controller.setModel(model);
    controller.processInput();
}


}
