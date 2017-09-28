package lectures.extra;

public class AnotherLoan implements Loan {
	int yearlyInterest;
    
	public AnotherLoan(int initYearlyInterest) {
		setYearlyInterest(initYearlyInterest);
	}
	
	public int getPrincipal() {
		return yearlyInterest*100/INTEREST_RATE;
	}
	public void setPrincipal(int newVal) {
		yearlyInterest = newVal*INTEREST_RATE/100;
	}
	public int getYearlyInterest() {
		return yearlyInterest;
	}
	public void setYearlyInterest(int newVal) {
		yearlyInterest = newVal;
	}
	public int getMonthlyInterest() {
		return getYearlyInterest()/12;
	}
	public void setMonthlyInterest(int newVal) {
		setYearlyInterest(newVal*12);
	}
}
