package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageFunctionality.Main_Class;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.scaffold.FieldRegistry.Default;

public class Immigration extends Main_Class {
	WebDriver d;

	public void immigration_details() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='My Info']")).click();

		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		menu.click();
		d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[5]/a")).click();
		Thread.sleep(3000);
		// Assigned Immigration
		d.findElement(By.xpath("//*[@id=\"immigrationDiv\"]/div/a/i")).click();
		d.findElement(By.id("number")).sendKeys("CCBB552145");
		d.findElement(By.id("countryCode"));
		Select country = new Select(d.findElement(By.id("countryCode")));
		country.selectByVisibleText("Canada");
		d.findElement(By.id("issuedDate")).sendKeys("Fri, 24 July 2015");
		d.findElement(By.id("expiryDate")).sendKeys("Wed, 09 Mar 2022");
		d.findElement(By.id("reviewDate")).sendKeys(" ");
		d.findElement(By.id("status")).sendKeys("This is Eligible PassPort");
		d.findElement(By.id("notes")).sendKeys("Enjoy Journey");
		d.findElement(By.id("modal-save-button")).click();// save button
		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// close
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

		d.findElement(By.xpath("//*[@id=\"modal-holder\"]/div/div/div/div[3]/button[1]")).click();// close button

	}

}
