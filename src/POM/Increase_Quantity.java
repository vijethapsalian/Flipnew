package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Scroll_Generic;

public class Increase_Quantity {

@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement addquantity;
@FindBy(xpath="//div[.='Remove']")
private WebElement removebtn;
@FindBy(xpath="(//div[.='Remove'])[1]")
private WebElement hiddenbtn;



public Increase_Quantity(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickQuantity(WebDriver driver,String q) throws InterruptedException
{
	Thread.sleep(8000);
	Scroll_Generic s=new Scroll_Generic();
	s.scrollTo(driver, addquantity);
	addquantity.clear();
	addquantity.sendKeys(q);
}
public void clickRemove()
{
	removebtn.click();
}
public void clickHidden()
{
	hiddenbtn.click();
}
}
