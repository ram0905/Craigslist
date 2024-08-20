package Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver = new ChromeDriver();
    public static Properties prop = null;

    public static void loadPropFile() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\RR\\Craigslist\\src\\test\\data.properties");
        prop.load(fis);
    }

    public void mouseScroll(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
    }

    @BeforeTest
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown(){
        if (driver != null) {
            driver.quit();
       }
    }


}



