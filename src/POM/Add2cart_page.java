package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Swich_TO;

public class Add2cart_page {
	@FindBy(xpath="//a[.='M']")
	private WebElement size;
	
	@FindBy(xpath="//button[contains(.,'ADD TO CART')]")
	private WebElement tocart;
	
	public Add2cart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sizeClick(WebDriver driver) throws InterruptedException
	{ Swich_TO s=new Swich_TO();
	s.switchTab(driver);
		Thread.sleep(2000);
		size.click();
	}
	
	public void addCart() throws InterruptedException
	{
		Thread.sleep(3000);
		tocart.click();
	}	
}
