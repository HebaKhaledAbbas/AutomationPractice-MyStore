package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckout {

	
	//variables
	WebDriver driver;
	
	//locators
	By ProceedToCheckoutBtn1 = By.xpath("//a[@title='Proceed to checkout']");
	By ProceedToCheckoutBtn2 = By.xpath("//a[@title='Proceed to checkout'][@rel='nofollow']");
	By ProceedToCheckoutBtn3 = By.name("processAddress");
	By ProceedToCheckoutBtn4 = By.name("processCarrier");
	By TermsAndConditionsRadioBtn = By.xpath("//input[@id='cgv']");
	By BankWireBtn = By.className("bankwire");
	By IConfirmMyOrderBtn = By.className("button btn btn-default button-medium");
	
	
	// constructor
		public ProceedToCheckout(WebDriver driver) {
			this.driver = driver;
		}

		
		//Actoins
		public void ClickOnProceed1() {
			driver.findElement(ProceedToCheckoutBtn1).click();
		}
		
		public void ClickOnProceed2() {
			driver.findElement(ProceedToCheckoutBtn2).click();
		}
		public void ClickOnProceed3() {
			driver.findElement(ProceedToCheckoutBtn3).click();
		}
		public void ClickOnProceed4() {
			driver.findElement(ProceedToCheckoutBtn4).click();
		}
		public void ClickOnTermsAndConditionsRadioBtn() {
			driver.findElement(TermsAndConditionsRadioBtn).click();
		}
		public void ClickOnBankWireBtn() {
			driver.findElement(BankWireBtn).click();
		}
		public void ClickOnIConfirmMyOrder() {
			driver.findElement(IConfirmMyOrderBtn).click();
		}
		
}
