import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartBrowser {
    private static ChromeDriver chromeDriver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void RunURL() {
        chromeDriver.get("https://www.lambdatest.com/");
        Assert.assertTrue(false);
    }

    @AfterTest
    public void crash() {
        chromeDriver.close();
    }
}
