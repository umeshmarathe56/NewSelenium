package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLab.StepGroup;
import pompages.CoreJavaPage;
import pompages.Skillrarylogin;
import pompages.Wishlist;

public class TestCase3 extends StepGroup {
	
	@Test
	public void tc3() throws IOException, InterruptedException
	{
	   Skillrarylogin l= new Skillrarylogin(driver);
	   l.searchbutton(pdata.getPropertydata("coursename"));
	   l.gobutton();
	   Thread.sleep(3000);
	   CoreJavaPage c=new CoreJavaPage(driver);
	   c.corejavabutton();
	 
	   Wishlist w= new Wishlist(driver);
	  
	   w.popuptab();
	   driverutilies.switchframe(driver);
	   w.playbutton();
	   Thread.sleep(3000);
	   w.pausebutton();
	  
	}

}
