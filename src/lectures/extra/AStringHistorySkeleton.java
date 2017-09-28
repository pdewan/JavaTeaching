package lectures.extra;


public class AStringHistorySkeleton implements StringHistorySkeleton {
	DelegatingStringHistory delegatingStringHistory;
	public AStringHistorySkeleton (DelegatingStringHistory theDelegator) {
		delegatingStringHistory = theDelegator;
	}
	public void addElement(String element) {
		if (!delegatingStringHistory.isFull())
			delegatingStringHistory.uncheckedAddElement(element);
		else
			handleError();
	}
	void handleError () {
		System.out.println("Adding item to a full history");
	};
}
