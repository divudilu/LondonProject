package com.london.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {

		System.out.println("Hello GITHUB Clone London");
		
		
		int z,x,y;
		
		x=2;
		y=2;
		
		z=x+y;
		
		System.out.println(z);

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.co.in");
		
		driver.close();

	}

}
