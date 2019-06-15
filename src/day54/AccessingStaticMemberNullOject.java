package day54;

public class AccessingStaticMemberNullOject {

	public static void main(String[] args) {
		
		SoccerFinal s1 = new SoccerFinal();
//		s1.printScore();
//		s1.printCupName();
		
		
		
		
		SoccerFinal s2 = null;//will compile ,but run error;
		//s2.printScore();
		
		//static members does not need an obj to be accessed
				//className.memberName---static way should be used
				//non-staic way works but not encouranged
		s2.printCupName();
		System.out.println(s2.cupName);
	}
}
