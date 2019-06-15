import java.util.ArrayList;
import java.util.Arrays;

class Main {
//  public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
//  {
//   
//             //Integer i= n;
//	  
//    		 r.removeAll(Integer.valueOf(n));
//    		 return r;
//   
//  }
  
	public static boolean appearsTwice(String target, String sentence) {

		 String[] senArr =sentence.split(" ");
		    int num=0;
		    for(int i =0; i<senArr.length; i++){
		      if(senArr[i].contains(target)){
		        num++;
		      }
		    }
		    if(num==2){
		      return true;
		    }else {
				return false;
	
		    }
			}
	
  public static void main(String[] args) {
  
//    ArrayList<Integer>  arr = new ArrayList<>();
//    Integer[] nums = new Integer[]{1,1,2,3};
//    arr.addAll(Arrays.asList(nums));
//    
//    System.out.print(removeInst(arr,1));
//   
	 System.out.println( Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
  
  }
  }//end main