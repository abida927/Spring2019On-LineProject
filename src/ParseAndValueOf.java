
public class ParseAndValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		int num = Integer.parseInt(str);
		System.out.println(num+20);
		
		String d = "12.2";
		Double d1 = Double.valueOf(d);
		System.out.println(d1+66);
		
		int a = 3;
		String a1 = String.valueOf(a);
		System.out.println(a1+20);
		
		double b = 12.2;
		String b1 = String.valueOf(b);
		System.out.println(b+333333333);
			
			
	}

}
