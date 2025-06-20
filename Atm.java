package com;

public class Atm implements Runnable{
	
	
	BankAccount account;
	String name;
	String operation;
	int amount;
	
	public Atm(BankAccount account, String name, String operation, int amount) {
		super();
		this.account = account;
		this.name = name;
		this.operation = operation;
		this.amount = amount;
	}

	@Override
	public void run() {
		if(operation.equalsIgnoreCase("withdraw")) {
			account.withdraw(name, amount);
		}
		else {
			account.checkBalance(name);
		}
		
	}
}
