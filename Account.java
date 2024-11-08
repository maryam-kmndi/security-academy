package ir.isc.exercise;

import java.time.LocalDateTime;

public class Account {

	//constructors
	public Account(double balance) {
		super();
		this.balance = balance;
		this.branch = null;
		this.locked = false;
		this.lastTransaction = null;

	}
	public Account(double balance, String branch) {
		super();
		this.balance = balance;
		this.branch = branch;
		this.locked = false;
		this.lastTransaction = null;
	}
	
	//properties
	private double balance; 
	private String branch;
	private boolean locked;
	private LocalDateTime lastTransaction;
	
	//lock and unlock
	public void lockAccount() {
		locked = true;
		System.out.println("Account has been Locked");
	}
	public void unlockAccount() {
		locked = false;
		System.out.println("Account has been unLocked");
	}
	
	//methods
	public void print() {
		System.out.println("Balance: " + balance);
		if(branch != null)
			System.out.println("Branch: " + branch);			
		System.out.println(locked ? "Account is Locked." : "Account is not Locked.");
		if(lastTransaction != null) {
			System.out.println("LastTransaction: " + lastTransaction);
		}else {
			System.out.println("No Transaction yet");
		}
	}
	
	public void withdraw(double amount) {
		if (locked) System.out.println("Account is Locked.");
		if (amount <= balance) {
			balance -= amount;
			lastTransaction = LocalDateTime.now();
			System.out.println("Withdraw successful. New Balance: " + balance);
		}else {
			System.out.println("Insufficient amount.");
		}
		
	}
	
	//getter setter
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public LocalDateTime getLastTransaction() {
		return lastTransaction;
	}
	public void setLastTransaction(LocalDateTime lastTransaction) {
		this.lastTransaction = lastTransaction;
	}
	public static void main(String[] args) {
		
		Account acc = new Account(1000, "main branch");
		acc.print();
		acc.withdraw(500);
		acc.lockAccount();
		acc.print();
	}
}


