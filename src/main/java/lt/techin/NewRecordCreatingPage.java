package lt.techin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewRecordCreatingPage extends BasePage {

//    public NewRecordCreating(WebDriver driver) {
//        super(driver);
//    }

    public NewRecordCreatingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.inputNumber1 = driver.findElement(By.xpath("//*[@id=\"sk1\"]"));
        this.inputNumber2 = driver.findElement(By.xpath("//*[@id=\"sk2\"]"));
        this.buttonPlusAction = driver.findElement(By.xpath("//*[@id=\"number\"]/select/option[1]"));
        this.calculateButton = driver.findElement(By.xpath("//*[@id=\"number\"]/input[3]"));
    }

    @FindBy(xpath = "//*[@id=\"sk1\"]")
    WebElement inputNumber1;

    @FindBy(xpath = "//*[@id=\"sk2\"]")
    WebElement inputNumber2;

    @FindBy(xpath = "//*[@id=\"number\"]/select/option[1]")
    WebElement buttonPlusAction;

    @FindBy(xpath = "//*[@id=\"number\"]/input[3]")
    WebElement calculateButton;

    @FindBy(css = "h4")
    WebElement calculationCombinationResult;

    @FindBy (xpath = "/html/body/nav/div/ul[1]/li/a")
    WebElement performedOperations;


    public String getcalculatorSum(String number1, String number2, String calculationCombinationResult) {
        inputNumber1.sendKeys(number1);
        inputNumber2.sendKeys(number2);
        buttonPlusAction.click();
        calculateButton.click();
        String result = getCalculatedSum(calculationCombinationResult);
        return number1 + " + " + number2 + " = " + result;
    }


    public String calculationCombinationResult() {
        return calculationCombinationResult.getText();
    }

    public void clearInputNumber1(String number1) {
        inputNumber1.clear();
    }

    public void clearInputNumber2(String number2) {
        inputNumber2.clear();
    }


        public String getCalculatedSum(String resultElementId) {
            WebElement calculationCombinationResult = driver.findElement(By.id(resultElementId));
            return wait.until(ExpectedConditions.visibilityOf(calculationCombinationResult)).getText();
        }

    public void clickOperations(){
        performedOperations.click();
    }
    }



