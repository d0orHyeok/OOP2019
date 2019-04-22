package week3_work;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("JHKim", "NH", 50.00);
		Account account2 = new Account("JHKim", "SH", -7.53);
		
		System.out.printf("%s %s balance : $%.2f%n", account1.getName(), account1.getBank(), account1.getBalance());
		System.out.printf("%s %s balance : $%.2f%n%n", account2.getName(), account2.getBank(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter withdraw amount for account1");
		int drawAmount = input.nextInt();
		
		account1.withdraw(drawAmount);
		
		System.out.println(account1.getBalance());
	}
}