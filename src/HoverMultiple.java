import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class HoverMultiple {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        driver.manage().window().maximize(); //This command makes the window full screen

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"scrolling-around\"]/div/div[1]/h1")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        Thread.sleep(3000);
//        WebElement ele = driver.findElement(By.xpath("//*[@id=\"zone2\"]"));
        WebElement hoverIn = driver.findElement(By.id("zone2-entries"));
        WebElement hoverOut = driver.findElement(By.xpath("//*[@id=\"nav-container\"]/footer/div"));
        Actions action = new Actions(driver);

        Thread.sleep(3000);
        for (int i=1; i<=5; i++) {
            action.moveToElement(hoverIn).perform();
            action.moveToElement(hoverOut).perform();
            Thread.sleep(1500);
        }
    }
}
