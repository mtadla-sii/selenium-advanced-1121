import org.testng.annotations.Test;
import pages.HomePage;

public class RegistrationTest extends TestBase {

    @Test
    public void shouldCreateNewUser() {
        getDriver().get("http://5.196.7.235/");
        HomePage homePage = new HomePage(getDriver());
        homePage.getMenu().openLoginPage();
    }
}
