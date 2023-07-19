package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarylogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemotab;
	
	@FindBy(name="q")
	private WebElement searchtab;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement gotab;
	
	public Skillrarylogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbutton() {
		gearstab.click();
	}
	
	public void demoapp()
	{
		skillrarydemotab.click();
	}
	
	public void searchbutton(String course)
	{
		searchtab.sendKeys(course);
	}
	
	public void gobutton()
	{
		gotab.click();
	}

}
