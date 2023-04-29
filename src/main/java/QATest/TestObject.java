package QATest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestObject {
    private WebDriver driver;

    @BeforeSuite

    protected final void setupTestSuite() {
        WebDriverManager.chromedriver ().setup ();
        WebDriverManager.edgedriver ().setup ();
        WebDriverManager.firefoxdriver ().setup ();
    }

    @BeforeMethod
    protected final void setUpTest() {
        this.driver = new FirefoxDriver ();
        this.driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().pageLoadTimeout ( Duration.ofSeconds ( 20 ) );
        driver.manage ().timeouts ().implicitlyWait ( Duration.ofSeconds ( 5 ) );
    }

    @AfterMethod
    protected final void tearDownTest() {
        if (this.driver != null) {
            this.driver.quit ();
        }
    }

    public WebDriver getDriver() {
     return driver;
    }
}


