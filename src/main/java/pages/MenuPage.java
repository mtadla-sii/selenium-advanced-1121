package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class MenuPage extends BasePage {
    @FindBy(css = ".user-info a[title^='Log']")
    private WebElement signInButton;

    @FindBy(css = ".user-info .account")
    private WebElement userName;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openLoginPage(){
        signInButton.click();
        return new LoginPage(getDriver());
    }

    public String getUserName(){
       return userName.getText();
    }
}
