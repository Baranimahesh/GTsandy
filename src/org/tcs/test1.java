package org.tcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\sel1\\driver\\chromedriver.exe");
		WebDriver d4=new ChromeDriver();
		d4.get("http://greenstech.in/selenium-course-content.html");
		d4.manage().window().maximize();
		Actions a=new Actions(d4);
		WebElement txtuser = d4.findElement(By.id("heading304"));
	Thread.sleep(2000);
		 a.moveToElement(txtuser).perform();
		// WebElement btnclick = d4.findElement(By.xpath("(//a[@title()='Test papers training in chennai'])[26]"));
		 //a.contextClick(btnclick).perform();
		//Thread.sleep(3000);
		 //Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		//WebElement txtaddress = d4.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
		//Thread.sleep(3000);
		//String text=txtaddress.getText();
		//System.out.println(text);
		//boolean txtstart = text.startsWith("Velmurugan currently focuses ");
		//System.out.println(txtstart);
		//WebElement btncourse = d4.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		//Actions a=new Actions(d4);
		 //a.moveToElement(btncourse).perform();
		 //WebElement btnsoft = d4.findElement(By.xpath("//span[text()='Software Testing (12)']"));
        //a.moveToElement(btnsoft).perform();
        //WebElement btntrain = d4.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
        //a.moveToElement(btntrain).perform();
	}
}