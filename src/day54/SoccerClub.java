package day54;


//HAS-A RELATIONSHIP CAN BE BUILD USING INSTANCE VARIABLE WITHIN REFERCE TYPE
// When SoccerClub define has-a ralatinoship with
// Stadium by putting Stadium as instance variable;
// it has access to everything visible that Stadium obj can have

// what do we call HAS-A RELATIONSHIP TO INHERITANCE FOR IS -A 
//COMPOSITION
public class SoccerClub {
	
	int playerCount;
	String name;
	
	Staduim st;
	
	public int getstadiumCapacity() {
		return st.capacity;
		
		//return st.getCapacity: --->
		//if they are in different package,
		//and it is not inheritted,cuz default is not accessable outside the package;
		//same rule as protected
		//need to use getter and setter to initialize capacity!!
	}
	
	public char getInitial() {
		return name.charAt(0);
	}

	public SoccerClub(int playerCount, String name, Staduim stadium) {
		super();
		this.playerCount = playerCount;
		this.name = name;
		this.st = stadium;
	}

	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount + ", name=" + name + ", stadium=" + st + "]";
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Staduim getStadium() {
		return st;
	}

	public void setStadium(Staduim stadium) {
		this.st = stadium;
	}
	
	
	

}
