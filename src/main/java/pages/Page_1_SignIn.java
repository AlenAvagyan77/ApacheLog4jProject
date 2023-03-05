package pages;

import BaseLog4jClass.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_1_SignIn extends BasePage {

    public Page_1_SignIn(WebDriver driver) {
        super(driver);
    }
    public static Logger log = LogManager.getLogger();

    @FindBy(id = "nav-link-accountList")
    protected WebElement AccountAndListButton;
    @FindBy(id = "continue")
    protected WebElement ContinueButton;
    @FindBy(name = "rememberMe")
    protected WebElement CheckBoxButton;
    @FindBy(id = "signInSubmit")
    protected WebElement SignInButton;

    public void clickAccountAndListButton() {
        log.info("Called By clickAccountAndListButton method");
        AccountAndListButton.click();
    }


    public void writeLogIn(String InputLogin) {
        log.info("Called By writeLogIn method");
        driver.findElement(By.id("ap_email")).sendKeys(InputLogin);
    }

    public void clickContinueButton() {
        log.info("Called By clickContinueButton method");
        ContinueButton.click();
    }


    public void clickPasswordField(String InputPassword) {
        log.info("Called By clickPasswordField method");
        driver.findElement(By.id("ap_password")).sendKeys(InputPassword);
    }

    public void clickCheckBoxButton() {
        log.info("Called By clickPasswordField method");

        CheckBoxButton.click();
    }

    public void clickSignInButton() {
        log.info("Called By clickCheckBoxButton method");

        SignInButton.click();
    }
}
