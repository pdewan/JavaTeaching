package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class AStaticFactoryUsingCourseSubscriptions implements CourseSubscriptions{
	Counter youTubeSubscriptions = StaticCounterFactory.createCounter();
	Counter mixSubscriptions = StaticCounterFactory.createCounter();
	public void youTubeSubscribed(String aUser) {
		youTubeSubscriptions.add(1);
	}
	public void youTubeUnSubscribed(String aUser) {
		youTubeSubscriptions.add(-1);
	}
	public void mixSubscribed(String aUser) {
		mixSubscriptions.add(1);
	}
	public void mixUnSubscribed(String aUser) {
		mixSubscriptions.add(-1);
	}

}
