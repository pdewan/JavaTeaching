package lectures.conditionals;

public class IfExamples {
	public static final int PASS_CUTOFF = 50;
	public static final int A_CUTOFF = 90;
	public static final int B_CUTOFF = 80;
	public static final int C_CUTOFF = 70;
	public static final int D_CUTOFF = 60;
	
	public  static void printPassFailStatus(int score) {
		 if (score < PASS_CUTOFF)
			 System.out.println("FAILED");
		 else
			 System.out.println("PASSED");
		
	}

	public static void fancyPrintGrade(int score) 
	   {
		if (score < PASS_CUTOFF) 
	       {
			System.out.println("**************");
			System.out.println("FAILED");
			System.out.println("**************");
		       }
		else 
	      {
			System.out.println("**************");
			System.out.println("PASSED");
			System.out.println("Congratulations!");
			System.out.println("**************");
		     }
	 }
	public static void fancyPrintGradeWithoutCodeDuplication(int score)    {
		System.out.println("**************");
		if (score < PASS_CUTOFF)   
			System.out.println("FAILED");
		else {
			System.out.println("PASSED");
			System.out.println("Congratulations!"); 
		 }
		System.out.println("**************");
	 }
	public static char toLetterGrade (int score) {
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
