package day45;

import java.util.Arrays;

/*
 * calling a constructor
 * where to call:
 * when object is bing created
 * a constructor can only be called inside another constructor
 * of same class
 * 
 * rules:
 * this(arg..) use "this"keyword with parantethese and
 * pass arguments if needed
 *
 *1,it has to be in first statement of constructor body
 *
 *2, ONL One call(of any constructor) is allowed inside one constructor
 *
 *3, recursive constructor call is not allowed----COMPLILER ERROR!!
 */
public class Spartan {
	String name; 
	  int studyHour; 
	  int horsePower; 
	  boolean tired; 
	  String[] certificates; 
	  
	  public Spartan() {
	   System.out.println("no arg"); 
	   this.name="No name";
	   this.studyHour=5;
	   this.horsePower=320;
	 //  this.certificates=new String[] {"OCA","AWS"};
	  }

	public Spartan(String name, int studyHour) {
		super();
		this.name = name;
		this.studyHour = studyHour;
	}

	public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificates) {
		this.name = name;
		this.studyHour = studyHour;
		this.horsePower = horsePower;
		this.tired = tired;
		this.certificates = certificates;
	}

	
	public String toString() {
		return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired=" + tired
				+ ", certificates=" + Arrays.toString(certificates) + "]";
	}
	 
	////Cretae a constructor that take one arg boolean tired
	//inside this constructor
	//call the constructor that take 5 args
	//to set all your default value
	public Spartan(boolean tired) {
	this("bay", 3, 120, tired, new String[]{"no certs"})	;// becareful when give array value--->>new String[]{};
	//this.tired = tired;
	}
	  
	}


	

