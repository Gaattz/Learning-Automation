import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class HeadingFinder {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com");

        driver.manage().window().maximize(); //This command makes the window full screen

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"page-object-model\"]/div/div[1]/h1")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        List<WebElement> elements = driver.findElements(By.className("sub-heading"));
        for (WebElement e : elements){
            System.out.println(e.getText());
        }
    }
}
