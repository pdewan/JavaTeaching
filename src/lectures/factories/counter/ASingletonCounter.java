package lectures.factories.counter;
import lectures.factories.course.LoggedCounter;
import lectures.mvc.ACounter;
import lectures.mvc.Counter;
public class ASingletonCounter implements Counter {
	short counter;	
	private ASingletonCounter (short initValue) {
		counter = initValue;
	}
	public void add (int amount) {
		counter += amount;
	}
	public int getValue() {
		return counter;
	}
	static Counter instance;
	public static Counter getInstance() {
		if (instance != null) {
			instance = new ASingletonCounter ((short) 0);
		}
		return null;
	}
}
