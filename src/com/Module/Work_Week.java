package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageFunctionality.Main_Class;

public class Work_Week extends Main_Class{
	WebDriver d;
	public void immigration_details() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='My Info']")).click();

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[6]/a")).click();
		Thread.sleep(3000);
		// Positive Testing
		d.findElement(By.id("1q")).click();// It should not work when clicked
		// Negative Testing
				d.findElement(By.id("1q")).click();// Ensure whether it is working fine
}
}
