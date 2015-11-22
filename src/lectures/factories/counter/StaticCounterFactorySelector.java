package lectures.factories.counter;

public class StaticCounterFactorySelector {
	static CounterFactory counterFactory = new AShortCounterFactory();	
	public static CounterFactory getCounterFactory() {
		return counterFactory;
	}
	public static void setCounterFactory (CounterFactory aCounterFactory) {
		counterFactory = aCounterFactory;
	}
}
