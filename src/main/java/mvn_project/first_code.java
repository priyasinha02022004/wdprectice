package mvn_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_code {
    public static void main(String[] args)throws Exception{

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("ti6dpd")).sendKeys((""), Keys.ENTER);
        Thread.sleep(9000);
        //driver.quit();
    }
}
