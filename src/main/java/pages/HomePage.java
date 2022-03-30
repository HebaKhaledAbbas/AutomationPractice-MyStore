package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	//variables
	WebDriver driver;
	
	//Locators
	By WomenCategory = By.xpath("//a[@title='Women']");
	By BlousesSubcategory = By.xpath("//a[@title='Blouses']");
	By BlousesWordToAssertOnIt = By.cssSelector("span.cat-name");
	By MyAccountBtn = By.xpath("//a[@title='View my customer account']");
	By HistoryBtn = By.xpath("//a[@title='Orders']");
	By OrderReference = By.className("color-myaccount");

	// constructor
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
	
	
	//Actions
	public void ClickOnWOMENCategory() {
		driver.findElement(WomenCategory).click();
	}
	
	
	public void ClickOnBlousesSubcategory() {
		driver.findElement(BlousesSubcategory).click();
	}
	
	
	public boolean isBlousesWordDisplayed() {
		return driver.findElement(BlousesWordToAssertOnIt).isDisplayed();
	}
	
	
	
	public void ClickOnMyAccount () {
		driver.findElement(MyAccountBtn).click();
	}
	public void ClickOnHistoryBtn () {
		driver.findElement(HistoryBtn).click();
	}
	
	public String getTextofOrderReference() {
		return driver.findElement(OrderReference).getText();
		
	}
	
}
