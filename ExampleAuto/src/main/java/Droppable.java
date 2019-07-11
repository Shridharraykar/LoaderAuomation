
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;


public class Droppable {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
        WebElement dropable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(draggable,400,500).perform();


    }

}
