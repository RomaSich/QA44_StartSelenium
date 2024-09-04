package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsILCarro {
    WebDriver driver = new ChromeDriver();
    @Test
    public void WebElements()
        {
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        WebElement inputCity = driver.findElement(By.cssSelector("input[formcontrolname ='city']"));
        inputCity.sendKeys("Rehovot, Israel");
            pause(2);
            inputCity.click();
            WebElement inputDates = driver.findElement(By.cssSelector("input[formcontrolname ='dates']"));
            inputDates.sendKeys("9/30/2024-10/20/2024");
            WebElement btnYalla = driver.findElement(By.cssSelector("button[type='submit']"));
            pause(2);
            btnYalla.click();
            WebElement btnLetCar = driver.findElement(By.cssSelector("*[href='let-car-work']"));
            pause(2);
            btnLetCar.click();
            WebElement btnTermsOfUse = driver.findElement(By.cssSelector("*[href='terms-of-use']"));
            pause(2);
            btnTermsOfUse.click();
            WebElement btnSignUp = driver.findElement(By.cssSelector("*[href='registration']"));
            pause(2);
            btnSignUp.click();
            WebElement btnLogin = driver.findElement(By.cssSelector("*[href='login']"));
            pause(2);
            btnLogin.click();
            WebElement btnLOGO = driver.findElement(By.cssSelector("img[alt='logo']"));
            pause(2);
            btnLOGO.click();
            WebElement btnFaccebook = driver.findElement(By.cssSelector("*[href='https://www.facebook.com/']"));
            pause(2);
            btnFaccebook.click();
            driver.navigate().to("https://ilcarro.web.app/search");
            driver.manage().window().maximize();
            WebElement btnTelegram = driver.findElement(By.cssSelector("*[href='https://telegram.org/']"));
            pause(2);
            btnTelegram.click();
            driver.navigate().to("https://ilcarro.web.app/search");
            driver.manage().window().maximize();
            WebElement btnVk = driver.findElement(By.cssSelector("*[href='https://vk.com/']"));
            pause(2);
            btnVk.click();
            driver.navigate().to("https://ilcarro.web.app/search");
            driver.manage().window().maximize();
            WebElement btnInstagram = driver.findElement(By.cssSelector("*[href='https://www.instagram.com/']"));
            pause(2);
            btnInstagram.click();
            driver.navigate().to("https://ilcarro.web.app/search");
            driver.manage().window().maximize();
            WebElement btnSlack = driver.findElement(By.cssSelector("*[href='https://slack.com/']"));
            btnSlack.click();
            pause(4);
            driver.quit();


    }

    private void pause(int time) {
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
