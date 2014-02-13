package lectures.composite.objects_shapes;

public class ALoanPair implements LoanPair {

	Loan carLoan; 
	Loan houseLoan;

	public ALoanPair (Loan initCarLoan, Loan initHouseLoan) {
		setCarLoan(initCarLoan);
		setHouseLoan(initHouseLoan);
	}

	public Loan getCarLoan() {
		return carLoan;
	}
	public void setCarLoan(Loan newValue) {
		carLoan = newValue;
	}
	public Loan getHouseLoan() {
		return houseLoan;
	}
	public void setHouseLoan(Loan newValue) {
		houseLoan = newValue;
	}
	public Loan getTotalLoan() {
		return ALoan.add(carLoan, houseLoan);
	}
	
}
