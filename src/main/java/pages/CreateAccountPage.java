package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.hotkey.Keys;

public class CreateAccountPage {
	
	//variables
	private WebDriver driver ;
	private String url = "http://automationpractice.com/index.php";
	
	//locators
	By SignInBtn = By.linkText("Sign in");
	By EmailTxtBox = By.xpath("//input[@name='email_create']");
	By CreateAccountBtn = By.xpath("//button[@id='SubmitCreate']");
	By FirstNameTxtBox = By.xpath("//input[@type='text'][@class='is_required validate form-control'][@id='customer_firstname']");
	By LastNameTxtBox = By.xpath("//input[@type='text'][contains(@class, 'is_required validate form-control')][@id='customer_lastname']");
	By PasswordTxtBox = By.xpath("//input[@type='password']");
	By FirstNameTxtBox2 = By.xpath("//input[@type='text'][@name='firstname']");
	By LastNameTxtBox2 = By.xpath("//input[@type='text'][@name='lastname']");
	By AddressTxtBox = By.xpath("//input[@type='text'][@name='address1']");
	By CityTxtBox = By.xpath("//input[@type='text'][@name='city']");                
	By StateDropList = By.cssSelector("select#id_state.form-control");              
	By PostalCodeTxtBox = By.xpath("//input[@type='text'][@name='postcode']");
	By CountryDropList = By.cssSelector("select#id_country.form-control");
	By MobileTxtBox = By.xpath("//input[@type='text'][@name='phone_mobile']");
	By aliasAddress = By.cssSelector("input#alias.form-control");
	By RegisterBtn = By.linkText("Register");
	
	By MyAccountLabel = By.cssSelector("span.navigation_page");
	
	
	//constructor
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//actions
	public void navigate() {
		driver.navigate().to(url);
	}
	
	public void ClickOnSignIn() {
		driver.findElement(SignInBtn).click();
	}
	
	public void enterEmail (String query) {
		driver.findElement(EmailTxtBox).sendKeys(query + Keys.ENTER);
	}
	
	public void ClickCreateAccount() {
		driver.findElement(CreateAccountBtn).click();
	}
	
	public void enterFirstName(String query) {
		driver.findElement(FirstNameTxtBox).sendKeys(query + Keys.ENTER);
	}
	
	public void enterLastName(String query) {
		driver.findElement(LastNameTxtBox).sendKeys(query + Keys.ENTER);
	}
	
	
	public void enterPassword(String query) {
		driver.findElement(PasswordTxtBox).sendKeys(query + Keys.ENTER);
	}
	
	public void enterFirstName2(String query) {
		driver.findElement(FirstNameTxtBox2).sendKeys(query + Keys.ENTER);
	}
	
	public void enterLastName2(String query) {
		driver.findElement(LastNameTxtBox2).sendKeys(query + Keys.ENTER);
	}
	
	public void enterAddress(String query) {
		driver.findElement(AddressTxtBox).sendKeys(query + Keys.ENTER);
	}
	
	public void enterCity(String query) {
		driver.findElement(CityTxtBox).sendKeys(query + Keys.ENTER);
	}
	
	
	public void selectFromLists(String value) {
		WebElement optionlist = driver.findElement(StateDropList);
		Select selectOption = new Select(optionlist);
		selectOption.selectByVisibleText(value);
	}
	
	public void enterPostalCode(String query) {
		driver.findElement(PostalCodeTxtBox).sendKeys(query + Keys.ENTER);
	}
	
	public void selectFromList2(String value) {
		WebElement optionlist = driver.findElement(CountryDropList);
		Select selectOption = new Select(optionlist);
		selectOption.selectByVisibleText(value);
	}
	
	
	public void enterMobile(String query) {
		driver.findElement(MobileTxtBox).sendKeys(query + Keys.ENTER);
		}
	
	public void enterAliaAddress(String query) {
		driver.findElement(aliasAddress).clear();
		driver.findElement(aliasAddress).sendKeys(query + Keys.ENTER);
	}
	
	public void ClickRegisterBtn() {
		driver.findElement(RegisterBtn).click();
	}
	
	public boolean isMyAccountLabelIsDisplayed() {
		return driver.findElement(MyAccountLabel).isDisplayed();
	}
}
