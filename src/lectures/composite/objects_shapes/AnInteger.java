package lectures.composite.objects_shapes;

public class AnInteger implements MyInteger {
	
	int wrappedInt;
	
	public AnInteger (int anInt) {
		wrappedInt = anInt;
	}

	@Override
	public int intValue() {
		return wrappedInt;
	}
	

}
