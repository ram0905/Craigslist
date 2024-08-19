package Craigslist;
import Locators.SearchPage;
import org.testng.annotations.Test;
import java.io.IOException;


public class SearchPriusTest extends BaseTest{

    @Test
    public void Searching() throws IOException, InterruptedException {
//        loadPropFile();
        SearchPage searchPage = new SearchPage(driver);

        searchPage.navigateUrl();
        searchPage.assertTitle();
//        searchPage.searchElement();
        searchPage.search();
        Thread.sleep(5000);



//          List<WebElement> carList = driver.findElements(By.xpath("//span[contains(text(),'Prius')]"));
//          List<WebElement> carList = searchPage.offerLists1();
//        for ( int i = 0; i < searchPage.offerLists1().size(); i++){
//            Assert.assertTrue(searchPage.offerLists1().get(i).getText().toLowerCase().contains("prius"));
//        }
//        System.out.println(searchPage.offerLists1());
//
    }




}
