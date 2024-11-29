package exercise7.json;

import java.util.List;

public class Account {
	 private String name;
	 private double balance;
	 private List<Transaction> transactions;

	 public Account() {
		super();
	}
	public Account(String name, double balance, List<Transaction> transactions) {
		super();
		this.name = name;
		this.balance = balance;
		this.transactions = transactions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", transactions=" + transactions + "]";
	}
	 
}
