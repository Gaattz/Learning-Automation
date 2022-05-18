import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Accordian {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        driver.manage().window().maximize(); //This command makes the window full screen

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"page-object-model\"]")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
        Thread.sleep(3000);

        WebElement clck = driver.findElement(By.id("manual-testing-accordion"));
        clck.click();
        Thread.sleep(3000);
        clck.click();

    }
}
