import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class RegistrationTest extends TestBase {

    @Test
    public void shouldCreateNewUser() {
        getDriver().get("http://5.196.7.235/");
        HomePage homePage = new HomePage(getDriver());
        homePage.getMenu().openLoginPage();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goToRegistrationPage();
        // stworzenie page object RegistrationPage
        // wypelnienie forma
    }
}
