package week2_Work;

import java.util.Scanner;

public class W5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, my, num = 0, count = 0, i = 0;
		
		System.out.print("������ ���� �Է��Ͻÿ� : ");
		n = sc.nextInt();
		System.out.print("������ ���ʸ� �Է��Ͻÿ� : ");
		my = sc.nextInt();
		System.out.print("���ؾ� �ϴ� ���� ");
		
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
		System.out.println("�Դϴ�.");
	}
}
