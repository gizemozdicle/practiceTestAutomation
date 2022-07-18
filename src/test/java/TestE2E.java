import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestE2E {


    @Test
    public void e2eTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        LoginPage login = new LoginPage(driver);
        ContactPage contact = new ContactPage(driver);
        BlogPage blog = new BlogPage(driver);


        login.typeUserName("student");
        login.password("Password123");
        login.submitButton();
        login.checkSuccessMessageTitle("Logged In Successfully");
        login.checkSuccessMessageContext("Congratulations student. You successfully logged in!");

        driver.get("https://practicetestautomation.com/contact/");


        contact.typeFirstName("gizem");
        contact.typeLastName("cingoz");
        contact.typeUserEmail("gizem@hotmail.com");
        contact.typeUserComment("tryRunTest");
        contact.clickSubmitButton();

        Thread.sleep(5000);
        contact.checkMessage("Thanks for contacting us! We will be in touch with you shortly.");

        driver.get("https://practicetestautomation.com/blog/");

        blog.clickReadMore();
        blog.validateTitle("Hard and Soft Assertions in test automation");


        driver.close();
    }
}
