package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageFunctionality.Main_Class;

public class Emergency_Contacts extends Main_Class {
	WebDriver d;

	public void emergency_CD() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='My Info']")).click();

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[3]/a/span[2]")).click();
		Thread.sleep(3000);
        //Emergency Contacts
		d.findElement(By.xpath("//*[@id=\"socialMediaDiv\"]/div/a/i")).click();
		d.findElement(By.id("name")).sendKeys("");
		d.findElement(By.id("relationship")).sendKeys("");
		d.findElement(By.id("home_phone")).sendKeys("");
		d.findElement(By.id("mobile_phone")).sendKeys("");
		d.findElement(By.id("office_phone")).sendKeys("");
		d.findElement(By.id("modal-save-button")).click();
		d.findElement(By.xpath("//button[text()='Cancel']")).click();

		Thread.sleep(3000);
		// Attachments
		d.findElement(By.xpath("//a[text()='Add']")).click();
		// Positive Testing
		// Document is upload as < 5MB and in the format of doc
		d.findElement(By.id("filename")).sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\Defect management.docx");

		d.findElement(By.id("description")).sendKeys("This is the file for contact details attachment");
		d.findElement(By.id("modal-save-button")).click();

		// Negative Testing
		d.findElement(By.xpath("//a[text()='Add']")).click();
		// Document is upload as > 5MB and in the format of pdf
		d.findElement(By.id("filename")).sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\For File UpLoad Testing.pdf");

		d.findElement(By.id("description")).sendKeys("This is the file for contact details attachment");
		d.findElement(By.id("modal-save-button")).click();// save button

		String alert = d.getTitle();
		System.out.println(alert);

		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// close

	}

}
