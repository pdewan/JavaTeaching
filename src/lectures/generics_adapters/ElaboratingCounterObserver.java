package lectures.generics_adapters;

import lectures.mvc.CounterObserver;

/*
 All this interface does is extend an elaboration of GenericObserrve
 */
public interface ElaboratingCounterObserver extends GenericObserver<ElaboratingObservableCounter> {
	public void addObserver(GenericObserver<ElaboratingObservableCounter> observer);

}
