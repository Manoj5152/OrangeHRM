package com.Module;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageFunctionality.Main_Class;

public class Performance extends Main_Class  {
WebDriver d;
	public void Goals() throws InterruptedException {
		d.findElement(By.xpath("//span[text()='Performance']")).click();
		d.findElement(By.xpath("//*[@id=\"menu_performance_Goals\"]/a/span[2]")).click();
		d.findElement(By.xpath("//*[@id=\"menu_performance_myGoals\"]/span[2]")).click();
		
		d.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//*[@id=\"goalListContainer\"]/div/div/list/div/div[1]/button/span")).click();
		Thread.sleep(5000);
		
		d.findElement(By.id("name_value")).sendKeys("Enable Application as a Bug free");
		d.findElement(By.id("goalPriority"));
		Select Priority = new Select (d.findElement(By.id("goalPriority")));
		Priority.selectByIndex(2);
		
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("scrollBy(0,100)");
		
		
		d.findElement(By.xpath("//span[text()='Submit']")).click();
		
		d.quit();
		
	}
	
	

}
