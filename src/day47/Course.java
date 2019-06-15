package day47;

public class Course {
	
	public static String school;//="cybertek school";	
	int courseId;
	
	//static initilizer block;
	static {
		school ="cybertek school";	
		
		System.out.println("welcome to our school"+school);
		
		System.out.println("let's start our journy");
	}
	
	static {
		System.out.println("does it work?");
	}

//	public static void main(String[] args) {
//		System.out.println(school);
		
		// below is not working cuz it's not static fields!!!
		//System.out.println(courseId);//courseId is intance var!!!
	//}
}
