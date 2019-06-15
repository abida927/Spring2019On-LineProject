package day51;

	public class SlackUser {
		
		String displayName;
		int timezone;
		String status;
		
		public SlackUser() {

			System.out.println("SlackUser no arg constructor");
			
		}
		
		
		public SlackUser(String displayName, int timezone, String status) {
			this.displayName = displayName;
			this.timezone = timezone;
			this.status = status;
		}


		public void sendMessage(String message) {
			
			System.out.println(displayName+" is sending "+message);
		}
		
		public void changeStatus(String status) {
			this.status=status;
		}
		


}
