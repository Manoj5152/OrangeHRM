package Listener1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener1.ListenersExample.class)
public class Login_Page {
	@Test
	
	public void OrangeHRM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjais\\Selenium Jar\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://keshavaraj7-trials7401.orangehrmlive.com/");
		 d.manage().window().maximize(); 
		 Thread.sleep(9000);
		  d.findElement(By.id("txtUsername")).sendKeys("Admin");
		  d.findElement(By.id("txtPassword")).sendKeys("d1BnR@1eBX");
		 d.findElement(By.xpath("//button[text()='Login']")).click();
		d.quit();
	}

}
