package p2;

public class Student {
	private String name;
	private double average;
	private int studentID;
	
	public Student(String name, int studentID, double average) {
		this.name = name;
		
		this.studentID = studentID;
		
		if(average > 0.0) {
			if(average <= 100.0) {
				this.average = average;
			}
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		if (average > 0.0) {
			if (average <= 100.0)
				this.average = average;
		}
	}	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getLetterGrade() {
		String letterGrade = "";
		
		if (average >= 90) {
			letterGrade = "A";
		}
		else if (average >= 80) {
			letterGrade = "B";
		}
		else if (average >= 70) {
			letterGrade = "C";
		}
		else if (average >= 60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}
}
