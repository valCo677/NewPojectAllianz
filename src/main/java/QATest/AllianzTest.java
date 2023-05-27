package QATest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AllianzTest extends TestObject {
    @Test
    public void testComplain(){
        WebDriver driver = super.getDriver();
        driver.get ( "https://www.allianz.bg/bg_BG/landing-pages/online-claims-tracker.html" );
        driver.findElement ( By.xpath ( "//*[@id=\"onetrust-accept-btn-handler\"]" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div/div/div/header/div[2]/div/div/div[1]/div[1]/div/ul/li[1]/div[1]/a/span" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div/div/div/header/div[2]/div/div/div[1]/div[1]/div/ul/li[1]/div[2]/div/a/span[2]" ) ).click ();

    }
}
