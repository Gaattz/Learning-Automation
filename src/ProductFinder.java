import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ProductFinder {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Page-Object-Model/products.html");

        List<WebElement> elements = driver.findElements(By.className("sub-heading"));
        int total = 0;
        for (WebElement e : elements){
            System.out.println(e.getText());
            total = total+1;
        }
        System.out.println("Total no of items "+total);
    }
}
