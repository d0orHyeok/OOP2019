import java.util.Scanner;

public class work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("입력 : ");
		x = sc.nextInt();
		
		if((x&1<<31) == 0)
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");
	}
}
