import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Frames {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.switchTo().frame("//*[@id=\"iframeResult\"]");

        driver.findElement(By.xpath("/html/body/button")).click();

        driver.switchTo().defaultContent();

        List<WebElement> frame= driver.findElements(By.tagName("iframe"));

        System.out.println(frame.size());

        for(WebElement frames:frame){
            System.out.println(frames.getAttribute("id"));

        }



    }
}
