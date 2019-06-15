package replClass;

public class RunAtts {

	public static void main(String[] args) {

		Atts a = new Atts();
		a.amount=1;
		a.color="blue";
		a.name="ball";
		
		System.out.println(a.asString());
	}

}
