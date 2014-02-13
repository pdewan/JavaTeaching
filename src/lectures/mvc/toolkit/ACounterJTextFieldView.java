package lectures.mvc.toolkit;
import javax.swing.JTextField;

import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;
public class ACounterJTextFieldView implements CounterObserver {
	JTextField textField;
	public ACounterJTextFieldView(JTextField theTextField) {
		textField = theTextField;
	}
	public void update(ObservableCounter counter) {
		textField.setText("" + counter.getValue());
	}
}
