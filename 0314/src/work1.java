import java.util.Scanner;

public class work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("�Է� : ");
		x = sc.nextInt();
		
		if((x&1<<31) == 0)
			System.out.println("����Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
	}
}
