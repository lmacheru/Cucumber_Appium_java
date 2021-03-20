package stepdefinations;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.Hook;

public class AppiumTest {
    private WebDriver driver;

    public AppiumTest() {
        this.driver = Hook.getDriver();
    }

    @Given("Nna ka Tester fela")
    public void Test_one_two(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed());

    }
}
