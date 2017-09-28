package lectures.inheritance_vs_delegation.mvc;

import javax.swing.JOptionPane;

public class ACounterWithConsoleAndJOptionView extends ACounterWithConsoleView {
	void displayMessage(int counterValue) {
		JOptionPane.showMessageDialog(null, "Counter: " + counterValue);
	}
	public void add (int amount) {
		super.add(amount);
		displayMessage(getValue());
	}
}
