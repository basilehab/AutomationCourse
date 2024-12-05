package TestCase;

import Base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;


public class FirstCase extends TestBase {
    @BeforeMethod
    public void BeforeMethod(){
        //open new session
        OpenBrowser("HTTP:www.YouTube.com");
    }
    @Test
    public void TestOne(){
    }
}
