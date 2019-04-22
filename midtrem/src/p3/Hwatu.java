package p3;

public class Hwatu {
	private final String month;  // È­Åõ ÆÐÀÇ ¿ù
	private final String suit;  // ÇÇ, ±¤, ²ý, È«´Ü µîÀ» ¾Ë·ÁÁÜ
	
	public Hwatu(String HwatuFace, String HwatuSuit) {
		this.month = HwatuFace;
		this.suit = HwatuSuit;
	}
	
	public String toString() {
		return month + " of " + suit;
	}
}