package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class NewRecordCreatingTest extends BasePageTest {

    LoginPage loginPage;
    NewRecordCreatingPage newRecordCreatingPage;

    @Test
    void calculateSumResult() {

        loginPage = new LoginPage(driver);
        loginPage.enterUserName("Aistee");
        loginPage.enterPassword("aiste");
        loginPage.clickButtonSignIn();

        newRecordCreatingPage = new NewRecordCreatingPage(driver);
        newRecordCreatingPage.clearInputNumber1(String.valueOf(driver.findElement(By.xpath("//*[@id=\"sk1\"]"))));

        newRecordCreatingPage.clearInputNumber2(String.valueOf(driver.findElement(By.xpath("//*[@id=\"sk2\"]"))));
        newRecordCreatingPage.buttonPlusAction.click();

        String result = newRecordCreatingPage.getcalculatorSum("1", "1", "h4");
        System.out.println("Result: " + result);

//        newRecordCreatingPage.calculateButton.click();

        String calculationCombinationResult = null;
        String actualSum = newRecordCreatingPage.getCalculatedSum(calculationCombinationResult);
        String expectedSum = "1 + 1 = 2";
        Assertions.assertEquals(actualSum, expectedSum);
    }

    @Test
    void clickOperationsPerforms() {
        newRecordCreatingPage = new NewRecordCreatingPage(driver);
        newRecordCreatingPage.clickOperations();
    }
}
