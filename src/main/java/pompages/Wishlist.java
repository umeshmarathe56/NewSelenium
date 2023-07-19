package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement playtab;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement pausetab;
	
	
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement popup;
	
	public Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	public void playbutton()
	{
		playtab.click();
	}
	
	public void pausebutton()
	{
		pausetab.click();
	}
	
	
	public void popuptab()
	{
		popup.click();
	}
}
