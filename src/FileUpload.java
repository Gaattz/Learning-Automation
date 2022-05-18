import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        driver.manage().window().maximize(); //This command makes the window full screen
        driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).click();

        Thread.sleep(3000);
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.findElement(By.name("filename")).sendKeys("C:/hello/screenshot/flutter.png");
    }
}
