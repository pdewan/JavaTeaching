package lectures.types.math;

public class ABoolTypeDemoer {
	public void relationalOps() {
		System.out.println(5==5);
		System.out.println(5==4);
		System.out.println(5>=4);
		System.out.println(5<=4);
		System.out.println(5!=4);
		System.out.println(5!=5);
	}
	public void boolOps() {
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	}
	
	public void shortCircuit() {
		System.out.println(!false & (9654.34/323.13  >  32.34));
		System.out.println(true |(9654.34/323.13 >  32.34));
		System.out.println(!false && (9654.34/323.13  >  32.34));
		System.out.println(true || (9654.34/323.13 >  32.34));
		System.out.println(false && (10/0 ==  Integer.MAX_VALUE));
		System.out.println(false & (10/0 ==  Integer.MAX_VALUE));
	}	
	

}
