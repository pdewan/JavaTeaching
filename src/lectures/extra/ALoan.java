package lectures.extra;

public class ALoan implements Loan {
    int principal;
    
//    int numLoans;
    
    public ALoan(int initPrincipal) {
		setPrincipal(initPrincipal);
//		numLoans++;
    }
    
//    public int getNumLoans() {
//    	return numLoans;
//    }
    
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int newVal) {
		principal = newVal;
	}
	public int getYearlyInterest() {
		return principal*INTEREST_RATE/100;
	}
	public void setYearlyInterest(int newVal) {
		principal = newVal*100/INTEREST_RATE;
	}
	public int getMonthlyInterest() {
		return getYearlyInterest()/12;
	}
	public void setMonthlyInterest(int newVal) {
		setYearlyInterest(newVal*12);
	}
	
	public static Loan add(Loan loan1, Loan loan2) {
		return new ALoan(loan1.getPrincipal() + loan2.getPrincipal());
	}
}
