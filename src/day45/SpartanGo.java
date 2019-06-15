package day45;

public class SpartanGo {

	public static void main(String[] args) {

		Spartan s1 = new Spartan();
		System.out.println(s1);
		
		
		String[] certs = {"OCA","PSM","AWS","OCP"};
		
		Spartan s2= new Spartan("coder",8,600,false,certs);
		Spartan s3= new Spartan("coder1",18,400,false,new String[] {"OCA"});
		Spartan s4= new Spartan("coder2",82,800,false,new String[] {});
		Spartan s5= new Spartan("coder3",48,300,true,null);

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

		
	}
	
	

}
