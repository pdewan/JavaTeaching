package lectures.factories.counter;

import lectures.mvc.Counter;


public interface InstanceCountingCounterFactory {
	public Counter createCounter (short initValue, Counter anInstanceCounter) ;
	public  Counter createCounter (Counter anInstanceCounter);
}
