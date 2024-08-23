package Craigslist;
import Base.BaseTest;
import Locators.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;


public class SearchPriusTest extends BaseTest {

    SearchPage searchPage = new SearchPage(driver);

    @Test
    public void Searching() throws IOException, InterruptedException {

        searchPage.navigateUrl();
        searchPage.assertTitle();
//        searchPage.offerLists1();
        searchPage.search();
        Thread.sleep(5000);
        mouseScroll();

    }

    @Test
    public void Validation() throws IOException {

//        WebElement theData = driver.findElement(By.xpath("//span[contains(text(),'Prius')]"));
//        System.out.println(theData.getText());


//        System.out.println(driver.findElements(By.xpath("//span[contains(text(),'Prius')]")));
//            List<WebElement> carList = driver.findElements(By.xpath("//span[contains(text(),'Prius')]"));
//            List<WebElement> carList = driver.findElements(By.xpath("//a[@class='cl-app-anchor text-only posting-title']"));
            List<WebElement> carList = searchPage.offerLists1();
            for (int i = 0; i < carList.size(); i++) {
                Assert.assertTrue(carList.get(i).getText().toLowerCase().contains("prius"));
            }
            System.out.println(carList.size());
//        System.out.println(driver.findElements(By.xpath("//a[@class='cl-app-anchor text-only posting-title']")));
//        System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Prius')]")).getAttribute("label"));


        screenshot();
    }
}
