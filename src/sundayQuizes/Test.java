package sundayQuizes;

public class Test {
	public static void main(String[ ] args) {

		char A = 'U';

		Numbers(A);

        String totalNumber = "200" ;

        int Total = Integer.valueOf( totalNumber); 
        int Total1 = Integer.parseInt( totalNumber); 
        
        System.out.println(Total +Total1);

		
		}

		 

		public static void Numbers( int num1) {

		System.out.println("int number: "+num1);

		}

		 

		public static void Numbers( double num1) {

		System.out.println("double number: "+num1);

		}

		 

		public static void Numbers( short  num1) {

		System.out.println("short number: "+num1);

		}

}
