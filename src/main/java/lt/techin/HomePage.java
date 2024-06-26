package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "a")
    WebElement createAccountButton;

    @FindBy (xpath = "//form/div/span[1]")
    WebElement logOutSuccessfullyAccountTitle;

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public String getTitleSuccessfullyLogOut() {
        return logOutSuccessfullyAccountTitle.getText();
    }


}
