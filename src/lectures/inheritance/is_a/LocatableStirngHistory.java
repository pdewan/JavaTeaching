package lectures.inheritance.is_a;

import lectures.arrays.collections_implementation.StringHistory;
// MULTIPLE INTERFACE INHERITANCE
public interface LocatableStirngHistory  
		extends StringHistory 
		, Locatable // extending a second interface, it is legal!
// Why does this not create a problem as multiple class inheritance does?
{
// The interface has no methods of its own, is that ok? Is there use for such an interface?
}
