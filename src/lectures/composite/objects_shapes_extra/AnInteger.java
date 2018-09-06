package lectures.composite.objects_shapes_extra;

import lectures.composite.objects_shapes.MyInteger;

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
