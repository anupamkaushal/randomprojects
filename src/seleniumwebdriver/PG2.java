package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getText();
        System.out.println(tagName);
       
       
}
}