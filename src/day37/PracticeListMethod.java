package day37;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeListMethod {

	//1.ArrayListObject.add();
	//2.ArrayListObject.get();
	//3.ArrayListObject.size();

	
	public static void main(String[] args) {

		ArrayList<Double> priceList = new ArrayList<>();
		
		priceList.add(6.7);
		priceList.add(5.7);
		priceList.add(7.7);
		priceList.add(9.7);
		priceList.add(8.7);
		priceList.add(67.6);
		
		Collections.shuffle(priceList);

		System.out.println(priceList);
		
		for(int i = 0; i <priceList.size(); i++) {
		
		}

		System.out.println("---------------------------");
		
		for(Double eachD : priceList) {
			if(eachD>10)
			System.out.print(eachD);
		}
		
		double sum = 0;
		for(Double eachD : priceList) {
			sum += eachD;         //sum= sum+priceList.get(i);

		}
		System.out.print(sum);

	}
}
