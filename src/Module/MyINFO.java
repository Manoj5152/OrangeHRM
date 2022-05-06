package Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageFunctionality.Main_Class;

public class MyINFO extends Main_Class {
	WebDriver d;
	public void name() throws InterruptedException {

	 d.findElement(By.xpath("//span[text()='My Info']")).click();
	 
		Thread.sleep(12000);
		
		WebElement fileup = d.findElement(By.xpath("//span[text()='Photograph']"));
		Thread.sleep(5000);
		 fileup.sendKeys("C:\\Users\\sanjais\\Desktop\\cucumber framework.jpeg");
		 
		 Thread.sleep(2000);
		 
		 d.findElement(By.xpath("//a[text()='Save']")).click();
		 
		 String text = d.getTitle();
	        System.out.println(text);
	        Thread.sleep(5000);
	        d.close();
	

}
}