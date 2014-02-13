package lectures.conditionals_advanced;

public class RedundantTrueEquality {
	public static final int A_CUTOFF = 90;
	public static final int B_CUTOFF = 80;
	public static final int C_CUTOFF = 70;
	public static final int D_CUTOFF = 60;

	public static char toLetterGradeWithRedundantTest(int score) {
		if ((score >= A_CUTOFF == true))
			return 'A';
		else if (score >= B_CUTOFF == true)
			return 'B';
		else if (score >= C_CUTOFF == true)
			return 'C';
		else if (score >= D_CUTOFF == true)
			return 'D';
		else
			return 'F';
	}

	public static char toLetterGrade(int score) {
		if (score >= A_CUTOFF)
			return 'A';
		else if (score >= B_CUTOFF)
			return 'B';
		else if (score >= C_CUTOFF)
			return 'C';
		else if (score >= D_CUTOFF)
			return 'D';
		else
			return 'F';
	}

}
