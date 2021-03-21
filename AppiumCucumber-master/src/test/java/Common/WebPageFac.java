package Common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utility.Hook.driver;

public class WebPageFac {
    @FindBy(name="q")
    public WebElement GoogleSearchBox;


    public WebPageFac() {
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
}
