package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();
		WebElement java = driver.findElement(By.xpath("//div[@title='Java']"));
		a.moveToElement(java).perform();
		WebElement coreJava = driver.findElement(By.xpath("//span[contains(text(),'Core Java')]"));
		a.moveToElement(coreJava).perform();
		String parId = driver.getWindowHandle();
		a.click().perform();
		driver.switchTo().window(parId);
		driver.navigate().to("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("siva2334");
		a.doubleClick().build().perform();
		a.contextClick().perform();
		
		a.click().perform();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		a.dragAndDrop(source, target).perform();;
		a.clickAndHold(source).moveToElement(target).release().perform();
		
		
		
		
		
		
		
	}

}
