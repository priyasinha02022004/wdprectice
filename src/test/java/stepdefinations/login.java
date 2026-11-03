package stepdefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class login {
        WebDriver driver;
        WebDriverWait wait;
    @Given("Goto the loginpage")
    public void goto_the_loginpage() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("enter correct username and password")
    public void enter_correct_username_and_password() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

    }
    @And("click on the login button")
    public void click_on_the_login_button() {
        driver.findElement(By.tagName("button")).click();

    }
    @Then("login successfull")
    public void login_successfull() {
        String loginpageurl=driver.getCurrentUrl();
        Assert.assertNotEquals(loginpageurl,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
    @And("profile picture display")
    public void profile_picture_display() {
        System.out.println("displayed");

    }
}
