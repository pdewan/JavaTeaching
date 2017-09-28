package lectures.mvc.interactor;

import lectures.mvc.ACounter;

public class InteractorBasedConsoleUI {
	public static void main(String args[]) {
		(new AConsoleUIInteractor()).edit(new ACounter());
	}
}
