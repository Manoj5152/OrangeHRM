package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageFunctionality.Main_Class;

public class MyINFO extends Main_Class {
	WebDriver d;

	public void pictureupload() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='My Info']")).click();
		d.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);

		WebElement namElement = d.findElement(By.id("firstName"));
		namElement.clear();

		namElement.sendKeys("Howard");

		WebElement namElement1 = d.findElement(By.id("otherId"));
		namElement1.clear();

		namElement1.sendKeys("License");

		WebElement dropElement = d.findElement(By.xpath("//select[@id='emp_gender']"));
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
		WebElement fileup = d.findElement(By.xpath("//img[@class='circle profile-photo valign tooltipped']"));
		fileup.click();
		Thread.sleep(5000);
		WebElement upload = d.findElement(By.xpath("//input[@id='employeePicture']"));
		upload.sendKeys("C:\\Users\\sanjais\\Desktop\\cucumber framework.jpeg");

		Thread.sleep(2000);

		d.close();

	}

}