import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenWebsite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?msclkid=90486a55cfa211ec95a4911af27712ad");

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("digital camera");
        searchbox.submit();
    }
}
