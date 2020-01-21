package Test_Scripts;

import org.testng.annotations.Test;

import Generic.Generic_Test;
import POM.Increase_Quantity;
import POM.Login_page;

public class Quantity_Test extends Generic_Test {
	@Test
	public void addQuantity() throws InterruptedException
	{
	Login_page lp=new Login_page(driver);
	lp.sendUser("7353479043");
	lp.sendPass("topology");
	lp.clickLogin();
	
	Increase_Quantity iq=new Increase_Quantity(driver);
	iq.clickQuantity(driver,"1");
	}
	
}
