package Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Frame_constants{
	public WebDriver driver;
	@BeforeMethod
	public void openApplctn()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get(url);
	}
	
	@AfterMethod
	public void closeApplctn(ITestResult res) throws IOException, InterruptedException
	{
		int status=res.getStatus();
		System.out.println(status);
		 String tcname = res.getName();
		 System.out.println(tcname);
		if(status==2 || status==1)
		{
			Generic_photo.getphoto(driver,tcname);
	}
		driver.quit();
	}

	
	
}
