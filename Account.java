package ir.isc.ex3;

public class Account {
	
	public Account(String name, String branch, double balance) {
		super();
		this.name = name;
		this.branch = branch;
		this.balance = balance;
	}
	
	private String name;
	private String branch;
	private double balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString(){
		return "Account name: " + name + " ,Branch : " + branch + " ,Balance : " + balance + "\n";
	}
}
