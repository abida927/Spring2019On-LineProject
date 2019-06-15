package day50;

public class StudentUser extends SlackUser{
	
	int groupNumber;
	
	public StudentUser() {
		//super( "Sparten",5,"I can do it");
		//this.groupNumber=groupNumber;
		
		this(0,"Sparten",5,"I can do it");
		
	}
	
	public StudentUser(int groupNumber,String displayName,int timezone,String status) {
		super( displayName,  timezone,  status);
		//		super( "Sparten",5,"I can do it");

//		this.groupNumber= groupNumber;
//		this.displayName=displayName;
//		this.timezone = timezone;
		this.status = status;	
	}

	@Override
	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timezone=" + timezone
				+ ", status=" + status + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	};
	
	
	

}
