package Craigslist;
import Base.BaseTest;
import Locators.SearchPage;
import org.testng.annotations.Test;
import java.io.IOException;

public class SearchPriusTest extends BaseTest {

    SearchPage searchPage = new SearchPage(driver);

    public SearchPriusTest() throws IOException {
    }

    @Test
    public void SearchingItem() throws IOException, InterruptedException {
        navigateUrl();
        searchPage.assertTitle();
        searchPage.search();
        Thread.sleep(1000);
        mouseScroll();
        screenshot();
        Thread.sleep(1000);
    }

    @Test
    public void ValidationResults() {
        searchPage.validOffers();
    }
}
