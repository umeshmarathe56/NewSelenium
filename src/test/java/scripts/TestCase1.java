package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLab.StepGroup;
import pompages.Addtocart;
import pompages.Skillrarydemo;
import pompages.Skillrarylogin;

public class TestCase1 extends StepGroup {
	
	@Test
	public void TestCase1()
	{
		Skillrarylogin l= new Skillrarylogin(driver);
		l.gearsbutton();
		l.demoapp();
		
		Skillrarydemo sd= new Skillrarydemo(driver);
		driverutilies.switchtab(driver);
		driverutilies.mouseover(driver, sd.getCoursetab());
		sd.seleniumtrainingbutton();
		
		Addtocart ad= new Addtocart(driver);
		driverutilies.doubleclick(driver, ad.getAddtab());
		
		ad.addtocartbutton();
		driverutilies.alertpopup(driver);
	}

}
