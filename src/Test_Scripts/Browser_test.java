package Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic.Browser_actions;
import Generic.Mouse_over;

public class Browser_test {
@Test
public void testBrowser() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares2/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");

Browser_actions b=new Browser_actions();
Thread.sleep(2000);
b.maximize_action(driver);
Thread.sleep(2000);
b.minimize_action();
Thread.sleep(2000);
b.maximize_action(driver);
Thread.sleep(3000);
b.resize_actions(driver, 300, 400);
Thread.sleep(5000);
b.drag_actions(driver, 100, 200);
Thread.sleep(3000);
b.maximize_action(driver);	
Thread.sleep(2000);
Mouse_over a=new Mouse_over();
//a.rightclick(ele);
b.openNewtab();



}
}
