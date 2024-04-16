package BookstoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    public WebDriver driver;
    @Test
    public void loginPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//label[text()='Enter Email']/following::input"));
        element.sendKeys("saragadam.neeraja@bridgelabz.com");
        WebElement element1 = driver.findElement(By.id("password"));
        element1.sendKeys("Pass@123");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

    }
}
