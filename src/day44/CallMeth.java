package day44;

import java.util.Arrays;

public class CallMeth {

	public static void main(String[] args) {

		MathEquation m1=new MathEquation(120,10,'+');
		MathEquation m2=new MathEquation(110,20,'-');
		MathEquation m3=new MathEquation(140,90,'*');
		//MathEquation m4=new MathEquation(130,30,'/');
		

		//MathEquation[] arr = new MathEquation[] {m1,m2,m3};
		MathEquation[] arr= {m1,m2,m3};
		
		for(MathEquation each : arr) {
			each.Calculate();
		
			//System.out.println(each.getResult());
			
			//System.out.println(each);//cuz we have toString method
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
