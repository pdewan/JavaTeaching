package lectures.extra;

public interface Loan {
	public final int INTEREST_RATE = 6;
	
	public int getPrincipal(); 
	public void setPrincipal(int newValue);
	public int getYearlyInterest(); 
	public void setYearlyInterest(int newVal); 
	public int getMonthlyInterest(); 
	public void setMonthlyInterest(int newVal); 
}
