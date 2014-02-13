package lectures.exceptions;


public class IntraMethodPropagation {
	static Object[] list = {5, "hello", "goodbye" };

	public static void tryInsideLoop() {
		for (int i = 0; i < list.length; i++) {
			try {
				System.out.println((String) list[i]);
			} catch (ClassCastException e) {
				System.out.println(e);
			}
		}
	}

	public static void tryOutsideLoop() {
		try {
			for (int i = 0; i < list.length; i++) {
				System.out.println((String) list[i]);
			}
		} catch (ClassCastException e) {
			System.out.println(e);
		}
	}
	
	public static void main (String[] args) {
		tryInsideLoop();
		tryOutsideLoop();
	}

}
