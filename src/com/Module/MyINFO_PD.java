package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageFunctionality.Main_Class;

public class MyINFO_PD extends Main_Class {
	WebDriver d;

	public void pictureupload() throws InterruptedException {
		/*
		 * d.findElement(By.xpath("//span[text()='My Info']")).click();
		 * d.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		 */
		d.findElement(By.xpath("//span[text()='My Info']")).click();
		 
		 d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		 //Positive Testing
		 
		 d.findElement(By.xpath("//*[@id=\"right-side\"]/header/div[1]/nav/div/div/ul[2]/li[1]/img")).click();
		 Thread.sleep(8000);
		 //Picture is uploaded as < 1MB and in JPEG format
		 d.findElement(By.id("employeePicture")).sendKeys("C:\\Users\\sanjais\\Desktop\\cucumber framework.jpeg");
		 d.findElement(By.xpath("//a[text()='Save']")).click();
		
		 //Negative Testing
		 d.findElement(By.xpath("//*[@id=\"right-side\"]/header/div[1]/nav/div/div/ul[2]/li[1]/img")).click();
		 Thread.sleep(8000);
		 //Document is upload as > 5MB and in the format of PDF
		 d.findElement(By.id("employeePicture")).sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\For File UpLoad Testing.pdf");
		 d.findElement(By.xpath("//a[text()='Save']")).click();
		 
		 
		

		WebElement namElement = d.findElement(By.id("firstName"));
		namElement.clear();
		namElement.sendKeys("Catherine");

		WebElement namElement1 = d.findElement(By.id("otherId"));
		namElement1.clear();
		namElement1.sendKeys("License");
		WebElement namElement2 = d.findElement(By.id("employeeId"));
		namElement2.clear();
		namElement2.sendKeys("100245");//
		WebElement Date = d.findElement(By.id("emp_birthday"));
		Date.clear();
		Date.sendKeys("Fri, 24 Mar 1995");
		

		WebElement dropElement = d.findElement(By.className("select-dropdown"));
		dropElement.click();
		Select Gender = new Select(dropElement);
		Gender.selectByValue("Male");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("scrollBy(0,100)");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[text()='Save']")).click();
		String text = d.getTitle();
		System.out.println(text);
		Thread.sleep(5000);
		
		
		  //WebElement menu = d.findElement(By.id("top-menu-trigger"));
		 // menu.click();
		  
		  d.findElement(By.id("stickyHelpButton")).click();
			
		    d.findElement(By.id("query")).sendKeys("Orange HRM Testcase");
		    d.findElement(By.name("submit")).click();
		 

		d.close();

	}

}