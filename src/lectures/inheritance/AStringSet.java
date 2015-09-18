package lectures.inheritance;


public class AStringSet extends AStringDatabase implements StringDatabase {
	public void addElement(String element) {
		if (isFull())
			System.out.println("Adding item to a full history");
		else if (!member(element)) {
			super.addElement(element);

		}
	}
	
}
