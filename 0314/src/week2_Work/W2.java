package week2_Work;

import java.util.Scanner;

public class W2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("�Է� : ");
		x = sc.nextInt();
		System.out.print("��� : "+x+"�� ");
		if((x&1<<31) == 0)
			System.out.print((x-1)^-1);
		else
			System.out.print((x^-1)+1);
		System.out.println("�� �����Ǿ����ϴ�.");
	}
}
