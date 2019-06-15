package day60;

public class SmartTV extends TV {

	int channelCount = 200;
	
	@Override
	public void play() {
		System.out.println("playing smart tv");
	}
	
	public static void doTVStatic() {
		System.out.println("do smart tv static");
	}
	
	@Override
	public int getChannelCount() {
		return channelCount;
	}
	
	// this is how compiler see the inherited method 
	  // if no change is made to the method 
	  // you have this method with body that call super class version
	  // That's the reason we got 100 if we did not override the method
	
	
	////  @Override
//  public int getChannleCount() {
//  return super.getChannleCount();
//}
}

