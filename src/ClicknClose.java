import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClicknClose {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement click1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        click1.click();
        Thread.sleep(5000);
        WebElement click2 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[1]/button"));
        click2.click();
    }
}
