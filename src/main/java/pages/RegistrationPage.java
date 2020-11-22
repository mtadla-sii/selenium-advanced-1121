package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class RegistrationPage extends BasePage {
    @FindBy(css = "[name='firstname']")
    private WebElement firstNameInput;

    @FindBy(css = "[name='lastname']")
    private WebElement lastNameInput;

    @FindBy(css = ".register-form [name='email']")
    private WebElement emailInput;

    @FindBy(css = "[name='password']")
    private WebElement passwordInput;

    @FindBy(css = ".form-control-submit")
    private WebElement registerUserButton;

    @FindBy(css = "[name='id_gender']")
    private List<WebElement> genderRadioButtons;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage setUserData(User user) {
        firstNameInput.sendKeys(user.getFirstName());
        lastNameInput.sendKeys(user.getLastName());
        emailInput.sendKeys(user.getEmail());
        passwordInput.sendKeys(user.getPassword());
        passwordInput.sendKeys(user.getPassword());
        genderRadioButtons.get(user.getGender()).click();
        return this;
    }

    public HomePage saveUser() {
        registerUserButton.click();
        return new HomePage(getDriver());
    }
}
