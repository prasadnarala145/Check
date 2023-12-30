package atb.jobproject1;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KsgNirf {
    EdgeDriver driver;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://www.ksgcollege.com");
        Thread.sleep(5000);
    }
    @Owner("prasad")
    @Test
    public void Test(){
        driver.manage().window().maximize();
        WebElement NIRF = driver.findElement(By.xpath("//a[contains(text(), 'NIRF')]"));
        NIRF.click();

    }


}



