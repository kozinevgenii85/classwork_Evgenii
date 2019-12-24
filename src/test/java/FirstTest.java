import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstTest extends TestBase {






    @Test
    public  void openWikipediaTest() throws InterruptedException {
        openSite("https://wikipedia.org/");
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys("Java");

        driver.findElement(By.className("svg-search-icon")).click();

    }












}

