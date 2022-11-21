import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
  //  public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @BeforeMethod
    public void setup() throws InterruptedException {

        System.getProperty("user.dir" + "src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://google.com/ncr");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void teardown() {

        driver.quit();
    }

}
