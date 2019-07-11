import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class capturescreenshot {


    public static void main(String[] args) throws InterruptedException, IOException {


        System.setProperty("webdriver.chrome.driver", "/Users/shridharnraykar/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement ele= driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[1]"));

        File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage Img= ImageIO.read(screenshot);
        Point point = ele.getLocation();
       int width= ele.getSize().getWidth();
        int height= ele.getSize().getHeight();

        BufferedImage elementscreenshiot=Img.getSubimage(point.getX(),point.getY(),width,height);
        ImageIO.write(elementscreenshiot,"jpg",screenshot);

        File screenshotlocation= new File(".//screenshot//wikipedialogo.jpg");
        FileUtils.copyFile(screenshot,screenshotlocation);

    }
}
