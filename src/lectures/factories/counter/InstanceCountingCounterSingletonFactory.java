package lectures.factories.counter;

import lectures.mvc.Counter;

public class InstanceCountingCounterSingletonFactory {
	static Counter instanceCounter;
	public static Counter getCounter() {
		if (instanceCounter == null) {
			instanceCounter = new AnInstanceCountingCounter((short)0);
		}
		return instanceCounter;
	}
}
