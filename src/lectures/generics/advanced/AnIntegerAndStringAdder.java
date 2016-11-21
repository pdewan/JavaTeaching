package lectures.generics.advanced;

import lectures.generics_adapters.extra.IntegerAdder;

public class AnIntegerAndStringAdder implements GenericAdder<Integer>, IntegerAdder, StringAdder /*GenericAdder<String>*/{
	@Override
	public Integer sum(Integer val1, Integer val2) {
		return val1 + val2;
	}
	@Override
	public String sum(String val1, String val2) {
		return val1 + val2;
	}
}
