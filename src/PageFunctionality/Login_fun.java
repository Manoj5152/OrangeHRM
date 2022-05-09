package PageFunctionality;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Login_fun extends Main_Class{
	
	public void Screenshot() throws IOException  {
		
		File file = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File file2 = new File ("C:\\Users\\sanjais\\Pictures\\Screenshots\\DashBoard.png");
		FileUtils.copyFile(file, file2);
		
		
		d.quit();
	}
	}
