package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void cssSelector()
    {
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
    }
}
