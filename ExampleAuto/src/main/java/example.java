import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class example{


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
        driver.manage().window().fullscreen();




       // driver.findElement(By.id("identifierId")).sendKeys("meghah2020@gmail.com");

        /*(driver.findElement(By.className("CwaK9")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("whsOnd")).sendKeys("ghgh");
        driver.findElement(By.className("CwaK9")).click();*/

        WebElement dropdown= driver.findElement(By.id("searchLanguage"));
        Select select = new Select(dropdown);
        select.selectByValue("it");



        List<WebElement> value= driver.findElements(By.tagName("option"));

        System.out.println(value.size());
        System.out.println(value.get(7).getText());

        for(int i=0; i<value.size();i++){
            System.out.println(value.get(i).getAttribute("lang"));
        }


        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(" Printing the links");
        System.out.println(links.size());
        for(int i=0;i<links.size();i++){

            System.out.println(links.get(i).getAttribute("href"));
        }

    }

}