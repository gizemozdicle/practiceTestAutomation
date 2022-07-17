import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestE2E {


    @Test
    public void e2eTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        LoginPage login = new LoginPage(driver);

        login.typeUserName("student");
        login.password("Password123");
        login.submitButton();
        login.checkSuccessMessageTitle("Logged In Successfully");
        login.checkSuccessMessageContext("Congratulations student. You successfully logged in!");

        driver.get("https://practicetestautomation.com/contact/");

        ContactPage contact = new ContactPage(driver);

        contact.typeFirstName("gizem");
        contact.typeLastName("cingoz");
        contact.typeUserEmail("gizem@hotmail.com");
        contact.typeUserComment("tryRunTest");
        contact.clickSubmitButton();
        contact.checkMessage("Thanks for contacting us! We will be in touch with you shortly.");





        //driver.close();
    }
}
