package TestCase;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SecCase extends TestBase {
    //locators
    By searchBar = By.id("APjFqb");
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Start Session !");
        //open new session
        OpenBrowser("HTTP:www.google.com");
    }
    @AfterMethod
    public void AfterMethod(){
        //open new session
        CloseBrowser();
        System.out.println("Close Session !");
    }
    @Test
    public void TestOne() throws InterruptedException {
        driver.findElement(searchBar).sendKeys("automation Testing");
        Thread.sleep(2000);
    }
}
