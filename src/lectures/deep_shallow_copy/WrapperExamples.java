package lectures.deep_shallow_copy;

public class WrapperExamples {
	public static void wrapperExamples() {
		"Joe Doe".toString();
//		5.toString();
		"Joe Doe".equals(5);
		"Joe Doe".equals(new Integer(5));
		int i = 5 + new Integer(5);
		i = 5 + (new Integer(5)).intValue();		
	}

}
