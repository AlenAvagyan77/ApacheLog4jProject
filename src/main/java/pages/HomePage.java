package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nav-link-accountList")
    protected WebElement AccountAndListButton;
    protected final String HOME_URL = "https://www.amazon.com";
    protected static Logger log = LogManager.getLogger();

    public void openHomePage() {
        driver.manage().window().maximize();
        driver.get(HOME_URL);
        log.info("Opened Amazon page");
    }
    public void openCorrectPage(){
        try {
            if (!AccountAndListButton.isDisplayed());
        }
        catch (Exception e){
            System.out.println("Opened incorrect page");
            driver.quit();

        }

    }

    public String ActualTitle(){
        return driver.getTitle();

    }
    public String ExpectedTitle(){
        return "Amazon.com. Spend less. Smile more.";
    }

}
