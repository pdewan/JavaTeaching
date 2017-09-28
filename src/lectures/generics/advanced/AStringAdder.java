package lectures.generics.advanced;

public class AStringAdder implements GenericAdder<String>, StringAdder{
	@Override
	public String sum(String val1, String val2) {
		return val1 + val2;
	}
}
