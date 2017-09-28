package lectures.conditionals_advanced;

public class IfVsBooleanExpression {
	public static final int PASS_CUTOFF = 50;
	public static boolean hasFailedIf(int score) {
		if (score < PASS_CUTOFF)
			return true;
		else
			return false;
	}
	public static boolean hasFailedBoolean(int score) {
		return score < PASS_CUTOFF;
	}
	
	




}
