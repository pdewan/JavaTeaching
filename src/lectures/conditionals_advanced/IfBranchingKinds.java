package lectures.conditionals_advanced;

public class IfBranchingKinds {
	public static final int A_CUTOFF = 90;
	public static final int B_CUTOFF = 80;
	public static final int C_CUTOFF = 70;
	public static final int D_CUTOFF = 60;

	public static char toLetterGradeElseBranching(int score) {
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

	public static char toLetterGradeThenBranching(int score) {
		if (score >= D_CUTOFF)
			if (score >= C_CUTOFF)
				if (score >= B_CUTOFF)
					if (score >= A_CUTOFF)
						return 'A';
					else
						return 'B';
				else
					// score < B_CUTOFF
					return 'C';
			else
				// score < C_CUTOFF
				return 'D';
		else
			// score < D_CUTOFF
			return 'F';
	}

	public static char toLetterGradeBalancedBranching(int score) {
		if (score >= B_CUTOFF)
			if (score >= A_CUTOFF)
				return 'A';
			else
				return 'B';
		else // score < B_CUTOFF
		if (score < C_CUTOFF)
			if (score < D_CUTOFF)
				return 'F';
			else
				return 'D';
		else
			// score >= C_CUTOFF
			return 'C';
	}
	
	public static char toLetterGradeNoNestingAndOneReturn(int score) {
		char result = 'I';
		if (score >= A_CUTOFF)
			result = 'A';
		if ((score < A_CUTOFF) && (score >= B_CUTOFF)) 
			result = 'B';
		if ((score < B_CUTOFF) && (score >= C_CUTOFF))
			result = 'C';
		if ((score < C_CUTOFF) && (score >= D_CUTOFF))
			result = 'D';
		if (score < D_CUTOFF)
			result = 'F';
		return result;
			
	}
	public static char toLetterElseBranchingAndOneReturn(int score) {
		char result = 'I';
		if (score >= A_CUTOFF)
			result = 'A';
		else if (score >= B_CUTOFF)
			result = 'B';
		else if (score >= C_CUTOFF)
			result = 'C';
		else if (score >= D_CUTOFF)
			result = 'D';
		else
			result = 'F';
		return result;			
	}
	public static char toLetterGradeNoNestingAndMultipleReturns(int score) {
		if (score >= A_CUTOFF)
			return 'A';
		if (score >= B_CUTOFF)
			return 'B';
		if (score >= C_CUTOFF)
			return 'C';
		if (score >= D_CUTOFF)
			return 'D';
		
		return 'F';

			
	}
}
