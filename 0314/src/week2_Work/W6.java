package week2_Work;

import java.util.Scanner;

public class W6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("테스트 하려는 상황의 개수: ");
		int t = sc.nextInt();
		
		String[] arr1 = new String[t];
		String[] arr2 = new String[t];
		System.out.println("테스트 케이스를 입력하세요.");
		for(int i = 0; i < t; i++) {
			arr1[i] = sc.next();
			arr2[i] = sc.next();
		}
		
		for(int i = 0; i < t; i++) {
			int num, print, a1 = 0, a2 = 0, diff = 0;
			for (int j = 0; j < arr1[i].length(); j++) {
				char ac1 =arr1[i].charAt(j);
				char ac2 =arr2[i].charAt(j);
				if (ac1 == '1')
					a1++;
				if (ac2 == '1')
					a2++;
				if (ac1 != ac2)
					diff++;
			}
			num = Math.abs(a1 - a2);
			print = (diff-num)/2 + num;	
			System.out.println((i+1)+"번째 테스트 비트사랑 지수: "+print);
		}
		
	}
}
