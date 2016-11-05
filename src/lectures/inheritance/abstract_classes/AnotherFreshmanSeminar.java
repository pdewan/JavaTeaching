package lectures.inheritance.abstract_classes;

public class AnotherFreshmanSeminar  implements FreshmanSeminar {
	protected String title, dept;

	public AnotherFreshmanSeminar (String theTitle, String theDept) {
		title = theTitle;
		dept = theDept;	
	}
	public int getNumber() {
		return SEMINAR_NUMBER; 
	}
	public String getTitle() {
		return title;
	}

	public String getDepartment() {
		return dept;
	}
}
