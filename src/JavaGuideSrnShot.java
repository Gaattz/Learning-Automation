import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class JavaGuideSrnShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://javaguide.technologychannel.org/");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        LocalDateTime datetime = LocalDateTime.now();
        FileUtils.copyFile(src,new File("C:\\Users\\achhe\\Pictures\\Screenshots\\Selenium\\website.png"));
//        FileUtils.copyFile(src,new File("C:\\Users\\achhe\\Pictures\\Screenshots\\Selenium\\"+datetime+".png"));
    }
}
