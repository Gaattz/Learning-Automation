import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceDisplay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/s?k=iphone+13&crid=30OJ0DS1U2A0T&sprefix=iphone+13%2Caps%2C107&ref=nb_sb_noss_1");

        String price1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span/span[2]/span[2]")).getText();
        System.out.println(price1);

//        Double dprice = price1.replace(Double.parseDouble(dprice));
//        System.out.println(dprice);
    }
}
