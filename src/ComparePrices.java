import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparePrices {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.walmart.com/ip/Straight-Talk-Apple-iPhone-13-Pro-128GB-Blue-Prepaid-Smartphone-Locked-to-Carrier-Straight-Talk/810776274?athbdg=L1600");
        String price1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div/section/main/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/div/div/div[1]/span/span[2]")).getText();
//        System.out.println(price1);
        Double dprice1 = Double.parseDouble(price1.replaceAll("[$]",""));
//        System.out.println(dprice1);

        driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=iphone+13+pro&_sacat=0");
        String price2 = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[5]/div/div[2]/div[3]/div[1]/span")).getText();
//        System.out.println(price2);
        Double dprice2 = Double.parseDouble(price2.replaceAll("[$]",""));
//        System.out.println(dprice2);

        if (dprice1<dprice2){
            System.out.println("Buy from Walmart. It costs " + dprice1);
        }else if (dprice2<dprice1){
            System.out.println("Buy from eBay. It costs " + dprice2);
        }else {
            System.out.println("Both cost the same on Walmart and eBay.");
        }
    }
}
