package lectures.inheritance.abstract_classes;

public class ACourseList implements CourseList, TitleMatcher {
	final int MAX_SIZE = 50;
	Course[] contents = new Course[MAX_SIZE];
	int size = 0;
	public int size() {
		return size;
	}	
	public Course elementAt (int index) {
		return contents[index];
	}	
	boolean isFull() {
		return size == MAX_SIZE;
	}
	public void addElement(Course element) {
		if (isFull())
			System.out.println("Adding item to a full collection");
		else {
			contents[size] = element;
			size++;
		}
	}
	public Course matchTitle (String theTitle) {
		//Course theCourse;
		for (int courseIndex = 0; courseIndex < size; courseIndex++) {
			if (contents[courseIndex].getTitle().equals(theTitle))
				return contents[courseIndex];			
		}	
		return null;
	}	
}