package lectures.factories.counter;

import lectures.mvc.Counter;

public class AnIntCourseVisits extends ACourseVisitsWithFactoryMethods {
	@Override
	public Counter createCounter() {
		return new AnIntCounter ((short) 0);
	}
}
