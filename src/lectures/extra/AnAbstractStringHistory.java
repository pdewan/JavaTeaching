package lectures.extra;


public abstract class AnAbstractStringHistory {
	abstract boolean isFull();
	abstract void uncheckedAddElement(String element);
	public void addElement(String element) {
		if (!isFull())
			uncheckedAddElement(element);
		else
			handleError();
	}
	void handleError() {
		System.out.println("Adding item to a full history");
	};
}
