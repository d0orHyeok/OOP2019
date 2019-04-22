package p5;

import java.util.Scanner;

public class Fib_Recur {
	public static int fibonacci(int num) {
		if (num <= 2) { // 1, 2번째 수열은 값이 1이다
			return 1;
		}
		else {  // 재귀를 통해 반복 호출
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n != -1) {
			System.out.print("몇번째 피보나치 수열을 보여드릴까요? (-1은 종료) : ");
			n = sc.nextInt();
			if (n == -1)
				return;
			System.out.println(fibonacci(n));
		}
	}
}
