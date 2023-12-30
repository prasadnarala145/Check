package atb.jobproject1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ksgcollege {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver = new EdgeDriver();
        driver.get("https://www.ksgcollege.com/");
    }
    @Owner("prasad")
    @Test
    public void TestNegetive(){
        driver.manage().window().maximize();
        WebElement stafflogin = driver.findElement(By.xpath("//a[text()='Staff Login']"));
        stafflogin.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='exampleInputUsername']"));
        username.sendKeys("prasad144");
        WebElement password =driver.findElement(By.xpath("//input[@id='exampleInputPassword']"));
        password.sendKeys("//input[@id='exampleInputPassword']");
        password.sendKeys("Prasad@45");
        WebElement signin = driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]"));
        signin.click();
      //  driver.close();
    }


    }

