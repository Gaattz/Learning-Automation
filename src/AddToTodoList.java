import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToTodoList {
    public static void main(String[] args) throws InterruptedException {
        String [] names = {"Pokhara","Kathmandu","Jomsom"};

        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        WebElement inputBox = driver.findElement(By.tagName("input"));

        for(String name : names){
            inputBox.sendKeys(name);
            inputBox.sendKeys(Keys.RETURN);
            Thread.sleep(3000); //This line holds the page for a bit
        }
        WebElement del = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]/span/i"));
        del.click();
    }
}
