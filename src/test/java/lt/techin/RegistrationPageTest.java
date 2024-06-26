package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationPageTest extends BasePageTest{

    HomePage homePage;
    RegistrationPage registrationPage;
    MyAccountPage myAccountPage;

    @Test
    @Tag("Registration")
    void fillSuccessfulRegisterForm() {
        homePage = new HomePage(driver);
        homePage.clickCreateAccountButton();

        registrationPage = new RegistrationPage(driver);

        String name = RandomGenerator.generateRandomUserName();
        registrationPage.enterFirstName(name);

        String pass = RandomGenerator.generateRandomPass();
        registrationPage.enterPassword(pass);

        registrationPage.enterPasswordConfirm(pass);

        registrationPage.clickButtonCreate();

        myAccountPage = new MyAccountPage(driver);
        String actualTitle = myAccountPage.getTitleSuccessfullyRegisterAccount();
        String excpectedTitle = "Galimos operacijos: sudėti, atimti, dauginti, dalinti";
        Assertions.assertEquals(excpectedTitle, actualTitle);

        myAccountPage.clickLogoutButton();

        String actualLogoutTitle = homePage.getTitleSuccessfullyLogOut();
        String expectedLogoutTitle = "Sėkmingai atsijungėte";
        Assertions.assertEquals(expectedLogoutTitle, actualLogoutTitle);
    }

    @Test
    @Tag("Registration")
    void fillIncorrectRegisterForm() {
        homePage = new HomePage(driver);
        homePage.clickCreateAccountButton();

        registrationPage = new RegistrationPage(driver);
        registrationPage.enterFirstName("n.");
        registrationPage.enterPassword("nar");
        registrationPage.enterPasswordConfirm("nar");
        registrationPage.clickButtonCreate();

        String errorMessage = registrationPage.getErrorMessage();
        String expectedMessage = "Privaloma įvesti nuo 3 iki 32 simbolių";
        assertEquals(expectedMessage, errorMessage);
    }
    }