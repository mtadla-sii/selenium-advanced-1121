package pages;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MenuPage getMenu() {
        return new MenuPage(getDriver());
    }

    public FooterPage getFooter() {
        return new FooterPage(getDriver());
    }


}
