package com.Encapsulation;

class BankAccount{
	private int accountNumber,balance;
	private String accountHolder;
	
	BankAccount(int accountNumber,int balance,String accountHolder ){
		this.accountNumber = accountNumber;
		this.balance=balance;
		this.accountHolder=accountHolder;
		
	}
	public int getAccountNumber() {
		System.out.println("The Account number is : "+accountNumber+"\n");
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBalance() {
		System.out.println("Balance in the Account is ; "+balance+"\n");
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getAccountHolder() {
		System.out.println("Name of the Account Holder : "+accountHolder+"\n");
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public int Deposit(int deposit_amt) {
	    balance += deposit_amt; 
	    System.out.println("Amount deposited is: " + deposit_amt);
	    System.out.println("Balance after depositing: " + balance + "\n");
	    return balance;
	}

	public int Withdraw(int withdrawal_amt) {
	    if (withdrawal_amt > balance) {
	        System.out.println("Insufficient balance for withdrawal.\n");
	        return balance;
	    }
	    balance -= withdrawal_amt; 
	    System.out.println("Amount withdrawn is: " + withdrawal_amt);
	    System.out.println("Balance after withdrawal: " + balance + "\n");
	    return balance;
	}
}

public class Account_Management_System {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(731616190,100000,"Pranathi");
		acc.getAccountNumber();
		acc.getBalance();
		acc.getAccountHolder();
		acc.Deposit(50000);
		acc.Withdraw(10000);
	}
}
