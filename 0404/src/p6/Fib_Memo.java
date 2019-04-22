package p6;

import java.util.Scanner;

public class Fib_Memo {
	static int[] fib = new int[100];  //수열 값을 저장하기위한 배열
	
	public static int fibonacci(int num) {
		if (num <= 2)  // 1,2 번째 수열은 1이다
			return 1;
		
		if (fib[num] != 0)  // 배열 초기값은 0이므로
			return fib[num]; // 저장된 값 return
		else {
			fib[num] = fibonacci(num-1) + fibonacci(num-2); // 저장된 값을 이용한 재귀
			return fib[num];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n != -1) {
			System.out.print("몇번째 피보나치 수열을 보여드릴까요? (-1은 종료) : ");
			n = sc.nextInt();
			if (n == -1 || n > 100)
				return;
			System.out.println(fibonacci(n));
		}
	}
}
