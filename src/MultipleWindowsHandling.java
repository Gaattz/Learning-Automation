import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class MultipleWindowsHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        driver.manage().window().maximize(); //This command makes the window full screen

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"button-clicks\"]/div/div[1]/h1")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));
        Thread.sleep(2000);
        WebElement click1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        click1.click();
        Thread.sleep(5000);
        WebElement click2 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[1]/button"));
        click2.click();
    }
}