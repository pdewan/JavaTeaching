package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public abstract class AnAbstractCourseVisitsWithFactoryMethods implements CourseVisits{	
	public abstract Counter createCounter();
	Counter youTubeVisits = createCounter();
	Counter mixVisits = createCounter();
	public void youTubeVisited(String aUser) {
		youTubeVisits.add(1);
	}	
	public void mixVisited(String aUser) {
		mixVisits.add(1);
	}
}
