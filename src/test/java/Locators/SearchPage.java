package Locators;
import Craigslist.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;


public class SearchPage extends BaseTest {

//    public static WebDriver driver;

    public  SearchPage(WebDriver driver) {
    }


//    String baseUrl = "https://tampa.craigslist.org/search/cta?";
//        String searchItem = "Prius" + "\n";
static By searchField = (By.xpath("//input[@enterkeyhint='search']"));
//        By offerLists = (By.xpath("//span[contains(text(),'Prius')]"));
         String title = "tampa bay cars & trucks - craigslist";

        public void navigateUrl () throws IOException {
            loadPropFile();
        driver.get(prop.getProperty("url"));
        }

        public static void search () {
            driver.findElement(searchField).sendKeys(prop.getProperty("item") + "\n");
        }

//        public static void searchElement () {
//        driver.findElements(searchField);
//        }
//
//        public void name(){
//            driver.get(dataFileTest());
//        }
//
//        public void offerLists1(){
//            driver.findElements(offerLists);
//        }
//

//
            public void assertTitle () {
                Assert.assertEquals(title, driver.getTitle());
            }

        }





