package lectures.mvc;

public class MixedUIMVCComposer {
	public static void main (String args[]) {
    ObservableCounter model = new AnObservableCounter(); 
    model.addObserver (new  ACounterJOptionView());
    CounterController controller = new  ACounterController();
    controller.setModel(model);
    controller.processInput();
}


}
