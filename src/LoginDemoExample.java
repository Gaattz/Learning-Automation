import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");

        WebElement user = driver.findElement(By.id("mui-1"));
        WebElement pass = driver.findElement(By.id("mui-2"));
        user.sendKeys("admin");
        pass.sendKeys("password");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
    }
}
