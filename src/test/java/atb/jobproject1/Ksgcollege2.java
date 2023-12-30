package atb.jobproject1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ksgcollege2 {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://www.ksgcollege.com/");
        Thread.sleep(10000);
    }
    @Owner("prasad")
    @Test
    public void  Test()  {
      driver.manage().window().maximize();
        WebElement Alumin = driver.findElement(By.xpath("//a[@href='Alumni.php']"));
        Alumin.click();
       WebElement Aluminregistration = driver.findElement(By.xpath("//a[contains(text(), 'ALUMNI REGISTRATION')]"));
       Aluminregistration.click();
       WebElement Nameofalumin = driver.findElement(By.cssSelector("input[aria-describedby=\"i2 i3\"][data-initial-value=\"\"]"));
       Nameofalumin.sendKeys("Prasad");
       WebElement male = driver.findElement(By.xpath("//div[@class=\"AB7Lab Id5V1\"]"));
       male.click();
       WebElement DOB = driver.findElement(By.cssSelector("input.whsOnd.zHQkBf[jsname=\"YPqjbf\"][type=\"date\""));
       DOB.sendKeys("01-05-2002");
       WebElement Unmarried =driver.findElement(By.xpath("//span[@class=\"aDTYNe snByac OvPDhc OIC90c\"and text()=\"Unmarried\"]"));
       Unmarried.click();
       WebElement IfMarriedno = driver.findElement(By.cssSelector("input.whsOnd.zHQkBf[jsname=\"YPqjbf\"][aria-labelledby=\"i30\"][aria-describedby=\"i31 i32\"]"));
       IfMarriedno.sendKeys("0");
    }

}
