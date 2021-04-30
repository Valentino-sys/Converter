import org.openqa.selenium.WebDriver;

public class MainTitlePage {
    WebDriver driver;

    public MainTitlePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean atMainPage() {
        if (driver.getTitle().equals("Recent updates | Goodreads")) {
            return true;
        } else {
            return false;
        }
    }

    public void quit() {
        driver.quit();
    }
}
