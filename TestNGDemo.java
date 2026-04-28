import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void loginTest() throws Exception {

        System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("file:///C:/Users/misti/OneDrive/Documents/Desktop/selenium%20test%202/login.html");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(2000);

        String result = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(result, "Login Successful");

        System.out.println("TEST PASSED");

        driver.quit();
    }
}