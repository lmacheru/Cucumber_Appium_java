package stepdefinations;

import Common.AndroidPageFac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class AppiumScenario {

private WebDriver driver;

	public AppiumScenario() {
		this.driver = Hook.getDriver();
	}
	AndroidPageFac AndroidElementPage =new AndroidPageFac();

	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
		//Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed());
		AndroidElementPage.AccessibilityTab.isDisplayed();
	}

	@When("^I tap on Accessibility$")
	public void i_tap_on_Accessibility() throws Throwable {
		//driver.findElement(By.xpath("//*[@text='Accessibility']")).click();
		AndroidElementPage.AccessibilityTab.click();
	}

	@Then("^I validate Custom View$")
	public void i_validate_Custom_View() throws Throwable {
	  //Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Custom View']")).isDisplayed(), "Custom View is not displayed");
	  Assert.assertTrue(AndroidElementPage.CustomViewTab.isDisplayed(),"Custom View is not displayed");
	}
}
