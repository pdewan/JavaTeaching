package lectures.generics_adapters;

import lectures.mvc.ObservableCounter;

public interface GenericObservable<Observer> {
	public void update(Observer counter); 

}
