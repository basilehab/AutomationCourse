package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public WebDriver driver = new ChromeDriver();

    public void OpenBrowser(String URL) {
        driver.get(URL);
    }
    public void  CloseBrowser()
    {
        driver.quit();
    }
}
