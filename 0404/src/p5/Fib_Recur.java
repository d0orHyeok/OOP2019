package p5;

import java.util.Scanner;

public class Fib_Recur {
	public static int fibonacci(int num) {
		if (num <= 2) { // 1, 2��° ������ ���� 1�̴�
			return 1;
		}
		else {  // ��͸� ���� �ݺ� ȣ��
			return fibonacci(num-1)+fibonacci(num-2);
		}
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
