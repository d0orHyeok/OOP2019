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
		System.out.println("정답은 1~1000 사이의 정수입니다.");
	}
	
	public void guessAnswer() {		
		System.out.print("정답을 입력하세요(종료를 원하면 -1을 입력) : ");
		this.loopGuess();
	}
	
	private void loopGuess() {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n == -1) {
			System.out.println("진행을 종료합니다.");
			return;
		}
		else if(n == 0) {
			System.out.println("setRnum() 함수를 호출하세요.");
			return;
		}
		
		if(n < start || n > end) {
			System.out.print("범위를 벗어난 정답입니다. 다시입력하세요 : ");
		}
		else if(n == rnum) {
			System.out.printf("%d는 정답입니다.%n", n);
			return;
		}
		else if(n < rnum) {
			System.out.printf("정답은 %d보다 크고 %d보다 작습니다. 다시 입력하세요 : ", n, end);
			this.setStart(n);
		}
		else {
			System.out.printf("정답은 %d보다 크고 %d보다 작습니다. 다시 입력하세요 : ", start, n);
			this.setEnd(n);
		}
		this.loopGuess();
	}
}
