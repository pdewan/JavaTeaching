package lectures.class_dual_roles.statics;
public class FactorialWithPublicVariables {
    public static int number = 0; // last number for which factorial is computed
    public static int factorial;  // factorial for last number	 
	public static void updateFactorial() {
		while (number > 0) {
			factorial *= number;
			number -= 1;
		}
	}
	
	public static void main (String[] args) {
		FactorialWithPublicVariables.number = 4;
		FactorialWithPublicVariables.updateFactorial();
		System.out.println(FactorialWithPublicVariables.factorial);
	}
	
}
