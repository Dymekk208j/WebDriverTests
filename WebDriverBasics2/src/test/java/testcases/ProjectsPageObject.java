package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsPageObject {
	public ProjectsPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/section[3]/div/div[2]/button[1]")
	public WebElement btnCommercial;

	@FindBy(xpath = "/html/body/section[3]/div/div[2]/button[2]")
	public WebElement btnNonCommercial;	
	
	@FindBy(xpath = "/html/body/section[3]/div/div[1]/div/h2")
	public WebElement txtDescription;
	
}
