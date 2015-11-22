package lectures.factories.counter;
import lectures.factories.course.LoggedCounter;
import lectures.mvc.ACounter;
import lectures.mvc.Counter;
public class AnInstanceCountingShortCounter implements Counter {
	short counter;	
	public AnInstanceCountingShortCounter (short initValue, Counter anInstanceCounter) {
		anInstanceCounter.add(1);
		counter = initValue;
	}
	public void add (int amount) {
		counter += amount;
	}
	public int getValue() {
		return counter;
	}
}
