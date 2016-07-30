package lectures.inheritance.abstract_classes;

public class ACourseList implements CourseList, TitleMatcher {
	static final int MAX_SIZE = 50;
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
		if (isFull()) {
			System.out.println("Adding item to a full collection");
		} else {
			contents[size] = element;
			size++;
		}
	}
	
	// Contrast this method with the member method we saw in AStringDatabase
	public Course matchTitle (String theTitle) {
		for (int courseIndex = 0; courseIndex < size; courseIndex++) {
			if (contents[courseIndex].getTitle().equals(theTitle)) {
				return contents[courseIndex];	
			}
		}	
		return null;
	}	
}