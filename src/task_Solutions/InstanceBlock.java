package task_Solutions;

public class InstanceBlock {

	public InstanceBlock() {
		System.out.println("This is Constructor");//3,6(run everytime constructor created
	}

	static int a;
	int b;

	{
		a = 20;
		b = 30;
	}//this instance block didn't run , cuz it has no print statement!
	
	{
		System.out.println("This is instance block");//2,5 (run everytime obj created and before constructor
	}

	static {
		System.out.println("This is static block");//1
	}

	public static void main(String[] args) {

		InstanceBlock obj = new InstanceBlock();
		System.out.println(a);//4--20
		InstanceBlock obj2 = new InstanceBlock();

	}

}
