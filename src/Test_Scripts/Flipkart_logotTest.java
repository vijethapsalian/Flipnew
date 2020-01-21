package Test_Scripts;

import org.testng.annotations.Test;
import Generic.Generic_Test;
import POM.Home_page;
import POM.Login_page;

public class Flipkart_logotTest extends Generic_Test {
	@Test
public void test_login() throws InterruptedException
{
Login_page lp=new Login_page(driver);
lp.sendUser("7353479043");
lp.sendPass("topology");
lp.clickLogin();

Home_page hp=new Home_page(driver);
hp.overName(driver);
hp.clickLogout();
	
}
}


