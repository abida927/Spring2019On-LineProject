package day56;


//implementing a interface also building a parent child relationship

//we use "implements" keyword rather than "extends" used by a class
//the class must implements every abstract method
public class OnlineStudent implements Teachalbe {

	@Override
	public void canLearn() {
		System.out.println("can learn by hardwork");
	}
	
	//not compile
	//    void canLearn(){
	//System.out.println("can learn by hardwork");
//}


	@Override
	public void doHomeWork() {

		System.out.println("will do all home work");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Teachalbe.STUDY_HARD);
		
		System.out.println(STUDY_HARD);
		
		OnlineStudent o = new OnlineStudent();
		
		o.canLearn();
		o.doHomeWork();
	}

}
