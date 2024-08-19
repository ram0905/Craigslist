package Craigslist;
import Locators.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;


public class SearchPriusTest extends BaseTest{

    @Test
    public void Searching() throws IOException, InterruptedException {

        SearchPage searchPage = new SearchPage(driver);
        searchPage.navigateUrl();
        searchPage.assertTitle();
//        searchPage.offerLists1();
        searchPage.search();
        Thread.sleep(5000);



          List<WebElement> carList = driver.findElements(By.xpath("//span[contains(text(),'Prius')]"));
//          List<WebElement> carList = driver.get(offerLists1());
        for ( int i = 0; i < carList.size(); i++){
            Assert.assertTrue(carList.get(i).getText().toLowerCase().contains("prius"));
        }
        System.out.println(carList.size());

    }
}
