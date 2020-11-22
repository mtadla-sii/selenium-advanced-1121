package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class MenuPage extends BasePage {
    @FindBy(css = ".user-info a")
    private WebElement signInButton;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage(){
        signInButton.click();
    }
}
