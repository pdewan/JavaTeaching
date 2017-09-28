package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class AnInstanceCountingCourseVisits implements CourseVisits{	
	Counter youTubeVisits;
	Counter mixVisits;
	public AnInstanceCountingCourseVisits (Counter anInstanceCounter) {
		youTubeVisits = InstanceCountingCounterFactorySelector.getCounterFactory().createCounter(anInstanceCounter);
		mixVisits =  InstanceCountingCounterFactorySelector.getCounterFactory().createCounter(anInstanceCounter);
	}
	public void youTubeVisited(String aUser) {
		youTubeVisits.add(1);
	}	
	public void mixVisited(String aUser) {
		mixVisits.add(1);
	}
}
