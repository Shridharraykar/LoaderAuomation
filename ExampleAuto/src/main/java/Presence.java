import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Presence {

    public static WebDriver driver;
    public static boolean IsElementPresent(String locators) {
        try {
            driver.findElement(By.xpath(locators));
            return true;
        } catch (Throwable t) {
            return false;
        }
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");

        driver=new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.out.println(IsElementPresent("//*[@id='searchLanguage']"));

    }
}


