package lectures.extra;

import lectures.inheritance.abstract_classes.Course;

public class ACourseDelegate  {
	String title, dept;
	public ACourseDelegate (Course theDelegator, String theTitle, String theDept) {
		title = theTitle;
		dept = theDept;
		System.out.println("New course created: " + "Title:" + title + " Dept:"
+ dept + " Number: " + theDelegator.getNumber()); 		
	}	
	public String getTitle() {
		return title;
	}	
	public String getDepartment() {
		return dept;
	}
;

	
}
