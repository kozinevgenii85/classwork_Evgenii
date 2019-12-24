import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiLogIn {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();

    }


    @Test
    public void loginTest(){
        System.out.println("Browser opened");


    }

    @AfterMethod
    public void tearDown(){

    }





}


