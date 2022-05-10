package com.Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import PageFunctionality.Main_Class;

public class Contact_Details extends Main_Class {
WebDriver d;
	public void contact_details_ESS() throws InterruptedException {
		
		d.findElement(By.xpath("//span[text()='My Info']")).click();
		 
		 d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		 
		WebElement menu = d.findElement(By.id("top-menu-trigger"));
		 menu.click();
		 
		 d.findElement(By.xpath("//*[@id=\"top-menu-overflow\"]/li[1]/a")).click();
		 Thread.sleep(3000);
		// To Copy
			WebElement address1 = d.findElement(By.id("street1"));
			address1.clear();
			address1.sendKeys("HRC 6 Winnepeg");

			d.findElement(By.id("country_inputfileddiv"));

			Select country = new Select(d.findElement(By.id("country_inputfileddiv")));
			country.selectByIndex(38);

			d.findElement(By.id("emp_oth_email")).sendKeys("abcd123@gmail.com");

			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("scrollby(0,150)");

			d.findElement(By.id("modal-save-button")).click();

			// Positive Testing
			d.findElement(By.xpath("//a[text()='Add']")).click();
			// Document is upload as < 5MB and in the format of doc
			d.findElement(By.id("filename")).sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\Defect management.docx");

			d.findElement(By.id("description")).sendKeys("This is the file for contact details attachment");
			d.findElement(By.id("modal-save-button")).click();

			// Negative Testing
			d.findElement(By.xpath("//a[text()='Add']")).click();
			// Document is upload as > 5MB and in the format of pdf
			d.findElement(By.id("filename")).sendKeys("C:\\Users\\sanjais\\Desktop\\HP Lap\\For File UpLoad Testing.pdf");

			d.findElement(By.id("description")).sendKeys("This is the file for contact details attachment");
			d.findElement(By.id("modal-save-button")).click();

			String alert = d.getTitle();
			System.out.println(alert);
	}
}
