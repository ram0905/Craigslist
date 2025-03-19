package Locators;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.io.IOException;
import java.util.List;
import static org.openqa.selenium.By.xpath;

public class SearchPage extends BaseTest {

    public SearchPage(WebDriver driver) throws IOException {
        loadPropFile();
    }

    private static final String title = "tampa bay cars & trucks for sale - craigslist";
    private static final By searchField = (xpath("//input[@enterkeyhint='search']"));
    private static final By offerLists = (xpath("//span[contains(text(),'Prius')]"));

    public void search() {
        driver.findElement(searchField).sendKeys(prop.getProperty("item") + "\n");
    }

    public void assertTitle() {
        Assert.assertEquals(driver.getTitle(), title);
    }

    public void validOffers() {
        List<WebElement> carList = driver.findElements(offerLists);
        for (WebElement list : carList) {
            Assert.assertTrue(list.getText().toLowerCase().contains(prop.getProperty("item")));
        }
        System.out.println("Total found  " + carList.size());
    }
}
