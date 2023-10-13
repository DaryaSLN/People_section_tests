package model;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectsPage extends BasePage {
    @FindBy(xpath = "//span[text()='People']")
    private WebElement peopleOption;

    @FindBy(xpath = "//h4[text()='Projects']")
    private WebElement projectsTitle;

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPeoplePresent() {
        getWait2().until(ExpectedConditions.visibilityOf(projectsTitle));
        try {
            return peopleOption.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
