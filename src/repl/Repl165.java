package repl;

public class Repl165 {
	 public static String mergeStrings(String one, String two) {
		   String merge=""; 
		    if(one.length()==two.length()){
		      for(int i =0; i <one.length(); i++){
		       merge+=one.substring(i,i+1)+two.substring(i,i+1); 
		      }
		    }else if(one.length()>two.length()){
		      for(int i =0; i <two.length(); i++){
		       merge+=one.substring(i,i+1)+two.substring(i,i+1); 
		      }
		      merge +=one.substring(two.length());

		    }else if(one.length()<two.length()){
		      for(int i =0; i <one.length(); i++){
		       merge+=one.substring(i,i+1)+two.substring(i,i+1); 
		      }
		      merge =merge + two.substring(one.length());
		  }
		  return merge;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(mergeStrings("fol","ream"));
	}

}
