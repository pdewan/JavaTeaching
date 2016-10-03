package lectures.inheritance.extra;

import lectures.arrays.collections_implementation.StringHistory;
import lectures.inheritance.is_a.Locatable;
// MULTIPLE INTERFACE INHERITANCE
public interface LocatableStringHistory  
		extends StringHistory 
		, Locatable // extending a second interface, it is legal!
// Why does this not create a problem as multiple class inheritance does?
{
// The interface has no methods of its own, is that ok? Is there use for such an interface?
}
