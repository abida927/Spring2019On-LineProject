package replClass;

public class Dog extends Animal{

	

	String breed;
	int humanYears;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	public String toString(){
	  return "Name:" + name+"\n"+"Breed:"+breed+"\n"+"Age in calendar years:"+humanYears 
			  +"\n"+"Age in human years:"+humanYears;
	}
	@Override
	public  int getAgeInHumanYears(){
	  if(age<=2){
	    humanYears = age*11;
	  }else{
	    humanYears = 22 + ((age-2) * 5);
	  }
    return humanYears;
  }
  
  public boolean equals( String name, int age, String breed){
	  
	//  Dog d1 = new Dog(name, age, breed);
	 
	 if( this.age==age && this.breed.equals(breed)&& this.name.equals(name) ){
		  return true;
	 }
	  return false;
  }
  

	public static void main(String[] args) {

		Dog d = new Dog("abc",3,"cdf");
		
		System.out.println(d.equals( new Dog("efd",3,"cdf")));

	}

}
