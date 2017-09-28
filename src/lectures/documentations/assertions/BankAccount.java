package lectures.documentations.assertions;

public interface BankAccount {
	public final int MIN_BALANCE = 100;
	public int getCurrentBalance();
	public void deposit(int amount);
	public boolean withdraw(int amount);	
	public boolean safeWithdraw (int amount);
}