import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectfromDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(3000);
        Select opt1 = new Select(driver.findElement(By.id("dropdowm-menu-1")));
        opt1.selectByIndex(2);
        Thread.sleep(3000);
        Select opt2 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
        opt2.selectByIndex(3);
        Thread.sleep(3000);
        Select opt3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
        opt3.selectByIndex(1);
        Thread.sleep(3000);

        WebElement check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
        check1.click();
        Thread.sleep(3000);
        WebElement check2 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[4]"));
        check2.click();
        Thread.sleep(3000);
        WebElement check3 = driver.findElement(By.name("vegetable"));
        check3.click();
        Thread.sleep(3000);
        Select opt4 = new Select(driver.findElement(By.id("fruit-selects")));
        opt4.selectByIndex(3);
        Thread.sleep(5000);
        driver.close();
    }
}
