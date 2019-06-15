package replClass;


	public class ParkingMeter1{
		  
		  int timeLeft;
		  int maxTime;
		  
		  public ParkingMeter1(int maxTime){
		    this.maxTime=maxTime;
		  }
		  
		  public boolean add(int x){
		    if(x==25)
		      timeLeft +=30;
		      if(timeLeft<maxTime){
		        return true;
		    }else{
		      return false; 
		    }
		  }
		 
		  
		    public void tick(){	  //my code..
		    if(timeLeft>0){
		      for(int i =0; i<timeLeft; i++){
		        timeLeft -=i;
		      }
		    }
		  }
//		    
//		  public  void tick(){  //ur code
//		    	if(timeLeft>0) {
//		    		this.timeLeft--;
//		    	}
//		    }
		  
		  public boolean isExpired(){  // my code
		    
		    if(timeLeft==0){
		      return true;
		    }else{
		      return false;
		      
		    }
		  }
		  
		  
//		  public boolean isExpired(){ //ur code
//			    //true if the value of timeLeft is equal to 0; false otherwise.
//			    return timeLeft == 0;
//			  }
			
		  
		  
		  
		  
		  
		  
		
}
