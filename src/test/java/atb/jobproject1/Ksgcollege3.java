package atb.jobproject1;

import io.qameta.allure.Owner;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class Ksgcollege3 {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver = new EdgeDriver();
        driver.get("https://www.ksgcollege.com/");

    }
    @Owner("prasad")
    @Test
    public void Test(){
        driver.manage().window().maximize();

    }
}
