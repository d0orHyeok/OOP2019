package p3;

import java.security.SecureRandom;

public class DeckOfHwatu {
	private static final SecureRandom randomNumbers = new SecureRandom();
	private static final int NumOfHwatu = 48;  // È­Åõ´Â ÃÑ 48Àå
	
	private Hwatu[] hwatu = new Hwatu[NumOfHwatu];
	private int currentHwatu;
	
	public DeckOfHwatu() {
		String[] months = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.",
						"Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
		String[] suits = {"Pi", "Ssang_Pi", "Hong_Dan", "Cho_Dan", "Cheong_Dan",
						"Gwang", "Kkeus", "Godori"};
		
		for (int count = 0; count < hwatu.length; count++) {
			if (count < 24) {
				if (count == 11) {
					hwatu[count] = new Hwatu(months[count % 12], suits[1]);
					continue; // ½ÖÇÇ 
				}
				else if (count == 23) {  // ²ý
					hwatu[count] = new Hwatu(months[count % 12], suits[6]);
				}
				hwatu[count] = new Hwatu(months[count % 12], suits[0]); // ÇÇ
			}
			else if (count < 36 && count >= 24) {
				if (count/3 == 8) // È«´Ü
					hwatu[count] = new Hwatu(months[count % 12], suits[2]);
				else if (count%12 == 5 || count%12 == 8 || count%12 == 9) // Ã»´Ü
					hwatu[count] = new Hwatu(months[count % 12], suits[4]);
				else if (count%12 == 10) // ½ÖÇÇ
					hwatu[count] = new Hwatu(months[count % 12], suits[1]);
				else if (count%12 == 7) // °íµµ¸®
					hwatu[count] = new Hwatu(months[count % 12], suits[7]);
				else // ÃÊ´Ü
					hwatu[count] = new Hwatu(months[count % 12], suits[3]);
			}
			else {
				if (count%12 == 3 || count%12 == 1) // °íµµ¸®
					hwatu[count] = new Hwatu(months[count % 12], suits[7]);
				else if (count%12 == 0 || count%12 == 2|| count%12 == 7
						|| count%12 == 10 || count%12 == 11) // ²ý
					hwatu[count] = new Hwatu(months[count % 12], suits[6]);
				else // ±¤
					hwatu[count] = new Hwatu(months[count % 12], suits[5]);
				
			}
		}
	}
	
	public void shuffle() {
		currentHwatu = 0;
		
		for (int first = 0; first < hwatu.length; first++) {
			int second = randomNumbers.nextInt(NumOfHwatu);
			
			Hwatu temp = hwatu[first];
			hwatu[first] = hwatu[second];
			hwatu[second] = temp;
		}
	}
	
	public Hwatu dealHwatu() {
		if(currentHwatu < hwatu.length)
			return hwatu[currentHwatu++];
		else
			return null;
	}
}