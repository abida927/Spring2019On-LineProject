package day57;

import java.util.ArrayList;
import java.util.Arrays;

public class ChromeDriver implements WebDriver {

	int screenSize;
	double positionX;
	
	public ChromeDriver(int screenSize, double positionX) {

		this.screenSize=screenSize;
		this.positionX=positionX;
	}
	
	@Override
	public void openBrowser() {

		System.out.println("first time opening web ");
	}

	@Override
	public void navigateTo(String Url) {
		System.out.println("open Google"+Url);
		
	}

	@Override
	public void quit() {

		System.out.println("first time quit web ");

	}

	@Override
	public String findElementByID(int id) {

		System.out.println("find id");
		return "my element";
	}

	@Override
	public ArrayList<String> findElementByTagName(String tagName) {
		
		System.out.println("looking for all tags");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("tag name","tag url"));

		return arrList;
	}

	public static void main(String[] args) {
		
		
		
	}
}
