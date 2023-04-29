package QATest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class kidsWorld extends TestObject{
    @Test
    public void math(){
        WebDriver driver = super.getDriver ();
        driver.get ( "https://www.kids-world.site/index.html" );
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div[2]/ul/li[2]/a" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/div[3]/div[1]/img" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/div[3]/div[1]/button" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/div[1]/form/div[3]/input" ) ).sendKeys ( "16" );
        driver.findElement ( By.xpath ( "/html/body/div[2]/div[1]/form/div[4]/input" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[2]/div[1]/i/img" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div/div[1]/div[2]/ul/li[1]/a" ) ).click ();
    }

}
