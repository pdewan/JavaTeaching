package lectures.inheritance.abstract_classes;

public abstract class ACourse
// implements Course
{
	protected String title, dept;

	public ACourse(String theTitle, String theDept) {
		title = theTitle;
		dept = theDept;
		// System.out.println("New course created: " + "Title:" + title +
		// " Dept:"
		// + dept + " Number: " + getNumber());
	}

	public String getTitle() {
		return title;
	}

	public String getDepartment() {
		return dept;
	}

	// public abstract int getNumber();
	// public String toString() {
	// return "Title:" + title + " Dept:" + dept + " Number: " + getNumber();
	// }
//	public void init(String theTitle, String theDept) {
//		title = theTitle;
//		dept = theDept;
//		System.out.println("New course created: " + "Title:" + title + " Dept:"
//				+ dept + " Number: " + getNumber());
//	}
}
