package p5;

import java.util.Arrays;
import java.util.Scanner;

public class TurtleGraphics {
	private int[][] map = new int[20][20]; // 출력에 이용할 배열 
	private boolean pen; // 펜을 내렸는지 올렸는지를 확인
	private int command = 1; // 사용자가 입력한 command를 받을 변수
	private int x = 0; // x좌표
	private int y = 0; // y좌표
	private int direction = 0; // 0:x값 증가, 1:y값증가, 2:x값 감소, 3:y값 감소
	private int spaces; // 이동거리
	
	public TurtleGraphics() {
		this.resetMap(); 
		System.out.printf("Type command%n1:Pen up%n2:Pen down%n3:Turn Right%n4:Turn left"
				+ "%n5,10:Move forward 10 spaces (replace 10 for a different number of spaces)"
				+ "%n6:Display the 20-by-20 array%n9:End of data (sentinel)%n%n");
		while (this.command != 9) {
			this.type_command();
		}
		return;
	}
	
	private void type_command() {
		Scanner sc = new Scanner(System.in);
		String typecommand = sc.next(); // 사용자가 입력한 command 값을 받음
		if(typecommand.length() != 1) { // 5,10 같은 케이스 일때
			String[] array = typecommand.split(","); // ,를 기준으로 나눔
			this.command = Integer.parseInt(array[0]); // 커맨드 저장
			this.spaces = Integer.parseInt(array[1])-1;// 이동거리 저장
		}
		else 
			this.command = Integer.parseInt(typecommand); // 정수로 변환하여 저장
		
		if(this.command == 1) {
			this.pen = false; // 펜을 올림
		}
		else if(this.command == 2) {
			this.resetMap(); // 화면 초기화
			this.x = 0; 
			this.y = 0; // (0,0)으로 초기화
			this.pen = true; // 펜을 내림
		}
		else if(this.command == 3 || this.command == 4) {
			if(this.pen == false) // 펜이 올라가 있으면
				System.out.println("You must do command2(Pen down) before Turn");
			else 
				this.chageDirection(this.command);
		}
		else if(this.command == 5) {
			if(this.pen == false)
				System.out.println("You must do command2(Pen down) before Move");
			else 
				this.moveTurtle();
		}
		else if(this.command == 6) {
			this.displayMap();
		}
		else if(this.command == 9)
			System.out.println("Program End");
		else // 잘못된 커맨드를 입력한 경우
			System.out.println("Type correct command number");
	}
	
	private void displayMap() { // 화면 출력
		for (int[] line : this.map) {
			for (int dot : line) 
				System.out.printf("%s", (dot==1? "*":"0")); // 인자를 확인하며 1이면 * 0이면 0을 출력
			System.out.println(); // 행나눔
		}
		System.out.println();
	}
	
	private void resetMap() { // 화면 출력에 사용할 map배열을 초기화
		for (int[] line : this.map)
			Arrays.fill(line, 0);
		this.pen = false;
	}

	private void chageDirection(int chagedirection) {
		if (chagedirection == 3) { // 오른쪽으로 방향전환
			this.direction = (this.direction+1)%4;
		}
		else { // 왼쪽으로 방향 전환
			if(this.direction == 0)
				this.direction = 3;
			else
				this.direction--;
		}
	}
	
	private void moveTurtle() {
		int toindex; // 거북이가 최종적으로 도착할 인덱스
		if (this.direction == 0) { // 오른쪽으로 이동
			toindex = this.x + this.spaces;
			if (toindex > 19) // 배열을 크기를 벗어나면
				System.out.println("Spaces out of bound");
			else {
				Arrays.fill(map[this.y], this.x, toindex+1, 1); // 처음위치부터 이동한 위치까지 1로 채움
				this.x = toindex; // 이동했으므로 좌표 변경
			}
		}
		else if (this.direction == 1) { // 아래로 이동
			toindex = this.y + this.spaces;
			if (toindex > 19) 
				System.out.println("Spaces out of bound");
			else {
				for (int i=this.y; i <= toindex; i++) {
					map[i][this.x] = 1; 
				}
				this.y = toindex;
			}
		}
		else if (this.direction == 2) { // 왼쪽으로 이동
			toindex = this.x - this.spaces;
			if (toindex < 0)
				System.out.println("Spaces out of bound");
			else {
				Arrays.fill(map[this.y], toindex, this.x, 1);
				this.x = toindex;
			}
		}
		else { // 위로 이동
			toindex = this.y - this.spaces;
			if (toindex < 0) 
				System.out.println("Spaces out of bound");
			else {
				for (int i=this.y; i >= toindex; i--) {
					map[i][this.x] = 1;
				}
				this.y = toindex;
			}
		}
	}
}