package lectures.mvc;
import javax.swing.JOptionPane;
public class ACounterJOptionView implements CounterObserver {
	// Another implementation of update, provides JOption output in reaction to counter change

	// The method takes the whole model as a value, it does indicate which part of the 
	// model changes, which is not an issue here as the counter has only one property, value
	// How would you change the notification method if the model had many
	// logical components? Something to think about for a future exercise
	public void update(Counter counter) {
		 JOptionPane.showMessageDialog(
			null, "Counter: " + counter.getValue());
	}
}
