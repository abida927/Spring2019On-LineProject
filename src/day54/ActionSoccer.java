package day54;

public class ActionSoccer {

	public static void main(String[] args) {

		Staduim st = new Staduim(10000, "burger");
		SoccerClub Juv= new SoccerClub(11, "Juventus", st);
		
		System.out.println(st);
		
		System.out.println(Juv);
		
		System.out.println(Juv.getstadiumCapacity());
		
		System.out.println(Juv.getInitial());
	}

}
