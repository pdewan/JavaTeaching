package lectures.mvc;
import javax.swing.JOptionPane;
public class ACounterJOptionView implements CounterObserver {
	public void update(ObservableCounter counter) {
		 JOptionPane.showMessageDialog(
			null, "Counter: " + counter.getValue());
	}
}
