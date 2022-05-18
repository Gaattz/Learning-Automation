import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class GenNScrnshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new EdgeDriver(); //Tests in Edge
//        WebDriver driver = new ChromeDriver(); //Tests in Chrome
        driver.get("http://qrgenerator.technologychannel.org/");

        WebElement msgbox = driver.findElement(By.id("input"));
        Thread.sleep(3000);
        msgbox.sendKeys("Learning Selenium");
//        msgbox.submit(); This submit button stops the program right here, and it will not take a screenshot.

        Thread.sleep(3000);
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\achhe\\Pictures\\Screenshots\\Selenium\\genshot02.png"));
    }
}
