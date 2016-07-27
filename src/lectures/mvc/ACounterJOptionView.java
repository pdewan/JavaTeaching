package lectures.mvc;
import javax.swing.JOptionPane;
public class ACounterJOptionView implements CounterObserver {
	// Another implementation of update, provides JOption output in reaction to counter change

	public void update(ObservableCounter counter) {
		 JOptionPane.showMessageDialog(
			null, "Counter: " + counter.getValue());
	}
}
