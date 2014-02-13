package lectures.loops;

import java.io.DataInputStream;

import lectures.extra.ALoan;
import lectures.extra.Loan;
public class SentinelBasedFoldingLoanSummer {
	static DataInputStream dataIn = new DataInputStream (System.in);
	
	public static void main (String args[]) {
		Loan sumLoan = new ALoan(0);
		Loan nextLoan = readLoan();
	      	while (nextLoan.getPrincipal() >= 0) {
			sumLoan = ALoan.add(nextLoan, sumLoan);
			nextLoan = readLoan();
		}
		print(sumLoan);
		pause();
	}
	
	public static Loan readLoan() {
		System.out.println("Next principal:");	
		return new ALoan(readInt());
	}
	
	public static int readInt() {
		try {
			return Integer.parseInt(dataIn.readLine());
		} catch (Exception e) {
			return 0;
		}	
	}
	
	public static void print(Loan loan) {
		System.out.println("Principal:" + loan.getPrincipal());
		System.out.println("Yearly Interest:" + loan.getYearlyInterest());
		System.out.println("Monthly Interest:" + loan.getMonthlyInterest());
	}
	
	public static void pause() {
		try {
			System.in.read();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
