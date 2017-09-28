package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class AStaticFactoryMethodUsingCourseVisits implements CourseVisits{	
	Counter youTubeVisits = StaticCounterFactory.createCounter();
	Counter mixVisits = StaticCounterFactory.createCounter();
	public void youTubeVisited(String aUser) {
		youTubeVisits.add(1);
	}	
	public void mixVisited(String aUser) {
		mixVisits.add(1);
	}
}
