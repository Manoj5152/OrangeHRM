package PageFunctionality;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout_fun extends Main_Class{
	
	
public void By_Logout() throws InterruptedException, AWTException {
	d.findElement(By.className("material-icons")).click();
	Actions a=new Actions(d);
	WebElement about = d.findElement(By.id("user_menu"));
	a.moveToElement(about).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	d.quit();
	
}
}
