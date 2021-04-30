import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    LoginPage loginPage;
    MainTitlePage mainTitlePage;

    @Given("I open login page")
    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Valentin\\Desktop\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();
        loginPage = new LoginPage(webDriver);
        mainTitlePage = new MainTitlePage(webDriver);
        loginPage.openLoginPage();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("I enter 'email'")
    public void enterEmail() {
        loginPage.enterEmail("valentinolariu2017@gmail.com");
    }

    @When("I enter 'password'")
    public void enterPassword() {
        loginPage.enterPassword("valentin555");
    }

    @When("I click the button Sign in")
    public void clickButtonSignIn() {
        loginPage.clickButtonSignIn();
    }

    @Then("I am on main page")
    public void mainPageTest() {
        Assertions.assertTrue(mainTitlePage.atMainPage());
    }

    public void quit() {
        mainTitlePage.quit();
    }
}


