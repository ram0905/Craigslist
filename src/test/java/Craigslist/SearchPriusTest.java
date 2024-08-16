package Craigslist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;



public class SearchPriusTest extends BaseTest{



    @Test
    public void Searching() throws InterruptedException {
        //		enter searching Data
        driver.get("https://tampa.craigslist.org/search/cta?");
        Assert.assertEquals("tampa bay cars & trucks - craigslist", driver.getTitle());
        WebElement searchField = driver.findElement(By.xpath("//input[@enterkeyhint='search']"));
        searchField.sendKeys("Prius" + "\n");
        Thread.sleep(3000);


        List<WebElement> carList = driver.findElements(By.xpath("//span[contains(text(),'Prius')]"));
        for ( int i = 0; i < carList.size(); i++){
            Assert.assertTrue(carList.get(i).getText().toLowerCase().contains("prius"));
        }
        System.out.println(carList.size());

    }




}
