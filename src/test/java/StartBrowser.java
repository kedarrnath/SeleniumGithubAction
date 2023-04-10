import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartBrowser {
    private static ChromeDriver chromeDriver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        chrome_options.addArguments("--no-sandbox");
        chrome_options.addArguments("--disable-dev-shm-usage");
        chromeDriver = new ChromeDriver(chrome_options);
    }

    @Test
    public void RunURL() {
        chromeDriver.get("https://www.lambdatest.com/");
    }

    @AfterTest
    public void crash() {
        chromeDriver.close();
    }
}
