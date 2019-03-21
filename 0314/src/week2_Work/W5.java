package week2_Work;

import java.util.Scanner;

public class W5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, my, num = 0, count = 0, i = 0;
		
		System.out.print("참가자 수를 입력하시오 : ");
		n = sc.nextInt();
		System.out.print("본인의 차례를 입력하시오 : ");
		my = sc.nextInt();
		System.out.print("말해야 하는 수는 ");
		
		while (count < 5) {
			String x = Integer.toBinaryString(i);
			for (int j = 0; j < x.length(); j++) {
				num++;
				if(num == my+n*count) {
					char c = x.charAt(j);
					System.out.print(c+" ");
					count++;
				}
			}
			i++;
		}
		System.out.println("입니다.");
	}
}
