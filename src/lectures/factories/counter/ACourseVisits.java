package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class ACourseVisits implements CourseVisits{	
//	Counter youTubeVisits = new AShortCounter((short) 0);
//	Counter mixVisits =  new AShortCounter((short) 0);
	Counter youTubeVisits = new AnIntCounter((short) 0);
	Counter mixVisits =  new AnIntCounter((short) 0);
	public void youTubeVisited(String aUser) {
		youTubeVisits.add(1);
	}	
	public void mixVisited(String aUser) {
		mixVisits.add(1);
	}
}
