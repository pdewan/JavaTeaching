package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class AStaticConfigurableFactoryUsingCourseVisits implements CourseVisits{	
	Counter youTubeVisits = StaticConfigurableCounterFactory.createCounter();
	Counter mixVisits = StaticConfigurableCounterFactory.createCounter();
	public void youTubeVisited(String aUser) {
		youTubeVisits.add(1);
	}	
	public void mixVisited(String aUser) {
		mixVisits.add(1);
	}
}
