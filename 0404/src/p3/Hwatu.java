package p3;

public class Hwatu {
	private final String month;  // ȭ�� ���� ��
	private final String suit;  // ��, ��, ��, ȫ�� ���� �˷���
	
	public Hwatu(String HwatuFace, String HwatuSuit) {
		this.month = HwatuFace;
		this.suit = HwatuSuit;
	}
	
	public String toString() {
		return month + " of " + suit;
	}
}