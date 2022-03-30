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
import pages.ItemDetailsPage;

public class TestAddToCartFunctionality {

	
	WebDriver driver;
	CreateAccountPage CreateAccount;
	HomePage homepage;
	ItemDetailsPage itemdetailaspage;
	
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		CreateAccount = new CreateAccountPage(driver);
		CreateAccount.navigate();
		
	}
	
	@Test
	public void VerifyAddingToCart() {
		
		homepage= new HomePage(driver);
		homepage.ClickOnWOMENCategory();
		homepage.ClickOnBlousesSubcategory();
		
		itemdetailaspage = new ItemDetailsPage(driver);
		itemdetailaspage.ClickOnImg();
    	itemdetailaspage.ClickOnAddToCart();
    	itemdetailaspage.ClickOnCart();
    	
    	boolean itemIsAdded = itemdetailaspage.isItemAddedToCart();
    	Assert.assertTrue(itemIsAdded);
	}
	

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
}
