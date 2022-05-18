import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAmazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
//        System.out.println(driver.getTitle()); //prints the title of the page
//        System.out.println(driver.getCurrentUrl()); //prints the url of the page
//        System.out.println(driver.getPageSource()); //gives you all the code for the page

        WebElement searchbox = driver.findElement(By.name("twotabsearchtextbox"));
        searchbox.sendKeys("digital camera");
        searchbox.submit();
    }
}

//Assignment
//Open Amazon.com and save its title to sitename.txt file
//String sitename = driver.getTitle();
