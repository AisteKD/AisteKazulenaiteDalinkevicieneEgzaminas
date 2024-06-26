package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//body/h2")
    WebElement registerSuccessfullyAccountTitle;

    @FindBy (xpath = "//nav/div/ul[2]/a")
    WebElement logoutButton;

    @FindBy (xpath = "//nav//ul[2]/a")
    WebElement loginSuccessfullyTitle;


    public String getTitleSuccessfullyRegisterAccount() {
        return registerSuccessfullyAccountTitle.getText();
    }

    public void clickLogoutButton(){
        logoutButton.click();
    }

    public String getTitleSuccessfullyLogin() {
        return loginSuccessfullyTitle.getText();
    }

}
