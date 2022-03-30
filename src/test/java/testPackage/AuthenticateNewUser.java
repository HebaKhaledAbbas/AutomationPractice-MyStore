package testPackage;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CreateAccountPage; 
import pages.LoginPage;

public class AuthenticateNewUser {
	
	WebDriver driver;
	CreateAccountPage CreateAccount;
	LoginPage loginPage;
	
	
	@Test
	public void AssertThatUserIsLoggedIn() {
		
		loginPage = new LoginPage(driver);
		loginPage.ClickSignin1();
		loginPage.enterEmailToLogin("heba@gmail.com");
		loginPage.enterPasswordToLogin("12345");
		loginPage.ClickSignin();
		
		boolean isUserLoggedIn = loginPage.isMyAccountBtnDisplayed();
		Assert.assertTrue(isUserLoggedIn);
		
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
