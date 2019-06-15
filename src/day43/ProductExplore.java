package day43;

public class ProductExplore {

	public static void main(String[] args) {

		Product p1 = new Product();

		p1.initializeAllFieldValues("watch", 4.5f, 113.39, "x123");
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getRating());
		System.out.println(p1.getProductId());

		// 20$ sale is on going, change the value of price;
		p1.setPrice(113.39 - 20);

		String productInfo = "Bag, 4.9, 399.99, gucci12";
		// take above String and turn it into Product Object

		String[] productSplit = productInfo.split(", ");

		String productName = productSplit[0];
		String productId = productSplit[3];
		float productRating = Float.parseFloat(productSplit[1]); //string to Float
		double productPrice = Double.valueOf(productSplit[2]);//String to Double;

	    // creating new Object and call the method we created to set all field values
		Product p2 = new Product();

		p2.initializeAllFieldValues(productName, productRating, productPrice, productId);
		
		
		

	}

}
