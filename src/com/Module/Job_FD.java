package com.Module;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageFunctionality.Main_Class;

public class Job_FD extends Main_Class {
	WebDriver d;
public void FileDownload() {
	
	//Positive Testing
	d.findElement(By.xpath("//span[text()='My Info']")).click();
	 
	 d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	 d.findElement(By.xpath("//*[@id=\"top-menu\"]/li[2]/a")).click();
	 d.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	 
	 d.findElement(By.id("createDocumentButton")).click();
	 
	 d.findElement(By.xpath("//*[@id=\"DocumentExport\"]/tbody/tr[1]/td[2]/ng-include/div/button" )).click();
	 
	 File filelocation = new File("C:\\Users\\sanjais\\Desktop");
	 
	 System.out.println("File is Downloaded");

	 d.findElement(By.xpath("//*[@id=\"documentDownloadModal\"]/div/div[3]/button")).click();
	
	 
	 // Negative Testing
	 d.findElement(By.id("36")).sendKeys("KIC INSURANCE");// user is not able to enter values
	 
	 
	
}
}
