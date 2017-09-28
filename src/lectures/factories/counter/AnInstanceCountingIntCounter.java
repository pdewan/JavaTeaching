package lectures.factories.counter;
import lectures.factories.course.LoggedCounter;
import lectures.mvc.ACounter;
import lectures.mvc.Counter;
public class AnInstanceCountingIntCounter implements Counter {
	int counter;	
	public AnInstanceCountingIntCounter (short initValue,  Counter anInstanceCounter) {
		counter = initValue;
		anInstanceCounter.add(1);
	}
	public void add (int amount) {
		counter += amount;
	}
	public int getValue() {
		return counter;
	}
}
