package p4;

import java.util.Scanner;

public class Fib_for {
	public static int fibonacci(int num) {
		int first = 1; int second = 1;
		if (num <= 2)
			return first;
		for (int i = 3; i <= num; i++) {
			int temp = second; // F(i-1)값 백업
			second = second + first; // F(i) 설정
			first = temp; // F(i-1)저장
		}
		return second; // num 번째 수열 return
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
