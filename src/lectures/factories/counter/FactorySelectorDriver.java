package lectures.factories.counter;

public class FactorySelectorDriver {
	public static void main (String[] args) {
		StaticCounterFactorySelector.setCounterFactory(new AShortCounterFactory());
		CourseVisits aCourseVisits = new AFactorySelectorUsingCourseVisits();
		aCourseVisits.mixVisited("anonymous");
		StaticCounterFactorySelector.setCounterFactory(new AnIntCounterFactory());
		aCourseVisits = new AFactorySelectorUsingCourseVisits();
		aCourseVisits.mixVisited("anonymous2");
		System.out.println ("Num instances: " + InstanceCountingCounterSingletonFactory.getCounter().getValue());
	}
}
