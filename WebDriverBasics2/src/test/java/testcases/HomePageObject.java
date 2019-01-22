package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	public HomePageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/section[5]/div/div[4]/div/button")
	public WebElement btnMorePorojects;

	@FindBy(xpath = "/html/body/section[4]/div/div[2]/div/button")
	public WebElement btnMoreAboutMe;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div/h2")
	public WebElement Title;
	
	@FindBy(xpath = "/html/body/section[3]/div/div[1]/div/h2")
	public WebElement SubTitle1;

	@FindBy(xpath = "/html/body/section[4]/div/div[1]/div/h2")
	public WebElement SubTitle2;
	
	@FindBy(xpath = "/html/body/section[5]/div/div[1]/div/h2")
	public WebElement SubTitle3;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[1]/div[1]/a[1]")
	public WebElement btnFacebook;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[1]/div[1]/a[2]")
	public WebElement btnGit;
	
	@FindBy(xpath = "/html/body/section[1]/div/div[1]/div[1]/a[3]")
	public WebElement btnLinkedIn;
}
