package p5;

import java.util.Arrays;
import java.util.Scanner;

public class TurtleGraphics {
	private int[][] map = new int[20][20]; // ��¿� �̿��� �迭 
	private boolean pen; // ���� ���ȴ��� �÷ȴ����� Ȯ��
	private int command = 1; // ����ڰ� �Է��� command�� ���� ����
	private int x = 0; // x��ǥ
	private int y = 0; // y��ǥ
	private int direction = 0; // 0:x�� ����, 1:y������, 2:x�� ����, 3:y�� ����
	private int spaces; // �̵��Ÿ�
	
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
		String typecommand = sc.next(); // ����ڰ� �Է��� command ���� ����
		if(typecommand.length() != 1) { // 5,10 ���� ���̽� �϶�
			String[] array = typecommand.split(","); // ,�� �������� ����
			this.command = Integer.parseInt(array[0]); // Ŀ�ǵ� ����
			this.spaces = Integer.parseInt(array[1])-1;// �̵��Ÿ� ����
		}
		else 
			this.command = Integer.parseInt(typecommand); // ������ ��ȯ�Ͽ� ����
		
		if(this.command == 1) {
			this.pen = false; // ���� �ø�
		}
		else if(this.command == 2) {
			this.resetMap(); // ȭ�� �ʱ�ȭ
			this.x = 0; 
			this.y = 0; // (0,0)���� �ʱ�ȭ
			this.pen = true; // ���� ����
		}
		else if(this.command == 3 || this.command == 4) {
			if(this.pen == false) // ���� �ö� ������
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
		else // �߸��� Ŀ�ǵ带 �Է��� ���
			System.out.println("Type correct command number");
	}
	
	private void displayMap() { // ȭ�� ���
		for (int[] line : this.map) {
			for (int dot : line) 
				System.out.printf("%s", (dot==1? "*":"0")); // ���ڸ� Ȯ���ϸ� 1�̸� * 0�̸� 0�� ���
			System.out.println(); // �೪��
		}
		System.out.println();
	}
	
	private void resetMap() { // ȭ�� ��¿� ����� map�迭�� �ʱ�ȭ
		for (int[] line : this.map)
			Arrays.fill(line, 0);
		this.pen = false;
	}

	private void chageDirection(int chagedirection) {
		if (chagedirection == 3) { // ���������� ������ȯ
			this.direction = (this.direction+1)%4;
		}
		else { // �������� ���� ��ȯ
			if(this.direction == 0)
				this.direction = 3;
			else
				this.direction--;
		}
	}
	
	private void moveTurtle() {
		int toindex; // �ź��̰� ���������� ������ �ε���
		if (this.direction == 0) { // ���������� �̵�
			toindex = this.x + this.spaces;
			if (toindex > 19) // �迭�� ũ�⸦ �����
				System.out.println("Spaces out of bound");
			else {
				Arrays.fill(map[this.y], this.x, toindex+1, 1); // ó����ġ���� �̵��� ��ġ���� 1�� ä��
				this.x = toindex; // �̵������Ƿ� ��ǥ ����
			}
		}
		else if (this.direction == 1) { // �Ʒ��� �̵�
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
		else if (this.direction == 2) { // �������� �̵�
			toindex = this.x - this.spaces;
			if (toindex < 0)
				System.out.println("Spaces out of bound");
			else {
				Arrays.fill(map[this.y], toindex, this.x, 1);
				this.x = toindex;
			}
		}
		else { // ���� �̵�
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