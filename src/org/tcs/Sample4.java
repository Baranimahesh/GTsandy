package org.tcs;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\sel3\\driver3\\chromedriver.exe");
		
		WebDriver d1=new ChromeDriver();
		d1.get("https://en-gb.facebook.com/");
		d1.manage().window().maximize();
         WebElement btncreate = d1.findElement(By.xpath("(//a[@role='button'])[2]"));
         btncreate.click();
         Thread.sleep(2000);
		WebElement dropYear = d1.findElement(By.name("birthday_year"));
		Select s=new Select(dropYear);
		List<WebElement> drop = s.getOptions();
		for (WebElement Element : drop) {
			String attribute = Element.getAttribute("value");
			System.out.println(attribute);
			
		}
		Select s=new Select(dropYear);
		List<WebElement> drop = s.getOptions();
		for (WebElement Element : drop) {
			String attribute = Element.getAttribute("value");
			System.out.println(attribute);
			
			
		}
		
		
		
		
		
		
		//JavascriptExecutor js=(JavascriptExecutor)d1;
//	 WebElement txtuser = d1.findElement(By.id("email"));
//		txtuser.sendKeys("saatvik");
//		WebElement txtpass = d1.findElement(By.id("pass"));
//		txtpass.sendKeys("java");
//		
//		WebElement btnlogin = d1.findElement(By.name("login"));
//		js.executeScript("arguments[0]", btnlogin);
//		
//		
		
		
		
		
		
		
		
		
		
		

		
		
		//String title=d1.getTitle();
		//System.out.println(title);
		//String currenturl=d1.getCurrentUrl();
		//System.out.println(currenturl);
		
		//WebElement txt=d1.findElement(By.xpath("//input[@data-testid=\"royal_email\"]"));
	  //txt.sendKeys("mahesh");
	  
	  //WebElement txt1=d1.findElement(By.xpath("//input[@data-testid=\"royal_pass\"]"));
	  //txt1.sendKeys("23456");
	}


