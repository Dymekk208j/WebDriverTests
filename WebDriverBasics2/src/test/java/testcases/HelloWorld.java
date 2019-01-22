package testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HelloWorld {
	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Install\\chromedriver.exe");
		driver = new ChromeDriver();		
		System.out.println("Begin tests");
		
		System.out.println("Loading home page");
		driver.get("https://damiandziura.pl/");
		Thread.sleep(3000);		
		testHomePage();
		System.out.println("Home page is valid");
		
		System.out.println("Loading projects page");
		driver.get("https://damiandziura.pl/Projects/Projects");	
		Thread.sleep(3000);
		testProjectsPage();
		System.out.println("Home Projects is valid");
		
		System.out.println("Loading AboutMe page");
		driver.get("http://damiandziura.pl/AboutMe/AboutMe");
		Thread.sleep(3000);
		testAboutMePage();
		System.out.println("Home AboutMe is valid");
		
		System.out.println("Loading cv page");
		driver.get("https://damiandziura.pl/Home/Cv");	
		Thread.sleep(3000);
		testCvPage();
		System.out.println("Home cv is valid");
		
		System.out.println("Loading contact page");
		driver.get("https://damiandziura.pl/Contact/Contact");	
		Thread.sleep(3000);
		testContactPage();
		System.out.println("Home contact is valid");
		
		System.out.println("All test passed");
		
	}

	private static void testContactPage() {
		ContactPageObject page = new ContactPageObject(driver);
		System.out.println("Testing contact page is in progress");
		
		String result;
		
		System.out.println("Testing phone no.");
		result = page.PhoneNo.getAttribute("value");		
		Assert.assertEquals("+48 510-075-067", result);
		System.out.println("Phone no. is valid");
		
		System.out.println("Testing email");
		result = page.Email.getAttribute("value");		
		Assert.assertEquals("kontakt@DamianDziura.pl", result);
		System.out.println("Email is valid");
		
		System.out.println("Testing email2");
		result = page.Email2.getAttribute("value");	
		Assert.assertEquals("Dymekk208j@gmail.com", result);
		System.out.println("Email 2 is valid");
	}

	private static void testCvPage() {
		CvPageObject page = new CvPageObject(driver);
		System.out.println("Testing cv page is in progress");
		
		String result;
		
		System.out.println("Testing portrait");
		Dimension dim = page.imgPortrait.getSize();	
		Assert.assertEquals(dim.height, 218);
		Assert.assertEquals(dim.width, 215);
		System.out.println("Portrait is valid");		
		
		System.out.println("Testing CommercialProjectsTitle");
		result = page.CommercialProjectsTitle.getText();		
		Assert.assertEquals("Projekty komercyjne", result);
		System.out.println("CommercialProjectsTitle is valid");
		
		System.out.println("Testing NotCommercialProjectsTitle");
		result = page.NotCommercialProjectsTitle.getText();		
		Assert.assertEquals("Projekty niekomercyjne", result);
		System.out.println("NotCommercialProjectsTitle is valid");
		
		System.out.println("Testing TechnologiesTitle");
		result = page.TechnologiesTitle.getText();		
		Assert.assertEquals("Technologie", result);
		System.out.println("TechnologiesTitle is valid");
		
		System.out.println("Testing AchievementsTitle");
		result = page.AchievementsTitle.getText();		
		Assert.assertEquals("Osiągnięcia", result);
		System.out.println("AchievementsTitle is valid");
		
		
	}

	private static void testAboutMePage() {
		AboutMePageObject page = new AboutMePageObject(driver);
		System.out.println("Testing about me page is in progress");
		
		System.out.println("Testing portrait");
		Dimension result = page.imgPortrait.getSize();	
		Assert.assertEquals(result.height, 218);
		Assert.assertEquals(result.width, 215);
		System.out.println("Portrait is valid");
		
		System.out.println("Testing description title");
		String res = page.txtDescriptionTitle.getText();
		Assert.assertEquals("O mnie", res);
		System.out.println("Description title is valid");
	}

	private static void testProjectsPage() {
		ProjectsPageObject page = new ProjectsPageObject(driver);
		System.out.println("Testing projects page is in progress");
		
		String result;
		
		System.out.println("Testing btnCommercial");
		page.btnCommercial.click();				
		result = page.txtDescription.getText();
		Assert.assertEquals("Moje projekty komercyjne", result);
		System.out.println("btnCommercial is valid");
		
		System.out.println("Testing btnNonCommercial");
		page.btnNonCommercial.click();				
		result = page.txtDescription.getText();
		Assert.assertEquals("Moje projekty niekomercyjne", result);
		System.out.println("btnNonCommercial is valid");
	}

	private static void testHomePage() {
		HomePageObject page = new HomePageObject(driver);
		System.out.println("Testing home page is in progress");
		
		System.out.println("Testing btnMorePorojects");
		String result = page.btnMorePorojects.getText();		
		Assert.assertEquals("Więcej projektów", result);
		System.out.println("btnMorePorojects is valid");
		
		System.out.println("Testing btnMoreAboutMe");
		result = page.btnMoreAboutMe.getText();		
		Assert.assertEquals("Więcej o mnie", result);
		System.out.println("btnMoreAboutMe is valid");
		
		System.out.println("Testing page title");
		result = page.Title.getText();		
		Assert.assertEquals("DAMIAN DZIURA", result);
		System.out.println("Title is valid");
		
		System.out.println("Testing page subtitle 1");
		result = page.SubTitle1.getText();		
		Assert.assertEquals("MOJE UMIEJĘTNOŚCI", result);
		System.out.println("SubTitle1 is valid");
		
		System.out.println("Testing page subtitle 2");
		result = page.SubTitle2.getText();		
		Assert.assertEquals("WITAJ NA MOIM PORTFOLIO!", result);
		System.out.println("SubTitle2 is valid");
		
		System.out.println("Testing page subtitle 3");
		result = page.SubTitle3.getText();		
		Assert.assertEquals("MÓJ OSTATNI PROJEKT:", result);
		System.out.println("SubTitle3 is valid");
		
		System.out.println("Testing facebook button");
		page.btnFacebook.click();
		boolean res = driver.getCurrentUrl().contains("facebook");
		Assert.assertTrue(res);		
		System.out.println("btnFacebook is valid");
		System.out.println("Return to home page");
		driver.get("https://damiandziura2.azurewebsites.net/");		

		System.out.println("Testing github button");
		page.btnGit.click();
		res = driver.getCurrentUrl().contains("github");
		Assert.assertTrue(res);		
		System.out.println("btnGit is valid");
		System.out.println("Return to home page");
		driver.get("https://damiandziura2.azurewebsites.net/");
		
		System.out.println("Testing linkedIn button");
		page.btnLinkedIn.click();
		res = driver.getCurrentUrl().contains("linkedin");
		Assert.assertTrue(res);		
		System.out.println("btnLinkedIn is valid");
		System.out.println("Return to home page");
		driver.get("https://damiandziura2.azurewebsites.net/");
		
		
	}
}
