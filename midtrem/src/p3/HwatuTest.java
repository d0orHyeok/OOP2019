package p3;

import p3.DeckOfHwatu;

public class HwatuTest {
	public static void main(String[] args) {
		DeckOfHwatu myDeckOfHwatu = new DeckOfHwatu();
		myDeckOfHwatu.shuffle();
		
		Hwatu[] myCard = new Hwatu[7];
		myDeckOfHwatu.getcard(myCard);
		
		System.out.println("분배받은 패는 다음과 같습니다.");
		for(int i = 0; i < myCard.length; i++) {
			System.out.printf("%-19s%n", myCard[i]);
		}
	}
}