package lectures.types.math;

public class ANumberTypesDemoer {
	double height = 1.77;
	int weight = 70;
	double height2 = 2;
//	int weight2 = 70.0;
//	double weight = “seventy”;
	byte b = Byte.MIN_VALUE + 1;
	short s = Short.MAX_VALUE - 1;
	long l = Integer.MAX_VALUE + 1;
	float f = Float.MIN_VALUE + 2;
	double d = Float.MAX_VALUE*2;
	
	long l2 = 70;
	double d2 = 70;
	
	int i = (int) 70.6;
	
	float f2 = (float) 70.6;
	
//	bool b = (bool) 5;
	
	double weight2;

	public int getIntWeight() {
		return (int) weight2;
	}
	
	public void intDivMod() {
		System.out.println(5/2);
		System.out.println(5%2);
		
	}
	public void doubleDivMod() {
		System.out.println(5.0/2.0);		
	}
	
	public void overflow() {
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(Integer.MIN_VALUE - 1);
		System.out.println((double) Integer.MIN_VALUE - 1.0);
		System.out.println(Double.MAX_VALUE + 1.0);
		System.out.println(Double.MIN_VALUE - 1.0);

	}
	
	public void divByZero() {
		System.out.println(10/0);
		System.out.println(-10/0);
		System.out.println(10.0/0.0);
		System.out.println(-10.0/0.0);
		System.out.println(0/0);
		System.out.println(0.0/0.0);	
	}
	
	public void MathFunctions() {
		System.out.println(Math.PI);
		System.out.println(Math.pow(5,3));
		System.out.println(Math.round(5.9));
		System.out.println((int) 5.9);
	}

	
	
	

}
