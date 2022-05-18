import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUserPass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");

        WebElement searchbox1 = driver.findElement(By.id("mui-1"));
        searchbox1.sendKeys("admin");
        WebElement searchbox2 = driver.findElement(By.id("mui-2"));
        searchbox2.sendKeys("password");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
    }
}
