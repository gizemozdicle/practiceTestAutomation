import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;


public class ContactPage {
    WebDriver driver;

    By firstName = By.name("wpforms[fields][0][first]");
    By lastName = By.name("wpforms[fields][0][last]");

    By userEmail = By.xpath("//input[@type='email']");

    By userComment = By.name("wpforms[fields][2]");

    By clickSignButton = By.xpath("//button[@type='submit']");

    By controlMessageTitle = By.tagName("p");


    public ContactPage(WebDriver driver) {

        this.driver = driver;
    }

    public void typeFirstName(String firstUserName) {
        driver.findElement(firstName).sendKeys(firstUserName);
    }

    public void typeLastName(String lastUserName) {
        driver.findElement(lastName).sendKeys(lastUserName);
    }

    public void typeUserEmail(String emailAdd) {
        driver.findElement(userEmail).sendKeys(emailAdd);
    }

    public void typeUserComment(String userCommentAdd) {
        driver.findElement(userComment).sendKeys(userCommentAdd);
    }

    public void clickSubmitButton() {
        driver.findElement(clickSignButton).click();
    }

    public void checkMessage(String checkMessageTitle) {
        String textMessageTitle = driver.findElements(controlMessageTitle).get(1).getText();
        assert Objects.equals(textMessageTitle, checkMessageTitle);
    }


}