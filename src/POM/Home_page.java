package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Mouse_over;

public class Home_page {
	@FindBy(xpath="(//div[@class='_2aUbKa'])[1]")
	private WebElement namedrop;

	@FindBy(xpath="//div[.='Logout']")
	private WebElement logoutbtn;

	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void overName(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		Mouse_over mo=new  Mouse_over();
		mo.mouseOver(driver, namedrop);
	}

	public void clickLogout() throws InterruptedException
	{
		Thread.sleep(2000);
		logoutbtn.click();
	}

	
	
	
}
