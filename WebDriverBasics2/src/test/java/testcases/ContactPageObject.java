package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageObject {
	public ContactPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"PhoneNumber\"]")
	public WebElement PhoneNo;	
	
	@FindBy(xpath = "//*[@id=\"Email1\"]")
	public WebElement Email;
	
	@FindBy(xpath = "//*[@id=\"Email2\"]")
	public WebElement Email2;
	
}
