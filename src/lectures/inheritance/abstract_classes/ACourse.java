package lectures.inheritance.abstract_classes;

import shapes.Locatable;



public abstract class ACourse {
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
