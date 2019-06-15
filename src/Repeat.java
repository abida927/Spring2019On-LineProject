
public class Repeat {

	public static void main(String[] args) {

		String name = "dogabdog";
        String repeatWords = "";
        
        for(int i =0; i<=name.length()-1; i++) {
                 //"mar"             m 
            if(! repeatWords.contains(name.substring(i, i+1)) ) {
                repeatWords += name.substring(i, i+1);
            }
        }
        System.out.println(repeatWords);
	}

}
