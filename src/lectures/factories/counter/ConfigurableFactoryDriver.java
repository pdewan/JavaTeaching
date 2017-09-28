package lectures.factories.counter;

public class ConfigurableFactoryDriver {
	public static void main (String[] args) {
		CourseVisits aCourseVisits = new AStaticConfigurableFactoryUsingCourseVisits();
		aCourseVisits.mixVisited("anonymous");		
	}

}
