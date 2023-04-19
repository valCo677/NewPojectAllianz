package QATest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Login {
    private WebDriver driver;



    @BeforeSuite

    protected final void setupTestSuite() {
        WebDriverManager.chromedriver ().setup ();
        WebDriverManager.edgedriver ().setup ();
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

   @DataProvider(name = "getUsers" )
    public Object[][] getUsers() {
        return new Object[][]{ { "valentin_terziev@outlook.com", "37451977v" }, };
    }

   @Test(dataProvider ="getUsers" )
    public void testLogin(String user,String password) {
        driver.get ( "https://www.mobile.bg/pcgi/mobile.cgi" );
        WebElement popUp = driver.findElement ( By.xpath ( "/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p" ) );
        popUp.click ();

        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( 5 ) );
        wait.until ( ExpectedConditions.urlToBe ( "https://www.mobile.bg/pcgi/mobile.cgi" ) );

        WebElement loginLink = driver.findElement ( By.xpath ( "//*[@id=\"mainholder\"]/table[1]/tbody/tr/td/div[2]/div/span/a[1]/strong" ) );
        loginLink.click ();

        WebElement radioButton = driver.findElement ( By.xpath ( "//*[@id=\"mainholder\"]/table[2]/tbody/tr/td/div[2]/div[2]/ul/li[1]/div/form/label[1]/input" ) );
        radioButton.click ();
        WebElement userNameField = driver.findElement ( By.xpath ( "//*[@id=\"mainholder\"]/table[2]/tbody/tr/td/div[2]/div[2]/ul/li[1]/form/input[5]" ) );
        userNameField.sendKeys ( user );
        WebElement passwordField = driver.findElement ( By.xpath ( "//*[@id=\"mainholder\"]/table[2]/tbody/tr/td/div[2]/div[2]/ul/li[1]/form/input[5]" ) );
        passwordField.sendKeys ( password );

        WebElement nachalo = driver.findElement ( By.xpath ( "//*[@id=\"mainholder\"]/div[1]/a[1]" ) );
        nachalo.click ();
        WebElement marka = driver.findElement ( By.xpath ( "//*[@id=\"cat5\"]/select" ) );
        marka.click ();
        WebElement skoda = driver.findElement ( By.xpath ( "//*[@id=\"cat5\"]/select/option[122]" ) );
        skoda.click ();
        WebElement model = driver.findElement (By.xpath ( "//*[@id=\"cat7\"]/select" ));
        model.click ();
        WebElement octavia = driver.findElement (By.xpath ( "//*[@id=\"cat7\"]/select" )  );
        octavia.click ();
        WebElement godina = driver.findElement ( By.xpath ( "//*[@id=\"cat10\"]/select" ) );
        godina.click ();
        WebElement year = driver.findElement ( By.xpath ( "//*[@id=\"cat10\"]/select" ) );
        year.click ();
        WebElement engine = driver.findElement ( By.xpath ( "//*[@id=\"cat12\"]/tbody/tr[2]/td[1]/select" ) );
        engine.click ();
        WebElement diesel = driver.findElement ( By.xpath ( "//*[@id=\"cat12\"]/tbody/tr[2]/td[1]/select" ) );
        diesel.click ();
        WebElement price = driver.findElement ( By.xpath ( "//*[@id=\"blocksrc\"]/form/table/tbody/tr[5]/td[1]/input" ) );
        price.click ();
        WebElement gear = driver.findElement (By.xpath ( "//*[@id=\"cat12\"]/tbody/tr[2]/td[3]/select" ));
        gear.click ();
        WebElement manual = driver.findElement (By.xpath ( "//*[@id=\"cat12\"]/tbody/tr[2]/td[3]/select" ));
        manual.click ();
        WebElement search = driver.findElement ( By.xpath ( "//*[@id=\"button2\"]" ) );
        Assert.assertTrue ( search.isDisplayed () );
        search.click ();
        
        WebElement signOut = driver.findElement (By.xpath ( "//*[@id=\"mainholder\"]/table[1]/tbody/tr/td/div[2]/div/span/a" ));
        signOut.click ();



    }
   @Test
    public void testLogin() {
        driver.get ( "https://dev.bg/company/jobs/manual-qa/" );
        driver.findElement ( By.xpath ( "/html/body/header/nav/div[2]/a[2]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"username\"]" ) ).sendKeys ( "Valentin_Terziev@outlook.com" );
        driver.findElement ( By.xpath ( "//*[@id=\"login-password\"]" ) ).sendKeys ( "37451977vV@" );
        driver.findElement ( By.xpath ( "//*[@id=\"cmplz-cookiebanner-container\"]/div/div[6]/button[1]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"subscriber-login\"]/div[3]/span[2]/input" ) ).click ();

        driver.get ( "https://dev.bg/company/jobs/automation-qa/" );
        WebElement checkBoxRemote = driver.findElement ( By.xpath ( "//*[@id=\"filter-job_location\"]/div[2]/div[2]" ) );
        boolean isSelected = checkBoxRemote.isSelected ();
        if (isSelected == false) {
            checkBoxRemote.click ();
        driver.findElement ( By.xpath ( "//*[@id=\"filter-job_location\"]/div[2]/div[3]" ) ).isSelected ();


        }
    }
   @Test
    public void varnaLux(){
        driver.get ( "https://www.varnalux.com/?whence=" );
        driver.findElement ( By.xpath ( "//*[@id=\"div__header\"]/table/tbody/tr/td/nav/div/div[3]/div[1]/ul/li[3]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"promo_7536\"]/div" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"div__header\"]/table/tbody/tr/td/nav/div/div[3]/div[2]/a[2]" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"opt-qnt\"]/div/button[2]" ) ).click ();
    }
}


















