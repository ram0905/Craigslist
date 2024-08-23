package Locators;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.IOException;
import java.util.List;

import static org.openqa.selenium.By.xpath;


public class SearchPage extends BaseTest {

    public SearchPage(WebDriver driver) {
    }

    @FindBy (xpath = "//input[@enterkeyhint='search']")
            private WebElement SearchField;

    @FindBy (xpath = "//span[contains(text(),'Prius')]")
            private WebElement OfferLists;



    String title = "tampa bay cars & trucks - craigslist";
    By searchField = (xpath("//input[@enterkeyhint='search']"));
    By offerLists = (xpath("//span[contains(text(),'Prius')]"));

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



//        public void name() {
//        driver.get(dataFileTest());
//    }
//
    public List<WebElement> offerLists1(){
        return driver.findElements(offerLists);

    }
}
