package lectures.factories.counter;

import lectures.mvc.Counter;


public interface CounterFactory {
	public Counter createCounter (short initValue) ;
	public  Counter createCounter ();
}
