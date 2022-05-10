package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageFunctionality.Main_Class;

public class Report_to extends Main_Class {
	WebDriver d;
	public void report() throws InterruptedException {
	d.findElement(By.xpath("//span[text()='My Info']")).click();

	d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	WebElement menu = d.findElement(By.id("top-menu-trigger"));
	menu.click();
	d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[7]/a/span[2]")).click();
	Thread.sleep(3000);
	//Negative Testing
	d.findElement(By.name("listField.name")).click(); // actually it won't work 
	
	
	
	
	

}
}