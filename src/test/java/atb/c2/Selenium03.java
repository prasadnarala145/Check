package atb.c2;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;

public class Selenium03 {
    public static void main(String[]args)throws MalformedURLException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com");
        driver.navigate().to("https://instagram.com");
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
