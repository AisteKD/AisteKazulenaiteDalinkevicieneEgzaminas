package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//form//input[1]")
    WebElement inputUserName;

    @FindBy (xpath = "//form//input[2]")
    WebElement inputPassword;

    @FindBy (xpath = "//form//button")
    WebElement buttonSignIn;

    @FindBy (xpath = "//form/div/span[2]")
    WebElement errorMessage;

    public void enterUserName(String username) {
        inputUserName.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickButtonSignIn() {
        buttonSignIn.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }


}
