package atb.c2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class Seleniumc2 {
    public static void main(String[]args){
        FirefoxOptions FirefoxOptions = new FirefoxOptions();
        FirefoxOptions.addArguments("--Start-maximized");
        FirefoxOptions.addArguments("--new" +"privatewindow" );
       // edgeOptions.addArguments("--window-size= 800,400");
         FirefoxDriver driver=new FirefoxDriver(FirefoxOptions);
        driver.get("https://instagram.com");
        System.out.println(driver.getTitle());
    }
}
