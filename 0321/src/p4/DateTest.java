package p4;

public class DateTest {
	public static void main(String[] args) {
		Date d1 = new Date(2, 29, 2020);
		Date d2 = new Date(12, 31, 2019);
		
		d1.displayDate();
		d1.setYear(2019);
		d1.setDay(7);
		d1.displayDate();
		
		d2.setMonth(14);
		d2.setMonth(11);
		d2.setDay(30);
		d2.displayDate();
	}
}
