package p3;

import p3.DeckOfHwatu;

public class HwatuTest {
	public static void main(String[] args) {
		DeckOfHwatu myDeckOfHwatu = new DeckOfHwatu();
		myDeckOfHwatu.shuffle();
		
		for(int i = 1; i <= 48; i++) {
			System.out.printf("%-19s", myDeckOfHwatu.dealHwatu());
			
			if (i%4 == 0)
				System.out.println();
		}
	}
}