package Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver = new ChromeDriver();
    public static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");

    public static void loadPropFile() throws IOException {
        FileInputStream fis = new FileInputStream(projectPath +"/src/test/data.properties");
        prop.load(fis);
    }

    public void mouseScroll(){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
    }

    public void screenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils .copyFile(file, new File(".src/Screenshots/Image.jpeg"));

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



