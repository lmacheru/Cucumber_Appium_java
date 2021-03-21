package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Hook;

public class AndroidPageFac extends Hook {

    @FindBy(xpath="//*[@text='Accessibility']")
    public WebElement AccessibilityTab;

    @FindBy(xpath="//*[@text='Custom View']")
    public WebElement CustomViewTab;

    public AndroidPageFac() {
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
}
