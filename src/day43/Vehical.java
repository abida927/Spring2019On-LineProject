package day43;

public class Vehical {
//	Create a class called Vehicle 
//	with few private fields model , make , speed 
//	create getters and setters for all those private fields 

	private String model;
	private int make;
	private int speed;
	
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
//	create methods : 
//		increaseSpeed : it accepts one parameter increaseBy as int 
//		and increase the speed to new speed. 
//		if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->11->12->13->14->15->
//
	public void increaseSpeed(int increaseSpeed) {
		for (int i = 0; i <= increaseSpeed; i++) {
			//this.speed += i;
			System.out.print(speed + i+"->");
		}
	}

//		decreaseSpeed  : 
//		it accepts one parameter decreaseBy as int 
//		and decrease the speed to new speed. 
//		if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->9->8->7->6->5->
//   
	public void decreaseBy(int decreaseSpeed) {
		for (int i = 0; i <= decreaseSpeed; i++) {
			//this.speed -= i;
			System.out.print(speed + i+"->");
		}
	}

//	this keyword : 
//		is used to address the current object that being worked on 
//		we can use it to address the instance field of the class 
//			this.fieldName 
//		we can also use it to address the instance method of the class 

}
