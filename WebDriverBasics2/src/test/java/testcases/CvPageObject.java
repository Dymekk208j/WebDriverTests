package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CvPageObject {
	public CvPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"AboutMeRow\"]/div[1]/img")
	public WebElement imgPortrait;

	@FindBy(xpath = "//*[@id=\"CommercialProjectsRow\"]/div[1]/h6")
	public WebElement CommercialProjectsTitle;	
	
	@FindBy(xpath = "//*[@id=\"NotCommercialProjectsRow\"]/div[1]/h6")
	public WebElement NotCommercialProjectsTitle;
	
	@FindBy(xpath = "//*[@id=\"TechnologiesRow\"]/div[1]/h6")
	public WebElement TechnologiesTitle;
	
	@FindBy(xpath = "//*[@id=\"AchievementsRow\"]/div[1]/h6")
	public WebElement AchievementsTitle;	
}
