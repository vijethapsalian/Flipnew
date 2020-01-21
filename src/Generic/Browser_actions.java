package Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;


public class Browser_actions {
	Robot r;

	public void maximize_action(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void minimize_action() 
	{
		
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_N);
		} 
		catch (AWTException e) {
		}
	}	
	
		public void resize_actions(WebDriver driver,int a,int b)
		{
		Dimension d=new Dimension(a,b);
		driver.manage().window().setSize(d);	
		}
		
		public void drag_actions(WebDriver driver,int a,int b)
		{
		Point p=new Point(a,b);
		driver.manage().window().setPosition(p);
		
		}	
	
public void back_actions(WebDriver driver)
{
driver.navigate().back();
}

public void forword_actions(WebDriver driver)
{
driver.navigate().forward();
}

public void refresh_actions(WebDriver driver)
{
driver.navigate().refresh();
}

public void openNewtab()
{
	try {
		r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);	
	} catch (AWTException e) {
		
	}
	
}




}



	
	
	
	
	
	
	
	
