package lectures.inheritance.abstract_classes;

import lectures.inheritance.is_a.Locatable;




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
	
}
