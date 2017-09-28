package lectures.extra;

public interface LoanPair {
	public Loan getCarLoan(); 
	public void setCarLoan(Loan newValue); 
	public Loan getHouseLoan(); 
	public void setHouseLoan(Loan newValue); 
	public Loan getTotalLoan(); 
}

