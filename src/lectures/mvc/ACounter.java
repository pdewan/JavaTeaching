package lectures.mvc;

import bus.uigen.ObjectEditor;

public class ACounter implements Counter {
	int counter = 0;
	public void add (int amount) {
		counter += amount;
	}
	public int getValue() {
		return counter;
	}
	public static void main (String[] args) {
		ObjectEditor.edit(new ACounter());
	}
}
