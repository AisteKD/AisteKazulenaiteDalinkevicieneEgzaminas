package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "a")
    WebElement createAccountButton;

    @FindBy (css = ".form-signin-heading")
    WebElement registerAccountTitle;

    @FindBy (id = "username")
    WebElement inputUserName;

    @FindBy (id = "password")
    WebElement inputPassword;

    @FindBy (id = "passwordConfirm")
    WebElement inputPasswordConfirm;

    @FindBy (css = "form#userForm > .btn.btn-block.btn-lg.btn-primary")
    WebElement buttonCreate;

    @FindBy (id = "username.errors")
    WebElement errorMessage;



    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public String getTitleRegistration() {
        return registerAccountTitle.getText();
    }

    public void enterFirstName(String firstName) {
        inputUserName.sendKeys(firstName);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void enterPasswordConfirm(String passwordConfirm) {
        inputPasswordConfirm.sendKeys(passwordConfirm);
    }

    public void clickButtonCreate() {
        buttonCreate.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

}
