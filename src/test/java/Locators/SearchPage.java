package Locators;
import Craigslist.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;


public class SearchPage extends BaseTest {

    public SearchPage(WebDriver driver) {
    }

    String title = "tampa bay cars & trucks - craigslist";
    By searchField = (By.xpath("//input[@enterkeyhint='search']"));
    By offerLists = (By.xpath("//span[contains(text(),'Prius')]"));

    public void navigateUrl() throws IOException {
        loadPropFile();
        driver.get(prop.getProperty("url"));
    }

    public void search() {
        driver.findElement(searchField).sendKeys(prop.getProperty("item") + "\n");
    }

    public void assertTitle() {
        Assert.assertEquals(title, driver.getTitle());
    }


//    public void name() {
//        driver.get(dataFileTest());
//    }
//
        public  void offerLists1(){
            driver.findElement(offerLists);

        }
//
}
//








