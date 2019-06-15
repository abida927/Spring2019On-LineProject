package replClass;

public class Carpet {
		 
		 //do not change -- Start
		  public double width,length,unitPrice,totalPrice;
		  public boolean isPersian;
		 //do not change -- End
		 
		 //Add constructors below
		 
		  public Carpet(){
		    width = 300;
		    length =300;
		    unitPrice =0;
		    totalPrice=200;
		    isPersian=false;
		  }
		  
		  public Carpet(double width,double length,double unitPrice,boolean isPersian){
		    this.width = width;
		    this.length = length;
		    this.unitPrice =unitPrice;
		    this.isPersian=isPersian;
		    totalPrice();
		  }
		  
		  public double totalPrice(){
			  
		    if (isPersian==true){
		         totalPrice = (width+length)*unitPrice+200;
		 
		    }else {
		      totalPrice = (width+length)*unitPrice;
		    }
		    
		    return totalPrice;
		  }
		  
		

    public static void main(String[]args) {
    
    	Carpet c = new Carpet();
    	System.out.println(c.totalPrice);
    	
    	Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
    	System.out.println(c2.totalPrice);
    	
    	Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
    	System.out.println(c3.totalPrice);
    }
}
