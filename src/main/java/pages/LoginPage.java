package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    @FindBy(css = ".no-account a")
    private WebElement goToRegistrationButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage goToRegistrationPage() {
        goToRegistrationButton.click();
        return new RegistrationPage(getDriver());
    }
}
