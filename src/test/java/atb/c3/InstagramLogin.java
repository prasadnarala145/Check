package atb.c3;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InstagramLogin {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.get("https://instagram.com/#/login");
    }

    @Owner("Prasad")
    @Test
    public void testPostive() throws InterruptedException {

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
        username.sendKeys("itzz__me__prasad");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Biryaniluv");
        WebElement loginButton = driver.findElement(By.xpath("//button/div[contains(text(),'Log in')]"));
        loginButton.click();


    }
}
