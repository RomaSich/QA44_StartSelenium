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
            pause(3);
            inputCity.click();
            inputCity.sendKeys("Rehovot, Israel");

//            WebElement inputClick = driver.findElement(By.cssSelector("div class=title-container"));
//            pause(3);
//            inputClick.click();
            WebElement inputDates = driver.findElement(By.cssSelector("input[formcontrolname ='dates']"));
            inputDates.sendKeys("9/30/2024-10/20/2024");
            WebElement btnYalla = driver.findElement(By.cssSelector("button[type='submit']"));
            pause(3);
            btnYalla.click();
            WebElement btnLetCar = driver.findElement(By.cssSelector("*[href='let-car-work']"));
            pause(3);
            btnLetCar.click();
            WebElement btnTermsOfUse = driver.findElement(By.cssSelector("*[href='terms-of-use']"));
            pause(3);
            btnTermsOfUse.click();
            WebElement btnSignUp = driver.findElement(By.cssSelector("*[href='registration']"));
            pause(3);
            btnSignUp.click();
            WebElement btnLogin = driver.findElement(By.cssSelector("*[href='login']"));
            pause(3);
            btnLogin.click();
            WebElement btnLOGO = driver.findElement(By.cssSelector("img[alt='logo']"));
            pause(3);
            btnLOGO.click();
            WebElement btnFaccebook = driver.findElement(By.cssSelector("*[href='https://www.facebook.com/']"));
            pause(3);
            btnFaccebook.click();
           driver.navigate().back();
            WebElement btnTelegram = driver.findElement(By.cssSelector("*[href='https://telegram.org/']"));
            pause(3);
            btnTelegram.click();
            driver.navigate().back();
            WebElement btnVk = driver.findElement(By.cssSelector("*[href='https://vk.com/']"));
            pause(3);
            btnVk.click();
            driver.navigate().back();
            WebElement btnInstagram = driver.findElement(By.cssSelector("*[href='https://www.instagram.com/']"));
            pause(3);
            btnInstagram.click();
            driver.navigate().back();
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
