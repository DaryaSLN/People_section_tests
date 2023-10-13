package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='session_email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='session_password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Log In']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public ProjectsPage loginAsOwner() {
        getWait2().until(ExpectedConditions.visibilityOf(email)).sendKeys(LoginUtils.getOwnerEmail());
        password.sendKeys(LoginUtils.getOwnerPassword());
        loginButton.click();
        return new ProjectsPage(getDriver());
    }
}
