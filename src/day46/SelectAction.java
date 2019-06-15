package day46;

import java.util.ArrayList;

public class SelectAction {

	public static void main(String[] args) {

		SlackUser u1 = new SlackUser("monica","mon@gmail",28);
		
		SlackUser u2 = new SlackUser("joy","mon@gmail",28);
		
		SlackUser u3 = new SlackUser();
		
		System.out.println(u3);
		System.out.println(u2);
		u1.sendMessage(" to friends ", " let's get together!");
		
//		optionally , 
//		create a ArrayList of SlackUser add all the objetcs 
//		loop through each item and print out 
//		and call sendMessage on each of them 
		
		
		//List<SlackUser> ls = new ArrayList<>(Arrays.asList(u1,u2,u3));
		
		ArrayList<SlackUser> users = new ArrayList<>();
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		for(SlackUser each : users) {
			
			System.out.println(each);
		}
		

	}

}
