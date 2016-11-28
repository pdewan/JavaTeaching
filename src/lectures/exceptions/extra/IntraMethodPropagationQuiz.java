package lectures.exceptions.extra;


public class IntraMethodPropagationQuiz {
	static int[] list = {5, 0, 7 };

	public static void tryInsideLoop() {
		for (int i = 0; i < list.length; i++) {
			try {
				System.out.println(35/list[i]);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		}
	}

	public static void tryOutsideLoop() {
		try {
			for (int i = 0; i < list.length; i++) {
				System.out.println(35/list[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void main (String[] args) {
		tryInsideLoop();
		tryOutsideLoop();
	}

}
