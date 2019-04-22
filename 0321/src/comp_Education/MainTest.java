package comp_Education;

public class MainTest {
	public static void main(String[] args) {
		Professor p1 = new Professor();
		Assistant a1 = new Assistant();
		Student s1 = new Student();
		
		p1.setName("SBKIm");
		p1.setEmail("sbkim@jejenu.ac.kr");
		p1.setPhonenum(01011111111);
		
		a1.setName("YCKim");
		a1.setEmail("yckim@google.com");
		a1.setTeachclass("java");
		
		s1.setName("JHKim");
		s1.setID(2015104138);
		s1.setEmail("d0or_hyeok@naver.com");
		
		String name1 = p1.getName();
		System.out.println(name1);
		
		String teach = a1.getTeachclass();
		System.out.println(teach);
		
		int id = s1.getID();
		System.out.println(id);
	}
}
