import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lopublic class FirstTest {
    WebDriver driver;

@BeforeMethod
public void setUp(){
    driver = new ChromeDriver();



}

    @Test
    public void loginTest(){
    driver.get("https://wikipedia.org");
        driver.findElement(By.id(js-link-box-en)).click();
        driver.findElement(By.id(pt-login)).click();

        driver.findElement(By.name(wpName)).click();
        driver.findElement(By.name(wpName)).clear();
        driver.findElement(By.name(wpName)).sendKeys("email@email.com");


    }

    @AfterMethod
    public void tearDown(){
    driver.quit();




    }


}
