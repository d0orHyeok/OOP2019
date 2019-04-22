package p2;

import p2.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student account1 = new Student("Jane Green", 2019100001, 93.5);
		Student account2 = new Student("John Blue", 2019103124, 72.75);
		
		System.out.printf("%s's student number is : %d%n",
				account1.getName(), account1.getStudentID());
		System.out.printf("%s's student number is : %d%n",
				account2.getName(), account2.getStudentID());
		
		System.out.printf("%s's letter grade is: %s%n",
				account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",
				account2.getName(), account2.getLetterGrade());
	}
}
