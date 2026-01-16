import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsXpath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void iLcarroTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");

    WebElement btnlogin = driver.findElement(By
                .xpath("//a[text()='Log in']"));
    btnlogin.click();
    pause(3);

    WebElement fieldEmail = driver.findElement(By
                .xpath("//input[@id='email']"));
        fieldEmail.sendKeys("fedor1@gmail.com");
        pause(3);

    WebElement fieldPassword = driver.findElement(By
                .xpath("//*[@formcontrolname='password']"));
        fieldPassword.sendKeys("Fox3335!");
        pause(3);

        WebElement btnYalla = driver.findElement(By
                .xpath("//button[@type='submit']"));
        btnYalla.click();
        pause(3);

        WebElement btnOk = driver.findElement(By
                .xpath("//button[text()='Ok']"));
        btnOk.click();
        pause(3);

        driver.findElement(By
                .xpath("//a[contains(@href, '/logout')]")).click();
        pause(3);

        driver.navigate().to("https://ilcarro.web.app/search");
        pause(3);

        driver.quit();
    }


    public static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

