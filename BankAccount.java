package com;

public class BankAccount {
	
	private int balance = 10000;
	
	public synchronized void withdraw(String name,int amount) {
		if(amount <= balance) {
			System.out.println(name + " is trying to withdraw amount " + amount);
		
		try {
			Thread.sleep(1000);
		}
		catch( InterruptedException e) {
			e.printStackTrace();
		}
		balance -= amount;
		System.out.println(name + " successfully withdrew Rs."+ amount);
		
		}
		else {
			System.out.println(name +" is tries to withdraw Rs."+amount+" but insufficient balance !");
		}
		System.out.println("Balance after " + name + "'s operation: Rs." + balance);
		System.out.println("---------------------------");
	}
	public synchronized void checkBalance(String name) {
		System.out.println(name +" is checking balance.. ");
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "'s checked balance: Rs." + balance);
        System.out.println("------------------------------------------------");
	}
	
	 	}

