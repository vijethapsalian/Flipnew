package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class Login_page {
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement usertbox;

@FindBy(xpath="//input[@type='password']")
private WebElement passtbox;

@FindBy(xpath="(//span[.='Login'])[3]")
private WebElement loginbtn;

public Login_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void sendUser(String user) throws InterruptedException
{Thread.sleep(2000);
	usertbox.sendKeys(user);
}

public void sendPass(String pass)
{
	passtbox.sendKeys(pass);
}

public void clickLogin() throws InterruptedException
{
	Thread.sleep(3000);
	loginbtn.click();
}
	
}
