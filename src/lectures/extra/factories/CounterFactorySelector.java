package lectures.extra.factories;

public class CounterFactorySelector {
	//static CounterFactory counterFactory = new ACounterFactory();
	static CounterFactory counterFactory = new ALoggedCounterFactory();
	public static void setCounterFactory(CounterFactory newVal) {
		counterFactory = newVal;	
	}
	public static CounterFactory getCounterFactory() {
		return counterFactory;
	}
}
