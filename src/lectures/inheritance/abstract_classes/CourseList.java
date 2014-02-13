package lectures.inheritance.abstract_classes;
public interface CourseList extends TitleMatcher {	
	public void addElement(Course element);	
	public int size();
	public Course elementAt(int index);
	public Course matchTitle (String theTitle);
}