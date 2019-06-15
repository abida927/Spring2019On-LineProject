package day40;

public class PhoneFactory {

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.capacity=128;
		iphone.os="IOS";
		iphone.type="Apple";
		
		Phone sumsung = new Phone();
		sumsung.capacity=18;
		sumsung.os="Andriod";
		sumsung.type="SumSumg";
		
		Phone pixel = new Phone();
		pixel.capacity=28;
		pixel.os="Andriod";
		pixel.type="Pixel";
		
		sumsung.ring();
		
		sumsung.dial(5555555L);
		
		
		sumsung.displayPhoneInfo();
		
		System.out.println(iphone.capacity);
		
		iphone.displayType();
		
		


		
	}

}
