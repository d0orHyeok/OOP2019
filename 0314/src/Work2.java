import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x4, y4;
		System.out.println("x1 y1 입력 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("x2 y2 입력 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("x3 y3 입력 : ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		x4 = x1^x2^x3;
		y4 = y1^y2^y3;
		System.out.println("x4 y4는 ("+x4+", "+y4+")입니다.");
	}
}
