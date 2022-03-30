package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CreateAccountPage;
import pages.HomePage;


public class TestSubCategoryIsSelected {
	
	WebDriver driver;
	HomePage homepage;
	CreateAccountPage CreateAccount;
	
	@Test
	public void AssertOnSelectingSubCategory() {
		
		homepage= new HomePage(driver);
		homepage.ClickOnWOMENCategory();
		homepage.ClickOnBlousesSubcategory();
		
		boolean isBlousesDisplayed = homepage.isBlousesWordDisplayed();
		Assert.assertTrue(isBlousesDisplayed);
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		CreateAccount = new CreateAccountPage(driver);
		CreateAccount.navigate();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	

}
