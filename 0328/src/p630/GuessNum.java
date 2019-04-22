package p630;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
	private int start, end;
	private int rnum;
	
	public GuessNum() {
		this.rnum = 0;
		this.start = 1;
		this.end = 1000;
	}
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getRnum() {
		return rnum;
	}

	public void setRnum() {
		Random random = new Random();
		this.rnum = random.nextInt(1000)+1;
		this.setEnd(1000);
		this.setStart(1);
		System.out.println("������ 1~1000 ������ �����Դϴ�.");
	}
	
	public void guessAnswer() {		
		System.out.print("������ �Է��ϼ���(���Ḧ ���ϸ� -1�� �Է�) : ");
		this.loopGuess();
	}
	
	private void loopGuess() {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n == -1) {
			System.out.println("������ �����մϴ�.");
			return;
		}
		else if(n == 0) {
			System.out.println("setRnum() �Լ��� ȣ���ϼ���.");
			return;
		}
		
		if(n < start || n > end) {
			System.out.print("������ ��� �����Դϴ�. �ٽ��Է��ϼ��� : ");
		}
		else if(n == rnum) {
			System.out.printf("%d�� �����Դϴ�.%n", n);
			return;
		}
		else if(n < rnum) {
			System.out.printf("������ %d���� ũ�� %d���� �۽��ϴ�. �ٽ� �Է��ϼ��� : ", n, end);
			this.setStart(n);
		}
		else {
			System.out.printf("������ %d���� ũ�� %d���� �۽��ϴ�. �ٽ� �Է��ϼ��� : ", start, n);
			this.setEnd(n);
		}
		this.loopGuess();
	}
}
