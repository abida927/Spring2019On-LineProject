package day60;

public class RunTV {

	public static void main(String[] args) {

      //no matter what's the object, , only reference type decide what's accessible
		
		
	  TV tv1 = new SmartTV();
	  System.out.println(tv1.channelCount);
	  tv1.play();//new SmartTV().play(); 
	    
	    System.out.println( tv1.getChannelCount() );
	    
	    System.out.println(  new SmartTV().getChannelCount()  ) ;
	    
	    tv1.doTVStatic();  //(only reference type matter)-->do tv static.
	    
	}
	
	

}
