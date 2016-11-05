package lectures.inheritance.abstract_classes;

import shapes.Locatable;



public abstract class ACourse
// implements Locatable
{
	protected String title, dept;

	public ACourse(String theTitle, String theDept) {
		title = theTitle;
		dept = theDept;	
	}

	public String getTitle() {
		return title;
	}

	public String getDepartment() {
		return dept;
	}
	// Uncomment this method. What error do you get?
//	public static void testInstantiation() {
//		new ACourse();
//	}
	
}
