package replClass;

public class GasTank {
	
		  //WRITE YOUR CODE HERE
		  
		  double amount = 0;
		  double capacity ;
		  
		  public GasTank(double capacity){
		    this.capacity=capacity;
		  }
		   
		   public void addGas(double increaseAmount){
		     //this.amount +=increaseAmount;
		     if((amount+increaseAmount)>capacity){
		       amount=capacity;
		     }else {
		    	 amount +=increaseAmount;
		    	
		     }
		     System.out.println(amount);
		   }

		   public void useGas(double decreaseAmount){
		     this.amount -=decreaseAmount;
		     if(amount<0){
		       amount=0;
		     }
		    // System.out.println(amount);
		   }
		   
		   public boolean isEmpty(){
		     if(amount<=0.1){
		       return true;
		     }
		     return false;
		   }

		    public boolean isFull(){
		      if(amount==(capacity-0.1)){
		        return true;
		      }
		      return false;
		    }
		    
		    public double getGasLevel(){
		      return amount;
		    }
		    
		    public double fillUp(){
		      return (capacity-amount);
		    }
		

	public static void main(String[] args) {

		GasTank g= new GasTank(50);
		
		g.amount=20;
		System.out.println(g.isEmpty());
		g.addGas(40);
		g.useGas(55);
		System.out.println(g.fillUp());
	}

}
