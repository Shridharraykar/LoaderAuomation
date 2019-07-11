import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableElements {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
        driver.manage().window().fullscreen();

        List<WebElement> rownums=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        System.out.println("Total number of rows:" +rownums.size());
        List<WebElement> colsnum=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
        System.out.println("Total number of cols:" +colsnum.size());


        for(int row=1;row<=rownums.size();row++){
            for(int col=1;col<=colsnum.size();col++){

                System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row+"]/td["+col+"]")).getText());


            }
            System.out.println();

        }
    }
}
