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


    public static void loadPropFile() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\RR\\craiglist\\craiglist\\src\\test\\data.properties");
        prop.load(fis);

    }

    @BeforeTest
    public void setUp() throws IOException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loadPropFile();
    }

    @AfterTest
    public void tearDown(){
       if (driver != null) {
          driver.quit();
       }
    }
//    public void navigateUrl() {
//        driver.get(prop.getProperty("url"));
//    }
//
//    public void search() {
//        driver.findElement(SearchPage.searchField).sendKeys(prop.getProperty("item") + "\n");
//    }
//
//    public void assertTitle() {
//        Assert.assertEquals(SearchPage.title, driver.getTitle());
//    }
//
//    //    public void name() {
////        driver.get(dataFileTest());
////    }
////
//    public  void offerLists1(){
//        driver.findElement(offerLists);
//
//    }
}



