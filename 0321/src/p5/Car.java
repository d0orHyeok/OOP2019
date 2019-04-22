package p5;

public class Car {
	String model;
	String year;
	double price;
	
	public Car(String model, String year, double price) {
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0.0)		
			this.price = price;
	}
	
	public void setDiscount(int d) {
		if (d <= 0) {
			System.out.println("1이상의 할인률을 입력하시오");
			return;
		}
		if (d > 100) {
			System.out.println("100%가 넘는 할인률을 입력하셨습니다.");
			return;
		}
		this.price = this.price*(100-d)/100;
	}
	
}
