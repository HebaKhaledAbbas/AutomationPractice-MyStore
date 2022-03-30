package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//variables
	WebDriver driver;
	
	//locators
	By SignInBtn1 = By.linkText("Sign in");
	By EmailTxtBoxForLogin = By.xpath("//input[@class='is_required validate account_input form-control'][@type='text'][@id='email']");
	By PassTxtBoxForLogin = By.xpath("//input[@class='is_required validate account_input form-control'][@type='password']");
	By SignINBtn = By.xpath("//button[@id='SubmitLogin'][@type='submit'][@class='button btn btn-default button-medium']");
	By MyAccountBtn = By.xpath("//body[@id='my-account']");
	
	
	// constructor
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		
		//Actions
		
		public void ClickSignin1() {
			driver.findElement(SignInBtn1).click();
		}
		public void enterEmailToLogin(String query) {
			driver.findElement(EmailTxtBoxForLogin).sendKeys(query + Keys.ENTER);
		}
		public void enterPasswordToLogin(String query) {
			driver.findElement(PassTxtBoxForLogin).sendKeys(query + Keys.ENTER);
		}
		public void ClickSignin() {
			driver.findElement(SignINBtn).click();
		}
		
		public boolean isMyAccountBtnDisplayed() {
			return driver.findElement(MyAccountBtn).isDisplayed();
		}
		
		
}
