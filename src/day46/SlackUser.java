package day46;
/*
 * WARM UP TASK 1 : 

	Create a class called SlackUser
		private fields  name , email , groupNum
		
		provide getters and setters for above fileds 
		
		create 3 args constructor to set all the field value

		create no arg constructor to set default value 
			by calling 3 args constructor 
			you may set default value to your own info 

		create toString method accept no arg 
			return info about the slack user object 

		create a method called sendMessage
		accept two parameters 
			  channel as string , content as String 
		it just print out User <your name>
				sent message <content> to channel <channel>


	Create another class called SlackAction 
		create few objects , call their methods 
		
			optionally , 
		create a ArrayList of SlackUser add all the objetcs 
		loop through each item and print out 
		and call sendMessage on each of them 
 */

public class SlackUser {
	private String name;
	private String email;
	private int groupNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	
	public SlackUser(String name, String email, int groupNum) {
		this.name = name;
		this.email = email;
		this.groupNum = groupNum;
	}
	public SlackUser() {
		this("bay", "bay@gmial",40);
	}
	
	
	public String toString() {
		return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
	}
	
	public void sendMessage(String channel, String content) {
		
		System.out.println(name+channel+content);
	}
	
	

}
