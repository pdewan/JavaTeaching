package lectures.factories.counter;

import lectures.mvc.Counter;

public class StaticCounterFactory {
	public static Counter createCounter (short initValue) {
		return new AShortCounter(initValue);
//		return new AnIntCounter(initValue);
	}
	public static Counter createCounter () {
		return createCounter((short) 0);
	}
}
