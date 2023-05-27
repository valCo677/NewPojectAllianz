package QATest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class  Allianz extends TestObject {


    @Test
    public void AllianzOptions() {
        WebDriver driver = super.getDriver ();
        driver.get ( "https://www.allianz.bg/bg_BG/individuals/car-and-vehicles.html" );
        driver.findElement ( By.xpath ( "//*[@id=\"onetrust-accept-btn-handler\"]" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[2]/div/div/div/header/div[2]/div/div/div[1]/div[1]/div/ul/li[1]/div[1]/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div[1]/div/div/div/div/div/div/div[2]/div[1]/div[2]/div/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div/seed-root/div/pfe-master-page/div[3]/seed-what-happened-page/div/div/div[2]/div/div[1]/seed-claim-card/div/p" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div/seed-root/div/pfe-master-page/div[4]/pfe-nav-buttons-container/div/div[1]/div/div/button/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div/seed-root/div/pfe-master-page/div[3]/seed-help-button/button/div" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div/seed-root/div/pfe-master-page/div[3]/seed-help-button/div/div[1]/nx-icon" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div/seed-root/div/pfe-master-page/div[4]/pfe-nav-buttons-container/div/div[2]/div/div/button/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div/seed-root/div/pfe-master-page/div[4]/pfe-nav-buttons-container/div/div[2]/div/div/button/span" ) ).click ();
    }


    @Test
    public void AllianzFrames() {
        WebDriver driver = super.getDriver ();
        driver.get ( "https://www.allianz.bg/bg_BG/individuals.html" );
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div/div/div/header/div[2]/div/div/div[1]/div[1]/div/ul/li[1]/div[1]/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "//*[@id=\"my-car\"]" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div[3]/div/div/div[1]/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div[3]/div/div/div[2]/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div/div/div/header/div[1]/div/a/div/figure/img" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[2]/div/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div/div/div/header/div[2]/div/div/div[1]/div[1]/div/ul/li[1]/div[1]/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/main/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[2]/div/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div/div/div/header/div[1]/div/a/div/figure/img" ) ).click ();
    }
}






