package testPackage;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.JsonDataReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CreateAccountPage;

public class TestSignUp {

	WebDriver driver;
	CreateAccountPage CreateAccount;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		CreateAccount = new CreateAccountPage(driver);
		CreateAccount.navigate();
	}

	@Test
	public void assertThatMyAccountLabelIsDisplayed() throws FileNotFoundException, IOException, ParseException {
		
		JsonDataReader jsonReader = new JsonDataReader();
		jsonReader.JsonReader();

		CreateAccount = new CreateAccountPage(driver);
		CreateAccount.ClickOnSignIn();
		CreateAccount.enterEmail("heba3@gmail.com");
		CreateAccount.ClickCreateAccount();
		CreateAccount.enterFirstName(jsonReader.firstname);
		CreateAccount.enterLastName(jsonReader.lastname);
		CreateAccount.enterPassword(jsonReader.password);
		CreateAccount.enterAddress(jsonReader.Address);
		CreateAccount.enterCity(jsonReader.City);
		CreateAccount.selectFromLists("Alaska");
		CreateAccount.enterPostalCode(jsonReader.PostalCode);
		CreateAccount.selectFromList2("United States");
		CreateAccount.enterMobile(jsonReader.Mobile);
		CreateAccount.enterAliaAddress(jsonReader.AliaAddress);
		CreateAccount.ClickRegisterBtn();

		boolean isMyAccountLabelIsDisplayed = CreateAccount.isMyAccountLabelIsDisplayed();
		Assert.assertTrue(isMyAccountLabelIsDisplayed);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
