import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captcha {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://timesofindia.indiatimes.com/home/poll.cms");
        driver.manage().window().fullscreen();

        driver.findElement(By.id("mathq2")).getText();
        driver.findElement(By.id("mathuserans2")).sendKeys();
    }
}

