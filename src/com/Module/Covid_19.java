package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageFunctionality.Main_Class;

public class Covid_19 extends  Main_Class{
	
	WebDriver d;
	public void covid() throws InterruptedException {
	d.findElement(By.xpath("//span[text()='My Info']")).click();

	d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	WebElement menu = d.findElement(By.id("top-menu-trigger"));
	menu.click();
	d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[11]/a")).click();
	Thread.sleep(3000);
	
	WebElement vaccine = d.findElement(By.id("//*[@id=\"40_inputfileddiv\"]/div/input"));
	
			vaccine.click();
			Select dp = new Select(d.findElement(By.id("//*[@id=\"40_inputfileddiv\"]/div/input")));
			dp.selectByValue("Yes");
			d.findElement(By.id("43"));
			d.findElement(By.xpath("//*[@id=\"employeePimTabsDivMuliple\"]/form/div[2]/div/button")).click();
			System.out.println("Vaccination is done");
	
	}
	public void attachment() {
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