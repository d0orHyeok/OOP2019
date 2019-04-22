package p4;

public class Date {
	int month, day, year;
	
	public Date(int month, int day, int year) {
		this.year = year;
		if (month > 12) {
			System.out.println("올바른 month을 입력하세요");
			return;
		}
		this.month = month;
		this.setDay(day);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 12) {
			System.out.println("올바른 month을 입력하세요");
			return;
		}
		if(this.setDay(month) == false) 
			return;
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public boolean setDay(int day) {
		switch(this.month){
		case 2:
			if(year%4 == 0) {
				if(day > 0 && day < 30) {
					this.day = day;
					return true;
				}
			}
			else if (day > 0 && day < 29) {
				this.day = day;
				return true;
			}
			else {
				System.out.println("올바른 day를 입력하세요");
				return false;
			}
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day > 0 && day < 32) {
				this.day = day;
				return true;
			}
			else {
				System.out.println("올바른 day를 입력하세요");
				return false;
			}
		
		case 4: case 6: case 9: case 11:
			if(day > 0 && day < 31) {
				this.day = day;
				return true;
			}
			else {
				System.out.println("올바른 day를 입력하세요");
				return false;
			}
		}
		return false;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(this.setDay(year) == false)
			return;
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println(month+"/"+day+"/"+year);
	}
	
	
}
