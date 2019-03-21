package p0;

public class PenguinTest {

	public static void main(String[] args) {
		Penguin pororo = new Penguin();

		pororo.setTall(190.5);
		pororo.setWeight(90.7);
		pororo.setColor("Black");
		pororo.setKind("icepenguin");
		
		double height = pororo.getTall();
		System.out.println(height);
		
		double weight = pororo.getWeight();
		System.out.println(weight);
		
		String color = pororo.getColor();
		System.out.println(color);
		
		String kind = pororo.getKind();
		System.out.println(kind);
	}

}
