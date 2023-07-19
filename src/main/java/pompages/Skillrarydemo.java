package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarydemo {
	
   @FindBy(xpath="//a[text()='COURSE']")
   private WebElement coursetab;
   
   @FindBy(xpath="//a[text()='Selenium Training']")
   private WebElement seleniumtrainingtab;
   
   @FindBy(xpath="//select[@class='chosen-select']")
   private WebElement coursedd;
   
   public Skillrarydemo(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }

public WebElement getCoursetab() {
	return coursetab;
}
   
   public void seleniumtrainingbutton()
   {
	   seleniumtrainingtab.click();
   }

public WebElement getCoursedd() {
	return coursedd;
}
   
   

}
