package Base;
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

    public static void loadPropFile() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\RR\\Craigslist\\src\\test\\data.properties");
        prop.load(fis);
    }
}



