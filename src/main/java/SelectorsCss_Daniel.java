import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();

    @Test
    public void iLcarroTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
        driver.navigate()
                .to("https://ilcarro.web.app/search");
        pause(3);

        WebElement btnLetCarWork = driver.findElement
                (By.cssSelector("a[href='/let-car-work']"));
        btnLetCarWork.click();
        pause(3);

        WebElement btnTermsOfUse = driver.findElement
                (By.cssSelector("a[href='/terms-of-use']"));
        btnTermsOfUse.click();
        pause(3);

        WebElement btnSignUp = driver.findElement
                (By.cssSelector("a[href*='/registration']"));
        btnSignUp.click();
        pause(3);
        
        WebElement btnLogIn = driver.findElement
                (By.cssSelector("a[href*='/login']"));
        btnLogIn.click();
        pause(3);

        driver.navigate().refresh();
        pause(5);
        driver.navigate()
                .to("https://ilcarro.web.app/search");
        pause(5);
        driver.navigate().back();
        driver.quit();
    }

    static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}