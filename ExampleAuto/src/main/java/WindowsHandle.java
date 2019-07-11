import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class WindowsHandle {

    public static WebDriver driver;

    public static void capturescreenshot() throws IOException {


        Date d = new Date();
        String filename= (d.toString().replace(":", "_").replace(" ","_")+ ".jpg");
        File Screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(Screenshot, new File(".//screenshot//"+filename));
    }


    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("------Generating the first window-----");
        Set<String> Winids= driver.getWindowHandles();
        Iterator<String> iterate= Winids.iterator();
        String first_window=iterate.next();
        System.out.println(first_window);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")).click();

        driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();


                System.out.println("----Generating window ids from Second window----");

                Winids = driver.getWindowHandles();
                iterate = Winids.iterator();

                System.out.println(iterate.next()); // first window
                String second_window = iterate.next(); // second window
                System.out.println(second_window);

                driver.switchTo().window(second_window);
              js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
                driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();


                driver.findElement(By.xpath("//*[@id=\"area-header\"]/div/div[2]/div[1]/div[2]/a/img")).click();

                // 3rd window

                System.out.println("----Generating window ids from third window----");

                Winids = driver.getWindowHandles();
                iterate = Winids.iterator();

                System.out.println(iterate.next()); // first window
                System.out.println(iterate.next()); // second window

                String third_window = iterate.next(); //3rd window

		/*while(iterate.hasNext()) {

			iterate.next();
		}*/
                System.out.println(third_window);
                driver.switchTo().window(third_window);

                System.out.println(driver.getTitle().contains("BANK"));


	/*	driver.close(); //3rd window
		driver.switchTo().window(second_window);
		driver.close();*/

	            driver.findElement(By.id("txtName")).sendKeys("shridhar");
                driver.findElement(By.id("txtMobile")).sendKeys("7795169517");
                driver.findElement(By.xpath("//*[@id=\"txtEmailID\"]")).sendKeys("shridhar.raykar@goevive.com");
                driver.findElement(By.xpath("//*[@id=\"ddlCity\"]/option[2]"));

                driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div[3]/ul/li[1]/label")).click();

            driver.findElement(By.id("chkAutho")).click();

        capturescreenshot();


       // System.out.println(driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div[4]/div[3]/div[1]/table/tbody/tr/td/img")).getText());
            }



}


