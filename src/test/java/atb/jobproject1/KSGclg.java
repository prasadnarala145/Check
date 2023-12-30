package atb.jobproject1;

import io.qameta.allure.Owner;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class KSGclg {
    EdgeDriver driver;
    @BeforeTest
    public void openBroser() throws  InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://www.ksgcollege.com/");
        Thread.sleep(10000);
    }
    @Owner("prasad")
    @Test
    public void Test(){
        driver.manage().window().maximize();

   }
    }


