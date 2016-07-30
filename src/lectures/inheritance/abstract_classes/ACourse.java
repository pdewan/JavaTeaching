package lectures.inheritance.abstract_classes;

import shapes.Locatable;

// This is the first class in which the keyword "asbtract" occurs in the class definition
// which makes this an abstract class.

// Uncomment the implements clause below.
// Does ACourse implement all of the methods in Course?
// (When you save the file) do you get any errors in this class?
// Do you get errors in other classes?
// Comment it back.
// Uncomment the testInstantiation method below.
// Does the error you get make sense?

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
