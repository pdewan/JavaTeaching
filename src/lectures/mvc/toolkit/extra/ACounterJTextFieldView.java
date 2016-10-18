package lectures.mvc.toolkit.extra;
import javax.swing.JTextField;

import lectures.mvc.Counter;
import lectures.mvc.CounterObserver;
import lectures.mvc.ObservableCounter;
public class ACounterJTextFieldView implements CounterObserver {
	JTextField textField;
	public ACounterJTextFieldView(JTextField theTextField) {
		textField = theTextField;
	}
	public void update(Counter counter) {
		textField.setText("" + counter.getValue());
	}
}
