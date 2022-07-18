import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;


public class BlogPage {

    WebDriver driver;

    By readMoreButton = By.className("more-link");
    By checkMainTitle = By.className("post-title");


    public BlogPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickReadMore() {
        driver.findElements(readMoreButton).get(0).click();
    }

    public void validateTitle(String titleMessage) {
        String checkTitleMessage = driver.findElement(checkMainTitle).getText();
        assert Objects.equals(checkTitleMessage, titleMessage);


    }

}