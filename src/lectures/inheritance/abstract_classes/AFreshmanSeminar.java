package lectures.inheritance.abstract_classes;

public class AFreshmanSeminar extends ACourse implements FreshmanSeminar {
	
	public AFreshmanSeminar (String theTitle, String theDept) {
		super (theTitle, theDept);
	}
	@Override
	public int getNumber() {
		return SEMINAR_NUMBER; // Press F3 here see where this constant is declared
	}
	
}
