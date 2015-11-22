package lectures.factories.counter;

import lectures.mvc.Counter;

public class AShortCourseVisits extends ACourseVisitsWithFactoryMethods {

	@Override
	public Counter createCounter() {
		return new AShortCounter ((short) 0);
	}

}
