package week3_work;

public class Account {
	private String name;
	private double balance;
	private String bank;
	
	public Account(String name, String bank, double balance) {
		this.name = name;
		this.bank = bank;
		
		if(balance > 0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public void withdraw(int drawAmount) {
		if (drawAmount > balance) {
			System.out.println("Withdrawal amount exceeded account balance.");
		}
		
		if (drawAmount <= 0) {
			System.out.println("draw upper 0$");
		}
		
		if (drawAmount > 0)
			balance = balance - drawAmount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBank() {
		return bank;
	}
}
