package p524;

public class Diamond {
	private int max;
	
	public Diamond(int max) {
		this.max = max;
	}
	
	public void makeDiamond() {
		int star = 1;
		for (int a = 1; a <= this.max; a++) {
			int blank = Math.abs((this.max-star)/2);
			for(int b = 0; b < blank; b++) {
				System.out.print(" ");
			}
			for (int b = 1; b <= star; b++) {
				System.out.print("*");
			}
			for(int b = 0; b < blank; b++) {
				System.out.print(" ");
			}
			System.out.println();
			if(a < this.max/2+1) 
				star+=2;
			else
				star-=2;
		}
	}
}
