package lectures.inheritance.abstract_classes.courselist;

import lectures.inheritance.abstract_classes.Course;

public interface CourseList extends TitleMatcher {	
	public void addElement(Course element);	
	public int size();
	public Course elementAt(int index);
	public Course matchTitle (String theTitle);
}