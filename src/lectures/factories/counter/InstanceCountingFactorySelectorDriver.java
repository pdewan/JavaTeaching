package lectures.factories.counter;

import lectures.mvc.Counter;

public class InstanceCountingFactorySelectorDriver {
	public static void main (String[] args) {
		Counter instanceCounter = new AnInstanceCountingCounter((short)0);
		InstanceCountingCounterFactorySelector.setCounterFactory(new AnInstanceCountingShortCounterFactory());
		CourseVisits aCourseVisits = new AnInstanceCountingCourseVisits(instanceCounter);
		aCourseVisits.mixVisited("anonymous");
		InstanceCountingCounterFactorySelector.setCounterFactory(new AnInstanceCountingShortCounterFactory());
		aCourseVisits = new AnInstanceCountingCourseVisits(instanceCounter);
		aCourseVisits.mixVisited("anonymous2");
		System.out.println ("Num instances:" + instanceCounter.getValue());
	}
}
