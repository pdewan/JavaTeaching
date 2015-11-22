package lectures.factories.counter;
import lectures.factories.course.LoggedCounter;
import lectures.mvc.ACounter;
import lectures.mvc.Counter;
public class AShortCounter implements Counter {
	short counter;	
	public AShortCounter (short initValue) {
		counter = initValue;
		InstanceCountingCounterSingletonFactory.getCounter().add(1);
	}
	public void add (int amount) {
		counter += amount;
	}
	public int getValue() {
		return counter;
	}
}
