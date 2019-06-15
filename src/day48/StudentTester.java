package day48;

public class StudentTester {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name="mon";
		s1.setAge(20);;
		s1.studentID="abc123";
		
		Student s2 = new Student();
		s2.name="chan";
		//s2.age=22;
		s2.studentID="abc33";
		
		System.out.println(s1.getAge());
		System.out.println(s1.name);
		System.out.println(s1.studentID);
		
		//System.out.println(s2.age);
		System.out.println(s2.name);
		System.out.println(s2.studentID);

	}

}
