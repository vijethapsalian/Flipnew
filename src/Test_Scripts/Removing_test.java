package Test_Scripts;

import org.testng.annotations.Test;

import Generic.Generic_Test;
import POM.Add2cart_page;
import POM.Cart_page;
import POM.Home_page;
import POM.Increase_Quantity;
import POM.Login_page;

public class Removing_test extends Generic_Test{
	@Test
public void addAndremove() throws InterruptedException

{
	Login_page lp=new Login_page(driver);
		lp.sendUser("7353479043");
		lp.sendPass("topology");
		lp.clickLogin();

		Cart_page cp=new  Cart_page(driver);
		cp.mOver(driver);
		Thread.sleep(3000);
		cp.clickKurtis();
		Thread.sleep(3000);
		cp.addingKurti();
		Thread.sleep(4000);

		Add2cart_page ap=new Add2cart_page(driver);
		ap.sizeClick(driver);
		Thread.sleep(3000);

		ap.addCart();
		Thread.sleep(4000);
	
	Increase_Quantity i=new Increase_Quantity(driver);
	i.clickQuantity(driver, "1");
	Thread.sleep(3000);
	i.clickRemove();
	Thread.sleep(3000);
	i.clickHidden();
	Home_page hp=new Home_page(driver);
	hp.overName(driver);
	hp.clickLogout();
	
	
	
}
	
	
	
}
