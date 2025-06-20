package com;

public class test {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Thread t1 = new Thread(new Atm(account, "Akhil", "withdraw", 3000));
        Thread t2 = new Thread(new Atm(account, "Bhavya", "check", 0));
        Thread t3 = new Thread(new Atm(account, "Charan", "withdraw", 5000));
        Thread t4 = new Thread(new Atm(account, "Divya", "withdraw", 4000));
        
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
	}
}
