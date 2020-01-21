  package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic.Mouse_over;

public class Cart_page {
	@FindBy(xpath="//span[.='Women']")
	private WebElement womenover;
	
	@FindBy(xpath="(//a[.='Kurtas & Kurtis'])[1]")
	private WebElement kurties;
	
	@FindBy(xpath="(//a[contains(.,'Women Printed')])[1]")
	private WebElement addkurti;
	
	public Cart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void mOver(WebDriver driver)
	{
	Mouse_over mo=new Mouse_over();
	mo.mouseOver(driver, womenover);
	}

	public void clickKurtis() throws InterruptedException
	{
		Thread.sleep(4000);
		kurties.click();
	}

	public void addingKurti() throws InterruptedException
	{
		Thread.sleep(5000);
		addkurti.click();
	}
	
}
