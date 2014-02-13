package lectures.inheritance.abstract_classes;
public class AFreshmanSeminar extends ACourse implements FreshmanSeminar {
	//String title;	//public final  int SEMINAR_NUMBER = 6;
	public AFreshmanSeminar (String theTitle, String theDept) {
		super (theTitle, theDept);
		title = theTitle;
	}
	@Override
	public int getNumber() {
		return SEMINAR_NUMBER;
	}
	//String moreInfo;
	/*
	public AFreshmanSeminar (String theTitle, int theCredits, String theDept,  String theInstructor, String theRoom, String theMoreInfo) {
		super (theTitle, theCredits, theDept, SEMINAR_NUMBER, theInstructor, theRoom);
		moreInfo = theMoreInfo;
	} 
	public String getMoreInfo () {
		return moreInfo;
	}
	*/
}
