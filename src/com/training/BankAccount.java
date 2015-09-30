package com.training;

public class BankAccount {

	private double balance = 2000;
	public BankAccount()
	{
		super();
	}
	
	
	public synchronized double deposit(double amt)
	{
		
		balance = balance+ amt;
		System.out.println("Amount Deposited,Current balance-will wait for transfer");
		notify();
		return balance;
		
	}
	
	public synchronized double withdraw(double amt){
		
		if(balance <amt)
		{
			System.out.println("Insufficient Balance - Will wait for Transfer");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		balance = balance -amt;
		System.out.println("Got the balance,current balance after withdrawl : "+ balance);
		return balance;
		}
	
	
}
