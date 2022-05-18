import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactForm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement fname = driver.findElement(By.name("first_name"));
        WebElement lname = driver.findElement(By.name("last_name"));
        WebElement eadd = driver.findElement(By.name("email"));
        WebElement comm = driver.findElement(By.name("message"));

        fname.sendKeys("Amit");
        lname.sendKeys("Chhetri");
        eadd.sendKeys("amitbc87@gmail.com");
        comm.sendKeys("This is a random comment.");

        //This code is to submit the contact us form.
        WebElement sub = driver.findElement(By.cssSelector("input[type ='submit']"));
        sub.click();
        //This code is to reset the contact us form.
//        WebElement res = driver.findElement(By.cssSelector("input[type = 'reset']"));
//        res.click();
    }
}
