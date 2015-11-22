package lectures.factories.counter;

public class InstanceCountingCounterFactorySelector {
	static InstanceCountingCounterFactory counterFactory;	
	public static InstanceCountingCounterFactory getCounterFactory() {
		return counterFactory;
	}
	public static void setCounterFactory (InstanceCountingCounterFactory aCounterFactory) {
		counterFactory = aCounterFactory;
	}
}
