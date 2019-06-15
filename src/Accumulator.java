

	public class Accumulator{
		  
		  int sum;
		  
		  public Accumulator(int sum){
		    this.sum=sum;
		  }
		  
		  public int getSum(){
		    return sum;
		  }
		  
		  public void add(int addNum){
		    this.sum +=addNum;
		  }
		  
		  public void remove(int removeNum){
		    this.sum -=removeNum;
		  }
		  
		  @Override
		  public String toString(){
		    return "Sum is :"+ sum;
		  }
		}

