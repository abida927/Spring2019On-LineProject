package day60;
//TV as super class 
// int channelCount ;  give default value of 100
// create a instance method play 



//Smart_TV as sub class  

// hide the channelCount field   give default value of 200
// override the play method 
// 
// create main method 
// create Smart_TV object and assign it to TV reference variable 
// try to access what's available 


//add getChannleCount method in super class and return channel count 
//override this method in sub class and call see what will you get 





public class TV {
	
	int channelCount =100;
	
	public void play() {
		System.out.println("playing tv-");
		
	}
	
	public static void doTVStatic() {
		System.out.println("do  tv static");
	}
	public int getChannelCount() {
		return channelCount;
	}

}
