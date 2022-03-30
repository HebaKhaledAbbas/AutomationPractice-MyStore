package testPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.ItemDetailsPage;
import pages.LoginPage;
import pages.ProceedToCheckout;

public class TestHistoryPage {
	
	
	WebDriver driver;
    ItemDetailsPage itemdetailaspage;
    CreateAccountPage CreateAccount;
    ProceedToCheckout proceedtocheckout;
    HomePage homepage;
    LoginPage loginPage;
    
    
    @BeforeClass
  	public void beforeClass() {
  		WebDriverManager.chromedriver().setup();
  		driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		CreateAccount = new CreateAccountPage(driver);
  		CreateAccount.navigate();
  		
  		loginPage = new LoginPage(driver);
		loginPage.ClickSignin1();
		loginPage.enterEmailToLogin("heba@gmail.com");
		loginPage.enterPasswordToLogin("12345");
		loginPage.ClickSignin();
		
  	}

    
    
    @Test
    public void VerifyItemIsAddedToCart() {
    	
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
  
 
  @Test(dependsOnMethods = {"VerifyItemIsAddedToCart"})
  public void VerifyOrderIsPlacedFromHistoryPage () {
	  
	  proceedtocheckout = new ProceedToCheckout(driver);
	  proceedtocheckout.ClickOnProceed1();
	  proceedtocheckout.ClickOnProceed2();
	  proceedtocheckout.ClickOnProceed3();
	  proceedtocheckout.ClickOnProceed4();
	  proceedtocheckout.ClickOnTermsAndConditionsRadioBtn();
	  proceedtocheckout.ClickOnBankWireBtn();
	  proceedtocheckout.ClickOnIConfirmMyOrder();
	  
	  homepage = new HomePage(driver);
	  homepage.ClickOnMyAccount();
	  homepage.ClickOnHistoryBtn();
	  
	  String text = homepage.getTextofOrderReference();
	  Assert.assertNotEquals(text, "");
	  
  }
    
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
