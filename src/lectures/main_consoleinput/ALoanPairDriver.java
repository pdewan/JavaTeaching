package lectures.main_consoleinput;

import java.io.DataInputStream;

import lectures.composite.objects_shapes.ALoan;
import lectures.composite.objects_shapes.ALoanPair;
import lectures.composite.objects_shapes.AnotherLoan;
import lectures.composite.objects_shapes.Loan;
import lectures.composite.objects_shapes.LoanPair;
public class ALoanPairDriver {
	static DataInputStream dataIn = new DataInputStream (System.in);
	public static void main (String args[]) {
		LoanPair loanPair = new ALoanPair(
readCarLoan(), readHouseLoan());
		print (loanPair);
		pause();
	}
	public static Loan readCarLoan() {
		System.out.println("Please enter car principal:");	
		return new ALoan(readInt());
	}
	public static Loan readHouseLoan() {
		System.out.println("Please enter house yearly interest:");	
		return new AnotherLoan(readInt());
	}
	public static int readInt() {
		try {
			return Integer.parseInt(dataIn.readLine());
		} catch (Exception e) {
			return 0;
		}	
	}
	public static void print (LoanPair loanPair) {
		System.out.println("****Car Loan*****");
		print(loanPair.getCarLoan());		
		System.out.println("****House Loan****");
		print(loanPair.getHouseLoan());
		System.out.println("****Total Loan****");
		print (loanPair.getTotalLoan());
	}
	public static void print(Loan loan) {
		System.out.println(
"Principal:" + loan.getPrincipal());
		System.out.println(
"Yearly Interest:" + loan.getYearlyInterest());
		System.out.println(
"Monthly Interest:" + loan.getMonthlyInterest());
	}	
	public static void pause() {
		try {
			System.in.read();
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
}


//import java.io.DataInputStream;
//public class ALoanPairDriver {
//	static DataInputStream dataIn = new DataInputStream (System.in);
//	
//	public static void main (String args[]) {
//		LoanPair loanPair = new ALoanPair(readCarLoan(), readHouseLoan());
//		print (loanPair);
//		pause();
//	}
//	
//	public static Loan readCarLoan() {
//		System.out.println("Please enter car principal:");	
//		return new ALoan(readInt());
//	}
//	
//	public static Loan readHouseLoan() {
//		System.out.println("Please enter house yearly interest:");	
//		return new AnotherLoan(readInt());
//	}
//	
//	public static int readInt() {
//		try {
//			return Integer.parseInt(dataIn.readLine());
//		} catch (Exception e) {
//			return 0;
//		}	
//	}
//	
//	public static void print (LoanPair loanPair) {
//		System.out.println("****Car Loan*****");
//		print(loanPair.getCarLoan());		
//		System.out.println("****House Loan****");
//		print(loanPair.getHouseLoan());
//		System.out.println("****Total Loan****");
//		print (loanPair.getTotalLoan());
//	}
//	
//	public static void print(Loan loan) {
//		System.out.println("Principal:" + loan.getPrincipal());
//		System.out.println("Yearly Interest:" + loan.getYearlyInterest());
//		System.out.println("Monthly Interest:" + loan.getMonthlyInterest());
//	}
//	
//	public static void pause() {
//		try {
//			System.in.read();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}	
//}
