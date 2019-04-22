package p5;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("SM5", "2018", 5000.0);
		Car c2 = new Car("Tusson", "2016", 3000.0);
		
		System.out.println(c1.getModel() + " "+c1.getPrice()+"$");
		System.out.println(c2.getModel() + " "+c2.getPrice()+"$");
		
		c1.setDiscount(5);
		c2.setDiscount(7);
		
		System.out.println("discount5% "+c1.getPrice());
		System.out.println("discount7% "+c2.getPrice());
	}
}
