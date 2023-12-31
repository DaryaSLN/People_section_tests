package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    private WebDriver driver;

    @BeforeMethod
    protected void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("http://164.90.232.254/login");
    }

    @AfterMethod
    protected void afterMethod() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }

}
