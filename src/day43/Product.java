package day43;
//Customer should be able to view 
//Product detail 
//
//noun -->> you can think of a class
//
//Customer 
//	name, password,primemeber
//	viewProduct() browse()
//
//Product 
//  name, rating, price , item
public class Product {
	 private String name; 
	  private float rating; 
	  private double price; 
	  private String productId;
	  
	  public void initializeAllFieldValues(String name, float rating, double price, String porductId) {
		  this. name = name;
		  this. rating = rating;
		  this.price = price;
		  setProductId(porductId);//this is also working 
		System.out.println("name is "+name);
	  }
	  
	  //automatic way to create getter and setter--->>
	  //right click-->source-->generates Getters and Setters
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public float getRating() {
	    return rating;
	  }
	  public void setRating(float rating) {
	    this.rating = rating;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public void setPrice(double price) {
	    this.price = price;
	  }
	  public String getProductId() {
	    return productId;
	  }
	  public void setProductId(String productId) {
	    this.productId = productId;
	  } 
	  
	  
	  
	  
	
}
