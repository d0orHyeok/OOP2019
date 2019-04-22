package p4;

import java.util.Scanner;

public class Fib_for {
	public static int fibonacci(int num) {
		int first = 1; int second = 1;
		if (num <= 2)
			return first;
		for (int i = 3; i <= num; i++) {
			int temp = second; // F(i-1)�� ���
			second = second + first; // F(i) ����
			first = temp; // F(i-1)����
		}
		return second; // num ��° ���� return
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n != -1) {
			System.out.print("���° �Ǻ���ġ ������ �����帱���? (-1�� ����) : ");
			n = sc.nextInt();
			if (n == -1)
				return;
			System.out.println(fibonacci(n));
		}
	}
}
