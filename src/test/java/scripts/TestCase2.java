package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLab.StepGroup;
import pompages.Skillrarydemo;
import pompages.Skillrarylogin;
import pompages.Testings;
public class TestCase2 extends StepGroup {
	
	@Test
	public void testcase2() throws IOException
	{
		Skillrarylogin l= new Skillrarylogin(driver);
		l.gearsbutton();
		l.demoapp();
		
		Skillrarydemo sd = new Skillrarydemo(driver);
		driverutilies.switchtab(driver);
		driverutilies.dropdown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		
		Testings t= new Testings(driver);
		driverutilies.draganddrop(driver,t.getSelenium() , t.getCart());
		
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		
		driverutilies.scrollbar(driver, x, y);
		t.facebooktab();
	}
	
	

}
