package org.Flipkart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	WebElement into = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	into.click();
//	WebElement txtuser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//	txtuser.sendKeys("Cpshajin");
//	WebElement txtpass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
//	txtpass.sendKeys("rrrr7777");
//	WebElement txtlogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//	txtlogin.click();
	
	WebElement search = driver.findElement(By.className("_3704LK"));
	search.sendKeys("iphone");
	WebElement sb = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	sb.click();
	WebElement value1 = driver.findElement(By.className("_4rR01T"));
	String val1=value1.getText();
	System.out.println(val1);
	
	WebElement value2 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 128 GB)']"));
	String val2=value2.getText();
	System.out.println(val2);
	
	WebElement value3 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 128 GB)']"));
	String val3=value3.getText();
	System.out.println(val3);
	
	WebElement value4 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Blue, 64 GB)']"));
	String val4=value4.getText();
	System.out.println(val4);
	
	WebElement value5 = driver.findElement(By.xpath("//div[text()='Apple iPhone XR ((PRODUCT)RED, 64 GB) (Includes EarPods, Power Adapter)']"));
	String val5=value5.getText();
	System.out.println(val5);
	
	WebElement value6 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (White, 128 GB)']"));
	String val6=value6.getText();
	System.out.println(val6);
	
	WebElement value7 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Red, 128 GB)']"));
	String val7=value7.getText();
	System.out.println(val7);
	
}
}
