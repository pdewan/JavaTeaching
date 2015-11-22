package lectures.factories.counter;

import lectures.mvc.ACounter;
import lectures.mvc.Counter;

public class ACourseSubscriptions implements CourseSubscriptions{
//	Counter youTubeSubscriptions = new AnIntCounter((short) 0);
//	Counter mixSubscriptions = new AnIntCounter((short) 0);	
	Counter youTubeSubscriptions = new AShortCounter((short) 0);
	Counter mixSubscriptions = new AShortCounter((short) 0);
	public void youTubeSubscribed(String aUser) {
		youTubeSubscriptions.add(1);
	}
	public void youTubeUnSubscribed(String aUser) {
		youTubeSubscriptions.add(-1);
	}
	public void mixSubscribed(String aUser) {
		mixSubscriptions.add(1);
	}
	public void mixUnSubscribed(String aUser) {
		mixSubscriptions.add(-1);
	}

}
