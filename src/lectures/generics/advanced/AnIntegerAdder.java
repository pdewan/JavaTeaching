package lectures.generics.advanced;

import lectures.generics_adapters.extra.IntegerAdder;

public class AnIntegerAdder implements GenericAdder<Integer>, IntegerAdder{
	@Override
	public Integer sum(Integer val1, Integer val2) {
		return val1 + val2;
	}
}
