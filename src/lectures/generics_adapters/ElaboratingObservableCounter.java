package lectures.generics_adapters;

import lectures.mvc.Counter;
import lectures.mvc.CounterObserver;
/*
ELABORATING OBSERVABLE INTERFACE
This is like ObservableCounter except that it allows additions of observers implementing
elaborations of a generic observer interface. 
 */
public interface ElaboratingObservableCounter extends Counter{
	public void addObserver(GenericObserver<ElaboratingObservableCounter> observer);

}
