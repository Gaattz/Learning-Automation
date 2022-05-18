import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;

public class TitleText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String sitename = driver.getTitle(); //This line saves the title in a variable
        try{
            FileWriter myFile = new FileWriter("sitename.txt");
            myFile.write(sitename); //This line writes the data saved in the variable into the text file
            myFile.close();
            System.out.println("File successfully created with title for Amazon.");
        }catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
