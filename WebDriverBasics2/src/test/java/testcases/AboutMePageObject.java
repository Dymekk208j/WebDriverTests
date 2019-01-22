package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutMePageObject {
	public AboutMePageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/section[3]/div/div/div/img")
	public WebElement imgPortrait;

	@FindBy(xpath = "/html/body/section[3]/div/div/div/div/h3")
	public WebElement txtDescriptionTitle;
}
