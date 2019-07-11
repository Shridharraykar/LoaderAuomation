import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestCheckBoxes {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
        driver.manage().window().fullscreen();

        WebElement block= driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
        List<WebElement> Checkboxes=block.findElements(By.name("sports"));
        System.out.println("total number of checkboxes are :" +Checkboxes.size());

                for(WebElement checkbox:Checkboxes){
                checkbox.click();
                }


    }
}