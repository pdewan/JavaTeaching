package lectures.types.math;

public class AnOperatorPrecedenceDemoer {
	public static void operatorPrecedenceDemo() {
		System.out.println(false && 10 / 0> 0);
		System.out.println(- 5 - 4);
		System.out.println(!true && false);
		System.out.println(5 / 4 * 3);
		System.out.println(5 / 4 * 3);
		System.out.println(true || false == false || true);
		System.out.println((int) 5 / 2.0);
	}
}
