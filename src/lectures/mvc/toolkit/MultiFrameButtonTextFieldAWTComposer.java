package lectures.mvc.toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import lectures.mvc.AnObservableCounter;
import lectures.mvc.CounterController;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;

;

public class MultiFrameButtonTextFieldAWTComposer {
	public static void main (String args[]) {
		ObservableCounter model = new AnObservableCounter(); 
		CounterController controller = createControllerAndControllerFrame();
		CounterObserver view = createViewAndViewFrame();
		model.addObserver(view);
		controller.setModel(model);
	}	
	public static CounterController createControllerAndControllerFrame() {
		JFrame frame = new JFrame("Counter Controller");
		JButton button = new JButton("Increment");
		frame.add(button);
		frame.setSize(200, 100);
		frame.setVisible(true);
		return new ACounterJButtonController(button);		
	}	
	public static CounterObserver createViewAndViewFrame() {
		JFrame frame = new JFrame("Counter View");
		JTextField textField = new JTextField();
		frame.add(textField);
		frame.setSize(200, 100);
		frame.setVisible(true);
		return new ACounterJTextFieldView(textField);		
	}
}
