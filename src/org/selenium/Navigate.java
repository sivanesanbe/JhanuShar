package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("siva1234");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("1234");
		Thread.sleep(3000);
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(250, 250);
		driver.manage().window().setPosition(p);
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
