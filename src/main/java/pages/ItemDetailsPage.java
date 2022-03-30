package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemDetailsPage {
	
	//variables
	WebDriver driver;
	
	//locators
	By BlouseImg = By.xpath("//img[@alt='Blouse']");
	By AddToCartBtn = By.id("add_to_cart");
	By Cart = By.xpath("View my shopping cart");
	By BlouseImgToAssertOnIt = By.xpath("//img[@alt='Blouse'][@width='98']");
	
	
	
	// constructor
		public ItemDetailsPage(WebDriver driver) {
			this.driver = driver;
		}
		
		
		//Actions
		public void ClickOnImg() {
			driver.findElement(BlouseImg).click();
		}
		
		public void ClickOnAddToCart() {
			driver.findElement(AddToCartBtn);
		}
		
		public void ClickOnCart() {
			driver.findElement(Cart);
		}
		
		
		public boolean isItemAddedToCart() {
			return driver.findElement(BlouseImgToAssertOnIt).isDisplayed();
		}
		
		
		
		

}
