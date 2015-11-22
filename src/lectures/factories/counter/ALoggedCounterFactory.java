package lectures.factories.counter;
import lectures.factories.course.LoggedCounter;
import lectures.mvc.Counter;
public class ALoggedCounterFactory implements CounterFactory {

	@Override
	public Counter createCounter(short initValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Counter createCounter() {
		// TODO Auto-generated method stub
		return null;
	}	
//	public LoggedCounter createCounterModel() {
//		return new ALoggedCounter();
//	}
//	public CounterObserver createCounterConsoleView() {
//		return new ALoggedCounterConsoleView();
//	}
}
