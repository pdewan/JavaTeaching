package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class AFactorySelectorUsingCourseVisits implements CourseVisits{	
	Counter youTubeVisits = StaticCounterFactorySelector.getCounterFactory().createCounter();
	Counter mixVisits =  StaticCounterFactorySelector.getCounterFactory().createCounter();
	public void youTubeVisited(String aUser) {
		youTubeVisits.add(1);
	}	
	public void mixVisited(String aUser) {
		mixVisits.add(1);
	}
}
