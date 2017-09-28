package lectures.documentations.assertions;

import bus.uigen.ObjectEditor;

public class ABankAccount implements BankAccount {
	int currentBalance = 0;
	public  ABankAccount (int initialBalance) {
		currentBalance = initialBalance;	
	}	
	public int getCurrentBalance () {
		return currentBalance;	
	}
	
	public void deposit (int amount) {
		currentBalance += amount;
	}	
	public boolean withdraw (int amount) {		
		int minNecessaryBalance = MIN_BALANCE + amount; 
		if (minNecessaryBalance  <= currentBalance) {
			currentBalance -= amount;
			return true;
		} else return false;
	}	
	public boolean safeWithdraw (int amount) {
     	assert amount > 0: "amount < 0";
     	boolean retVal = withdraw(amount);
     	assert currentBalance >= MIN_BALANCE: "currentBalance < MIN_BALANCE";
     	return retVal;
	}
	public static void main (String args[]) {
		final int initialBalance = 2500;
		ObjectEditor.edit(new ABankAccount(initialBalance));
	}

}

