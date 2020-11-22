import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import providers.UserFactory;

public class RegistrationTest extends TestBase {
    User user;
    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage registrationPage;
    String expectedUserName;

    @BeforeMethod
    public void testSetup() {
        getDriver().get("http://5.196.7.235/");
        user = new UserFactory().getRandomUser();
        expectedUserName = user.getFirstName() + " " + user.getLastName();
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
        registrationPage = new RegistrationPage(getDriver());
    }

    @Test
    public void shouldCreateNewUser() {
        homePage.getMenu()
                .openLoginPage();

        loginPage.goToRegistrationPage();

        registrationPage.setUserData(user)
                .saveUser();

        Assert.assertEquals(
                homePage.getMenu()
                        .getUserName(), expectedUserName);
    }

    @Test
    public void shouldCreateNewUser2() {
        Assert.assertEquals(
                homePage.getMenu()
                        .openLoginPage()
                        .goToRegistrationPage()
                        .setUserData(user)
                        .saveUser()
                        .getMenu()
                        .getUserName(), expectedUserName);
    }
}
