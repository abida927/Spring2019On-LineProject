package day49;

public class AudioBook extends Book {

	int audioLength;
	
	public void play() {
		System.out.println("we are playing book of "+author
				+"it is "+audioLength+" hour long");
	}
}
