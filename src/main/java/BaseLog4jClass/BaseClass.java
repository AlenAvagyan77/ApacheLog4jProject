package BaseLog4jClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    public static WebDriver driver;
    public static Logger log = LogManager.getLogger();

    @BeforeSuite
    public void setUp() {
        if (driver == null) {
            log.info((Message) null);
        }
    }

    @AfterSuite
    public void tearDown() {
        log.info((Message) null);
        if (driver != null) {
            driver.quit();
        }
    }
}
