package p6;

import java.util.Scanner;

public class Fib_Memo {
	static int[] fib = new int[100];  //���� ���� �����ϱ����� �迭
	
	public static int fibonacci(int num) {
		if (num <= 2)  // 1,2 ��° ������ 1�̴�
			return 1;
		
		if (fib[num] != 0)  // �迭 �ʱⰪ�� 0�̹Ƿ�
			return fib[num]; // ����� �� return
		else {
			fib[num] = fibonacci(num-1) + fibonacci(num-2); // ����� ���� �̿��� ���
			return fib[num];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n != -1) {
			System.out.print("���° �Ǻ���ġ ������ �����帱���? (-1�� ����) : ");
			n = sc.nextInt();
			if (n == -1 || n > 100)
				return;
			System.out.println(fibonacci(n));
		}
	}
}
