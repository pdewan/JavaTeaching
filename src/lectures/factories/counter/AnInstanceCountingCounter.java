package lectures.factories.counter;
import lectures.factories.course.LoggedCounter;
import lectures.mvc.ACounter;
import lectures.mvc.Counter;
public class AnInstanceCountingCounter implements Counter {
	short counter;	
	public AnInstanceCountingCounter (short initValue) {
		counter = initValue;
	}
	public void add (int amount) {
		counter += amount;
	}
	public int getValue() {
		return counter;
	}
}
