package lectures.generics_adapters;

import lectures.generics_adapters.GenericObserver;
import lectures.mvc.Counter;
/**
 * Study this code.
 * 
 * (T/F) Only collection types are generic.
 */
public class AGenericConsoleView<T> implements GenericObserver<T> {
	
	@Override
	public void update(T aValue) {
		System.out.println(aValue);		
		
	}
}
/*
 * Go to JavaCollectionsVariety
 */
