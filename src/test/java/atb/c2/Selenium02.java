package atb.c2;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium02 {
    public static void main(String[]args){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://instagram.com");

    }
}
