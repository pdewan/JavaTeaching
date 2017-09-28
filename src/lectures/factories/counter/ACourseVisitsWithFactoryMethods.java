package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class ACourseVisitsWithFactoryMethods implements CourseVisits{	
	Counter youTubeVisits = createCounter();
	Counter mixVisits = createCounter();
	public Counter createCounter() {
		return new AnIntCounter ((short) 0);
	}
	public void youTubeVisited(String aUser) {
		youTubeVisits.add(1);
	}	
	public void mixVisited(String aUser) {
		mixVisits.add(1);
	}
}
