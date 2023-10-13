package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProjectsPage extends BasePage {
    @FindBy(xpath = "//span[text()='People']")
    private WebElement peopleOption;

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPeoplePresent() {
        return getWait2().until(ExpectedConditions.elementToBeClickable(peopleOption)).isDisplayed();
    }
}
