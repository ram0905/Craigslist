package Locators;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;


public class SearchPage extends BaseTest {


    public SearchPage(WebDriver driver) throws IOException {
        loadPropFile();
    }

    String title = "tampa bay cars & trucks - craigslist";
    By searchField = (By.xpath("//input[@enterkeyhint='search']"));
    By offerLists = (By.xpath("//span[contains(text(),'Prius')]"));
    By SearchButton = (By.xpath("//button[@type='submit']"));

    public void navigateUrl() throws IOException {
        driver.get(prop.getProperty("url"));
    }

    public void search() {
//        driver.findElement(searchField).sendKeys(prop.getProperty("item") + "\n");
        driver.findElement(searchField).sendKeys(prop.getProperty("item"));

    }

    public void assertTitle() {
        Assert.assertEquals(title, driver.getTitle());
    }
//
    public void clickSearchBtn() {
        driver.findElement(SearchButton).click();
    }
////
        public void offerLists1(){
            driver.findElement(offerLists);

        }

}
//








