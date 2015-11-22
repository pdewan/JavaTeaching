package lectures.factories.counter;
import lectures.factories.course.LoggedCounter;
import lectures.mvc.ACounter;
public class ALoggedCounter extends ACounter implements LoggedCounter {
	int numberOfAdds;	
	public void add (int amount) {
		numberOfAdds++;
		super.add(amount);
	}	
	public int getNumberOfAdds() {
		return numberOfAdds;
	}
}
