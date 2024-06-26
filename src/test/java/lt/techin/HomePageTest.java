package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BasePageTest {

    HomePage homePage;

    RegistrationPage registrationPage;

    @Test
    void clickCreateAccountButton() {

        homePage = new HomePage(driver);

        homePage.clickCreateAccountButton();

        registrationPage = new RegistrationPage(driver);
        String actualTitle = registrationPage.getTitleRegistration();
        String expectedTitle = "Naujos paskyros sukūrimas";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }
}
