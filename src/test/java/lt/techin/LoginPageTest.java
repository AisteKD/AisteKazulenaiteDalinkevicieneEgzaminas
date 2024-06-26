package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageTest extends BasePageTest{

    LoginPage loginPage;

    MyAccountPage myAccountPage;

    @Test
    @Tag("Login")
    void fillCorrectUsernameAndPasswordForLogin() {

       loginPage = new LoginPage(driver);
       loginPage.enterUserName("Aistee");
       loginPage.enterPassword("aiste");
       loginPage.clickButtonSignIn();

        myAccountPage = new MyAccountPage(driver);
        String actualTitle = myAccountPage.getTitleSuccessfullyLogin();
        String expectedTitle = "Logout, Aistee";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    @Tag("Login")
    void fillIncorrectUsernameAndPasswordForLogin() {

        loginPage = new LoginPage(driver);
        loginPage.enterUserName("Aistee1");
        loginPage.enterPassword("aiste1");
        loginPage.clickButtonSignIn();

        String errorMessage = loginPage.getErrorMessage();
        String expectedMessage = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        assertEquals(expectedMessage, errorMessage);
    }
    }
